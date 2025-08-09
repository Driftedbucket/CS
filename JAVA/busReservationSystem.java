
import java.sql.*;
import java.util.Scanner;

public class busReservationSystem {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=bus_reservation;encrypt=true;trustServerCertificate=true";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                    Scanner scanner = new Scanner(System.in)) {
                
                createTables(conn);
    
                while (true) {
                    System.out.println("\n1. Add Bus");
                    System.out.println("2. View Buses");
                    System.out.println("3. Book Seat");
                    System.out.println("4. View Bookings");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
    
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
    
                    switch (choice) {
                        case 1:
                            addBus(conn, scanner);
                            break;
                        case 2:
                            viewBuses(conn);
                            break;
                        case 3:
                            bookSeat(conn, scanner);
                            break;
                        case 4:
                            viewBookings(conn);
                            break;
                        case 5:
                            System.out.println("Thank you for using the Bus Reservation System!");
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void createTables(Connection conn) throws SQLException {
        String createBusesTable = "IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='buses' AND xtype='U') " +
                "CREATE TABLE buses " +
                "(id INT IDENTITY(1,1) PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "capacity INT)";

        String createBookingsTable = "IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='bookings' AND xtype='U') " +
                "CREATE TABLE bookings " +
                "(id INT IDENTITY(1,1) PRIMARY KEY, " +
                "bus_id INT, " +
                "passenger_name VARCHAR(50), " +
                "seat_number INT, " +
                "FOREIGN KEY (bus_id) REFERENCES buses(id))";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createBusesTable);
            stmt.execute(createBookingsTable);
        }
    }

    private static void addBus(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter bus name: ");
        String name = scanner.nextLine();
        System.out.print("Enter bus capacity: ");
        int capacity = scanner.nextInt();

        String sql = "INSERT INTO buses (name, capacity) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, capacity);
            pstmt.executeUpdate();
            System.out.println("Bus added successfully!");
        }
    }

    private static void viewBuses(Connection conn) throws SQLException {
        String sql = "SELECT * FROM buses";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("Bus ID: %d, Name: %s, Capacity: %d\n",
                        rs.getInt("id"), rs.getString("name"), rs.getInt("capacity"));
            }
        }
    }

    private static void bookSeat(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter bus ID: ");
        int busId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();

        String sql = "INSERT INTO bookings (bus_id, passenger_name, seat_number) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, busId);
            pstmt.setString(2, passengerName);
            pstmt.setInt(3, seatNumber);
            pstmt.executeUpdate();
            System.out.println("Seat booked successfully!");
        }
    }

    private static void viewBookings(Connection conn) throws SQLException {
        String sql = "SELECT b.id, b.name, bk.passenger_name, bk.seat_number " +
                "FROM bookings bk " +
                "JOIN buses b ON b.id = bk.bus_id";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("Bus: %s, Passenger: %s, Seat: %d\n",
                        rs.getString("name"), rs.getString("passenger_name"), rs.getInt("seat_number"));
            }
        }
    }
}

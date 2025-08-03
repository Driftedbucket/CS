import java.sql.*;
import java.util.Scanner;

public class ChurchMinistryApp {
    private static final String CONNECTION_URL = "jdbc:sqlserver://localhost:1433;databaseName=ChurchMinistry;user=your_username;password=your_password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL)) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nChurch Ministry System");
                System.out.println("1. Sign up member");
                System.out.println("2. List ministries");
                System.out.println("3. View ministry sign-ups");
                System.out.println("4. Generate ministry report");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        signUpMember(conn, scanner);
                        break;
                    case 2:
                        listMinistries(conn);
                        break;
                    case 3:
                        viewMinistrySignUps(conn, scanner);
                        break;
                    case 4:
                        generateMinistryReport(conn);
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void signUpMember(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter member name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter member phone: ");
        String memberPhone = scanner.nextLine();
        System.out.print("Enter ministry name: ");
        String ministryName = scanner.nextLine();

        String sql = "{CALL sp_SignUpMember(?, ?, ?)}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setString(1, memberName);
            stmt.setString(2, memberPhone);
            stmt.setString(3, ministryName);
            stmt.execute();
            System.out.println("Member signed up successfully!");
        }
    }

    public static void listMinistries(Connection conn) throws SQLException {
        String sql = "{CALL sp_ListMinistries}";
        try (CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {
            System.out.println("\nAvailable Ministries:");
            while (rs.next()) {
                System.out.println(rs.getInt("MinistryID") + ": " + rs.getString("Name"));
            }
        }
    }

    public static void viewMinistrySignUps(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter ministry ID: ");
        int ministryId = scanner.nextInt();

        String sql = "{CALL sp_ViewMinistrySignUps(?)}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setInt(1, ministryId);
            try (ResultSet rs = stmt.executeQuery()) {
                System.out.println("\nSign-ups for Ministry ID " + ministryId + ":");
                while (rs.next()) {
                    System.out.println("Name: " + rs.getString("MemberName") +
                                       ", Phone: " + rs.getString("MemberPhone") +
                                       ", Date: " + rs.getTimestamp("SignUpDate"));
                }
            }
        }
    }

    public static void generateMinistryReport(Connection conn) throws SQLException {
        String sql = "{CALL sp_GenerateMinistryReport}";
        try (CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {
            System.out.println("\nMinistry Participation Report:");
            System.out.println("Ministry Name | Total Sign-ups | Earliest Sign-up | Latest Sign-up");
            System.out.println("--------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-14s | %-14d | %-16s | %s%n",
                                  rs.getString("MinistryName"),
                                  rs.getInt("TotalSignUps"),
                                  rs.getTimestamp("EarliestSignUp"),
                                  rs.getTimestamp("LatestSignUp"));
            }
        }
    }
}
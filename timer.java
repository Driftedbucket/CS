import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int timeInSeconds = scanner.nextInt();
        scanner.close();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = timeInSeconds;

            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time left: " + countdown + " seconds");
                    countdown--;
                } else {
                    System.out.println("Time's up!");
                    timer.cancel(); // Stop the timer
                }
            }
        };

        // Schedule the task to run every 1 second (1000 ms)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

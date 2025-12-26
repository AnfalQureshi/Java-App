import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        String name = "Mohammad Anfal";

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format date and time
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(formatter);

        // Get hour for greeting
        int hour = now.getHour();
        String greeting;

        if (hour < 12) {
            greeting = "Good Morning";
        } else if (hour < 17) {
            greeting = "Good Afternoon";
        } else if (hour < 21) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        // Output
        System.out.println(greeting + ", " + name + "!");
        System.out.println("Current Date & Time: " + dateTime);
    }
}

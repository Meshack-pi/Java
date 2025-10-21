import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
    public static void main(String[] args) {
        // 1️⃣ Create a Date object representing the current date and time
        Date now = new Date();
        System.out.println(now);

        // 2️⃣ Define a date format pattern
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // 3️⃣ Format the date into a readable string
        String formattedDate = formatter.format(now);

        // 4️⃣ Print the formatted date
        System.out.println("Current Date and Time: " + formattedDate);
    }

}
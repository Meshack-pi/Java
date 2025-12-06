import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = formatter.format(now);
        System.out.println("The date today is: "+ formatedDate);
    }
}

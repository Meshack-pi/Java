
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewDate {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDate = formatter.format(now);
        System.out.println("The time now is : "+formatedDate);
    }
    
}

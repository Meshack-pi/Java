import java.util.Scanner;

public class Scannerusage {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a boolean value: ");
        boolean boolValue = scanner.nextBoolean();

        
        System.out.print("Please enter an integer value: ");
        int intValue = scanner.nextInt();

        
        System.out.print("Please enter a double value: ");
        double doubleValue = scanner.nextDouble();

        
        System.out.print("Please enter a string value: ");
        String stringValue = scanner.next();

        
        System.out.println("\nYou entered:");
        System.out.println("boolean value: " + boolValue);
        System.out.println("integer value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("string value: " + stringValue);

        
        scanner.close();
    }
}

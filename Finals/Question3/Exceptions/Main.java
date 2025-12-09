import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a,b,output;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        a= input.nextInt(); //input for the first number
        System.out.println("Enter the value for b: ");
        b = input.nextInt();
        try {
            output= a/b;
            System.out.println("The output of the division is: "+output);
            
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero. Enter a valid number!");
        } finally{
            System.out.println("Operation complete!");
        }
    }
}
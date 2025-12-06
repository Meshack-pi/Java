
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//takes input from the user - from the keyboard
        //different data types have different ways of being read by the scanner classs
        //reading a string a single word
        System.out.println("Enter your name here: "); 
        String name = input.next(); //this reads any text and stops at a space where ther is a space it stops

        //Reading a full line of text without ignoring the spaces
        System.out.println("Enter your full name: ");
        //must consume the left over new line first
        input.nextLine();
        String fullname = input.nextLine(); //this reads all the text including the spaces

        //Reading an integer
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        //Reading a double input
        System.out.println("Enter your salary: "); 
        double salary = input.nextDouble();

        //Summary 
        System.out.println("Here is a summary of your deatails: ");
        System.out.println("Your single name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your full name is: "+ fullname);
        System.out.println("Your salary is: "+salary);
        input.close();//must close the scanner after usage always
    }
}

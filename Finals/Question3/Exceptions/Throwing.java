import java.util.Scanner;

public class Throwing {
        //a simple system to check that age is 18 years old
        //a user can enter an age below 18 so the registration should stop and error must be shown
        // Check the age inside my method should be less than 18 then manually throw an exeption
        //we decide when the error ot occur; it is our own rule
        // eg throw new IllegalArgumentException("You must be 18 or older1")

    public static void validateAge(int age) throws IllegalArgumentException{ //throws is placed in method delcaration to indicate that the method may throw an exception
        if(age<18){
            //we will manually throw an exception
            throw new IllegalArgumentException("You must be 18 or older");
            //throw is used inside a method to manually trigger an exception when there is an error placed by the dev

        }
        System.out.println("Age accepted. You can register!");
    }

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you age: ");
        age = input.nextInt();

        //the try catch block is used to handle the exception thrown by the method
        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            //Handle the exception here
            System.out.println("Registration failed: "+e.getMessage());
        } finally{
            System.out.println("Validation process completed!");
            //This runs no matter what happens
        }
    }
    
}

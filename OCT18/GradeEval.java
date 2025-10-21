
import java.util.Scanner;


public class GradeEval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create the scanner object
        System.out.println("Enter your marks: ");
        if(!input.hasNext()){
            System.out.println("Invalid Marks");
            input.close();
            return;
        }
        int studentMarks = input.nextInt();//read an integer input
        if(studentMarks<0||studentMarks>100){
            System.out.println("Invalid Marks");
            input.close();
            return;
        }
        String grade;
        if(studentMarks>=90){
            grade = "A";
        } else if(studentMarks>=80){
            grade = "B";
        } else if(studentMarks>=70){
            grade = "C";
        } else if(studentMarks>=60){
            grade = "D";
        } else if(studentMarks>=50){
            grade = "E";
        } else{
            grade = "F";
        }
        System.out.println("Your grade is: "+ grade);
        input.close();
    }
}

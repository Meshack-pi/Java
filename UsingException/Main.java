import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String inputStr;
        int age;
        inputStr = JOptionPane.showInputDialog("What is your age?");
        try {
            age = Integer.parseInt(inputStr);
            System.out.println("Your age is: "+ age);
        } catch (Exception e) {
            System.err.println("You did not enter an integer!");
        } finally{
            System.out.println("This is the finally part!");
        }
    }
}

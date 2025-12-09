import javax.swing.JOptionPane;

public class SimpleGui{
    public static void main(String[] args) {
        // Two integers
        int num1 = 25;
        int num2 = 34;

        // Calculate sum
        int sum = num1 + num2;

        // Show sum in a dialog
        JOptionPane.showMessageDialog(
                null,
                "The sum is: " + sum,
                "Sum of Two Integers",JOptionPane.INFORMATION_MESSAGE
        );
    }
}

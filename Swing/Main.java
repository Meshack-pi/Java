
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buttons");
        frame.setSize(300,200);
        frame.setLayout(null);
        JButton button1 = new JButton("Click Me!");
        button1.setBounds(80,50,120,30);
        frame.add(button1);
        frame.setLayout(new FlowLayout());
        JButton cancelButton = new JButton("Cancel");
        JButton clearButton = new JButton("Clear");
        JButton deletButton = new JButton("Delete");
        JButton demoButton = new JButton("Demo");
        JButton updateButton = new JButton("Delete");
        JButton selectButton= new JButton("Select");
        JButton choosButton = new JButton("Choose");
        JButton emptyButton = new JButton("Empty");
        frame.add(emptyButton);
        frame.add(choosButton);
        frame.add(selectButton);
        frame.add(updateButton);
        frame.add(demoButton);
        frame.add(cancelButton);
        frame.add(clearButton);
        frame.add(deletButton);
        frame.setBackground(Color.blue);
        frame.setVisible(true);
    }    
}

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Point;

public class Lab2Program1 {

    public static void main(String[] args) {
        JFrame window;
        window = new JFrame();
        
        window.setSize(300, 300);
        window.setTitle("My First Java Program in Lab");
        
        Point position;
        position = new Point(300, 400);
        
        window.setLocation(position);
        window.setVisible(true);
        
        JOptionPane.showMessageDialog(window, "Click OK to close me");
    }
}
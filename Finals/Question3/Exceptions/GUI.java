import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); //a simple layout

        //create the buttons
        JButton helloButton = new JButton("Say hello!");
        JButton byeButton = new JButton("Say Goodbye");

        //action event listener for hello message
        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello!");
            }
        });

        //action event for the goodbye message
        byeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Goodbye!");
            }
        });


        //Add the buttons to the frame
        frame.add(helloButton);
        frame.add(byeButton);
        // show the window set visibility to be true
        frame.setVisible(true);
    }
}
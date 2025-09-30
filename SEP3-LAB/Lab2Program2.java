/*
   Lab 2 Program 2: 
   File: Lab2Program2.java 
*/

import javax.swing.*;

public class Lab2Program2 {

    public static void main(String[] args) {
          
        String fullName;
        String firstName;
	
        String lastName;

        fullName = JOptionPane.showInputDialog(null, "What is your full name? (first and last with space)");

        int spaceIndex = fullName.indexOf(' ');
        firstName = fullName.substring(0, spaceIndex);
        lastName = fullName.substring(spaceIndex + 1);
        
        JOptionPane.showMessageDialog(null, "Your first name is " + firstName);
        JOptionPane.showMessageDialog(null, "Your last name is " + lastName);
    }
}
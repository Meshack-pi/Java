import javax.swing.*;

/** 
 * This class is used to demonstrate the functionality of the MetricConverter
 * class.
 */

class Demo {
    public static void main (String[] args) {
        MetricConverter converter = new MetricConverter( );
        
        double inputInches;
        double centimeters, inches;
        String inputInchesAsString;
        //Get input
        inputInchesAsString = JOptionPane.showInputDialog(null, "Enter inches: ");
        inputInches =  Double.parseDouble(inputInchesAsString);
        //Perform various conversion routines
        centimeters = converter.inchesToCentimeters( inputInches );
        inches = converter.centimetersToInches( centimeters );
        //Display the result
        JOptionPane.showMessageDialog(null,"Input: " + inputInches + " inches is equivalent to " +centimeters   + " centimeters");
        JOptionPane.showMessageDialog(null,"Converting back to inches: " + inches);

        //Feet and inches to centimeters
        String InputFeet;
        String Inputinches;
        InputFeet = JOptionPane.showInputDialog(null,"Enter feet: ");
        Inputinches = JOptionPane.showInputDialog(null,"Enter inches: ");
        double InputFeetc, InputInchesc;
        InputFeetc = Double.parseDouble(InputFeet);
        InputInchesc = Double.parseDouble(Inputinches);
        centimeters = converter.feetAndInchesToCentimeters(InputFeetc, InputInchesc);
        JOptionPane.showMessageDialog(null, "The input feet: "+ InputFeet+" and inches"+ Inputinches + " is equal to: "+ centimeters + "centimeters");
    }    
}

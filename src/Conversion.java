import java.util.ArrayList;
import javax.swing.*;
import java.text.DecimalFormat;

// A class for conversions between different units
public class Conversion {
    private double input; // the input value for the conversion
    private double output; // the output value for the conversion
    private String conversionType; // the type of conversion, e.g. "miles to kilometers"
    static ArrayList<Conversion> conversions = new ArrayList<>(); // a list of all conversions performed

    // constructor for the Conversion class
    public Conversion(double input, double output, String conversionType) {
        this.input = input;
        this.output = output;
        this.conversionType = conversionType;

        // prompt the user for an input value in miles and convert it to kilometers
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value in miles:"));
        MileConverter i = new MileConverter();
        double finalValue = i.convertMtoKm(value);

        // format the output value to one decimal place and display it
        DecimalFormat df = new DecimalFormat("#.#");
        JOptionPane.showMessageDialog(null, value + " mi = " + df.format(finalValue) + " km");

        // create a new Conversion object and add it to the list of conversions
        Conversion newConversion = new Conversion(value, finalValue, "miles to kilometers");
        conversions.add(newConversion);
    }

    // getter method for the input value
    public double getInput() {
        return input;
    }

    // getter method for the output value
    public double getOutput() {
        return output;
    }

    // getter method for the conversion type
    public String getConversionType() {
        return conversionType;
    }

    // override the toString method to display the conversion in a readable format
    @Override
    public String toString() {
        return input + " " + conversionType + " = " + output;
    }

    // print all conversions in the list
    public static void printConversions() {
        for (Conversion c : conversions) {
            System.out.println(c.toString());
        }
    }
}

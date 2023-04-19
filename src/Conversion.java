import java.util.ArrayList;
import javax.swing.*;

import java.text.DecimalFormat;
public class Conversion {
    private double input;
    private double output;
    private String conversionType;

    public Conversion(double input, double output, String conversionType) {
        this.input = input;
        this.output = output;
        this.conversionType = conversionType;
        ArrayList<Conversion> conversions = new ArrayList<>();
        int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in miles:"));
        MileConverter i = new MileConverter();
        double finalValue = i.convertMtoKm(value);
        DecimalFormat df = new DecimalFormat("#.#");
        JOptionPane.showMessageDialog(frame, value + " mi = " + df.format(finalValue) + " km");

        Conversion newConversion = new Conversion(value, finalValue, "miles to kilometers");
        conversions.add(newConversion);


    }

    public double getInput() {
        return input;
    }

    public double getOutput() {
        return output;
    }

    public String getConversionType() {
        return conversionType;
    }

    @Override
    public String toString() {
        return input + " " + conversionType + " = " + output;

        for (Conversion c : conversions) {
            System.out.println(c.toString());
        }

    }
}

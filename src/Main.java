import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Main extends javax.swing.JFrame {

    //Create an ArrayList to store conversions
    private static ArrayList<String> conversions = new ArrayList<String>();


    //Main method
    public static void main(String[] args) {

        //Create a JFrame
        JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Layout
        frame.setPreferredSize(new Dimension(500, 265));

        //Color
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(167, 199, 231));
        frame.add(panel);

        //Button km to mi
        JButton mitoKm = new JButton("Miles to Kilometers");
        mitoKm.setPreferredSize(new Dimension(200, 50));
        mitoKm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in miles:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertMtoKm(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " mi = " + df.format(finalValue) + "km";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, "" + value + " mi = " + df.format(finalValue) + "km");
            }
        });
        panel.add(mitoKm);

        //Button mi to km
        JButton kmtoMi = new JButton("Kilometers to Miles");
        kmtoMi.setPreferredSize(new Dimension(200, 50));
        kmtoMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in kilometers:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertKmtoM(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " km = " + df.format(finalValue) + "mi";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, "" + value + " km = " + df.format(finalValue) + "mi");
            }
        });
        panel.add(kmtoMi);

        //Button C to F
        JButton cToF = new JButton("Celsius to Fahrenheit");
        cToF.setPreferredSize(new Dimension(200, 50));
        cToF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in Celsius:"));
                TempConverter i = new TempConverter();
                double finalValue = i.convertCtoF(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " C = " + df.format(finalValue) + " F";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, value + " C = " + df.format(finalValue) + " F");
            }
        });
        panel.add(cToF);

        //Button F to C
        JButton fToC = new JButton("Fahrenheit to Celsius");
        fToC.setPreferredSize(new Dimension(200, 50));
        fToC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in Fahrenheit:"));
                TempConverter i = new TempConverter();
                double finalValue = i.convertFtoC(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " F = " + df.format(finalValue) + " C";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, value + " F = " + df.format(finalValue) + " C");
            }
        });
        panel.add(fToC);

        //Button lb to kg
        JButton lbtokg = new JButton("Pounds to Kilograms");
        lbtokg.setPreferredSize(new Dimension(200, 50));
        lbtokg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in Pounds:"));
                PoundConverter i = new PoundConverter();
                double finalValue = i.convertPoundstoKg(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " lb = " + df.format(finalValue) + " kg";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, value + " lb = " + df.format(finalValue) + " kg");
            }
        });
        panel.add(lbtokg);

        JButton kgtolb = new JButton("Kilogram to Pounds");
        kgtolb.setPreferredSize(new Dimension(200, 50));
        kgtolb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value in Kilograms:"));
                PoundConverter i = new PoundConverter();
                double finalValue = i.convertKgtoPounds(value);
                DecimalFormat df = new DecimalFormat("#.#");
                String conversion = value + " kg = " + df.format(finalValue) + " lb";
                conversions.add(conversion);
                JOptionPane.showMessageDialog(frame, conversion);
                //JOptionPane.showMessageDialog(frame, value + " kg = " + df.format(finalValue) + " lb");
            }
        });
        panel.add(kgtolb);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component) null);

        JButton history = new JButton("History");
        history.setPreferredSize((new Dimension(200, 50)));
        history.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (conversions.size() <= 0) {
                    JOptionPane.showMessageDialog(frame, "No history yet");
                } else {
                    JOptionPane.showMessageDialog(frame, conversions);


                }
                ;
            }

        });
        panel.add(history);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component) null);
    }
}










import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main extends javax.swing.JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Layout
        frame.setPreferredSize(new Dimension(700,600));

        //Color
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(167,199,231));
        frame.add(panel);

        //Button km to mi
        JButton mitoKm = new JButton("Miles to Kilometers");
        mitoKm.setPreferredSize(new Dimension(200,50));
        mitoKm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in miles:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertMtoKm(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " mi = " + df.format(finalValue) + " km");
            }
        });
        panel.add(mitoKm);

        //Button mi to km
        JButton kmtoMi = new JButton("Kilometers to Miles");
        kmtoMi.setPreferredSize(new Dimension(200,50));
        kmtoMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in kilometers:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertKmtoM(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " km = " + df.format(finalValue) + " mi");
            }
        });
        panel.add(kmtoMi);

        //Button C to F
        JButton cToF = new JButton("Celsius to Fahrenheit");
        cToF.setPreferredSize(new Dimension(200,50));
        cToF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in Celsius:"));
                TempConverter i = new TempConverter();
                double finalValue = i.convertCtoF(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " C = " + df.format(finalValue) + " F");
            }
        });
        panel.add(cToF);

        //Button F to C
        JButton fToC = new JButton("Fahrenheit to Celsius");
        fToC.setPreferredSize(new Dimension(200,50));
        fToC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in Fahrenheit:"));
                TempConverter i = new TempConverter();
                double finalValue = i.convertFtoC(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " F = " + df.format(finalValue) + " C");
            }
        });
        panel.add(fToC);

        //Button lb to kg


        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JButton FtoC = new JButton("Fahrenheit to Celsius");
        FtoC.setPreferredSize(new Dimension(200, 50));
        FtoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter a value in Fahrenheit:"));
                TempConverter t = new TempConverter();
                double finalv = t.convertFtoC((double) v);
                DecimalFormat d = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, "" + v + " Fahrenheit = " + d.format(finalv) + "Celsius" );

            }
        });
        panel.add(FtoC);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component) null);
        JButton CtoF = new JButton("Celsius to Fahrenheit");
        CtoF.setPreferredSize(new Dimension(200, 50));
        CtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt((JOptionPane.showInputDialog(frame, "Enter a value in Celsius:")));
                TempConverter t = new TempConverter();
                double finalv = t.convertCtoF((double) v);
                DecimalFormat d = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, "" + v + " Celsius = " + d.format(finalv) + "Fahrenheit" );

            }
        });
        panel.add(CtoF);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component) null);
    }

}


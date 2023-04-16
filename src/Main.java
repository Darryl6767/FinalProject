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
                double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter value:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertMtoKm(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, df.format(finalValue));
            }
        });
        panel.add(mitoKm);

        frame.pack();
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends javax.swing.JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter");
        JButton mtoKm = new JButton("Miles to Kilometers");
        mtoKm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nothing here yet");
            }
        });
        frame.getContentPane().add(mtoKm);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
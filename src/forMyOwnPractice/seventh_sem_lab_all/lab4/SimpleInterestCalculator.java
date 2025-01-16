package forMyOwnPractice.seventh_sem_lab_all.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator extends JFrame {

    private JTextField principalField, rateField, yearsField, resultField;

    public SimpleInterestCalculator() {
        setTitle("Simple Interest Calculator");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        // Labels
        JLabel principalLabel = new JLabel("Principal: ");
        JLabel rateLabel = new JLabel("Rate (% per year): ");
        JLabel yearsLabel = new JLabel("Years: ");
        JLabel resultLabel = new JLabel("Simple Interest: ");

        // Text fields
        principalField = new JTextField();
        rateField = new JTextField();
        yearsField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        //  button
        JButton findSI = new JButton("FIND SI");

        panel.add(principalLabel);
        panel.add(principalField);
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(yearsLabel);
        panel.add(yearsField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(new JLabel());
        panel.add(findSI);

        findSI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });

        add(panel);
    }

    private void calculateSimpleInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double years = Double.parseDouble(yearsField.getText());

            double interest = (principal * rate * years) / 100;
            resultField.setText(String.format("%.2f", interest));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleInterestCalculator().setVisible(true);
            }
        });
    }
}

package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Event_Handling.Practice2;

import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculate extends JFrame {

    JTextField num1Field = new JTextField(10);
    JTextField num2Field = new JTextField(10);
    JLabel resultLabel = new JLabel("Result: ");

    public SimpleCalculate() {
        JButton button = new JButton("Calculate");

        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                calculate(true);
            }

            public void mouseReleased(MouseEvent e) {
                calculate(false);
            }
        });

        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(button);
        add(resultLabel);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void calculate(boolean isSum) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = isSum ? (num1 + num2) : (num1 - num2);
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input!");
        }
    }
}

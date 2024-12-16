package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice1;

import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        // First label
        JLabel firstLabel = new JLabel("First Label");
        firstLabel.setBounds(50, 50, 100, 30); // x, y, width, height

        // Second label
        JLabel secondLabel = new JLabel("Second Label");
        secondLabel.setBounds(50, 100, 100, 30); // x, y, width, height

        frame.add(firstLabel);
        frame.add(secondLabel);

        frame.setVisible(true);
    }
}

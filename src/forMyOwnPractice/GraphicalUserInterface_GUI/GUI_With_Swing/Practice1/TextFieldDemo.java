package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice1;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextFieldDemo");
        frame.setSize(300, 300);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}

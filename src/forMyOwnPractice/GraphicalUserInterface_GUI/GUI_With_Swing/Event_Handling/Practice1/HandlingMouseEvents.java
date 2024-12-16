package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Event_Handling.Practice1;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HandlingMouseEvents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events");
        JLabel label = new JLabel("Hover over me");

        label.setBounds(100, 100, 200, 40);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse enrered!");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Hover over me");
            }
        });

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }
}

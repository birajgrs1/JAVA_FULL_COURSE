package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Event_Handling.Practice1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyAdapterExample extends JFrame {
    JLabel outputLabel;

    public KeyAdapterExample() {
        setTitle("KeyAdapter Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        outputLabel = new JLabel("Press any key");
        add(outputLabel);

        addKeyListener(new CustomKeyAdapter());
        setVisible(true);
    }

    class CustomKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            outputLabel.setText("Key pressed:  " + e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            outputLabel.setText("Key released:  " + e.getKeyChar());
        }
    }

    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}

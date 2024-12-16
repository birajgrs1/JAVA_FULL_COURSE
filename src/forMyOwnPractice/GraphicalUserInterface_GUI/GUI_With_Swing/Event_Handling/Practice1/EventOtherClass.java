package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Event_Handling.Practice1;

import java.awt.event.*;
import javax.swing.*;

public class EventOtherClass extends JFrame {
    JButton button = new JButton("Click Me");

    public EventOtherClass() {
        button.addActionListener(new ButtonHandlerOtherClass());
        add(button);
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Inner class
    private class ButtonHandlerOtherClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Clicked");
        }
    }

    public static void main(String[] args) {
        new EventOtherClass();
    }
}

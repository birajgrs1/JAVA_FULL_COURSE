package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Event_Handling.Practice1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventWithinClasses  extends JFrame implements ActionListener {
    JButton button = new JButton("Click Me");

    public EventWithinClasses() {
        button.addActionListener(this);
        add(button);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");

    }

    public static void main(String[] args) {
        new EventWithinClasses();
    }
}

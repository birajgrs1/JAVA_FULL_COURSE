package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class BorderDemo extends JFrame {

    JPanel p1, p2, p3, sp1, sp2;

    BorderDemo() {
        setSize(500, 500);
        setDefaultLookAndFeelDecorated(true);
        setTitle("Border Demo");
        setLayout(new BorderLayout());

        // Creating JPanel objects
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        sp1 = new JPanel();
        sp2 = new JPanel();

        // Setting size of JPanels
        p1.setPreferredSize(new Dimension(500, 50));
        p2.setPreferredSize(new Dimension(50, 400));

        // Setting borders
        p1.setBorder(BorderFactory.createRaisedBevelBorder());
        p2.setBorder(BorderFactory.createRaisedBevelBorder());
        p3.setBorder(BorderFactory.createTitledBorder("Registration Form"));

        // Adding panels to the frame
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);

        p3.setLayout(new GridLayout(1, 2));
        sp1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        sp2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLoweredBevelBorder(),
                BorderFactory.createLineBorder(Color.BLACK, 2)
        ));

        // Adding panels to p3
        p3.add(sp1);
        p3.add(sp2);

        // Adding labels to panels
        p1.add(new JLabel("Tool Bar here...", JLabel.CENTER));
        p2.add(new JLabel("Buttons Here...", JLabel.CENTER));
        sp1.add(new JLabel("Labels here...", JLabel.CENTER));
        sp2.add(new JLabel("Input controls here...", JLabel.CENTER));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderDemo();
    }
}

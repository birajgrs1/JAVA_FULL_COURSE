package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.LayoutManagementFull;

import java.awt.*;

public class GridBagLayoutDemo extends Frame {
    GridBagLayoutDemo() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        c.gridx = 0;
        c.gridy = 0;

        add(new Button("Button 1"), c);

        c.gridx = 1;
        c.gridy = 0;
        add(new Button("Button 2"), c);

        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth =2; //Span 2 columns
        add(new Button("Button 3"), c);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        GridBagLayoutDemo demo = new GridBagLayoutDemo();

    }
}

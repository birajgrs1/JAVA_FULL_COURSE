package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.LayoutManagementFull;

import java.awt.*;

public class BorderLayoutDemo extends Frame  {

    BorderLayoutDemo(){
        setLayout(new BorderLayout());

        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);


    }


    public static void main(String[] args) {
        BorderLayoutDemo demo = new BorderLayoutDemo();

    }
}

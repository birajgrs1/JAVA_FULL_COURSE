package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.LayoutManagementFull;

import java.awt.*;

public class FlowLayoutDemo extends Frame {

    FlowLayoutDemo() {
        setLayout(new FlowLayout(FlowLayout.LEFT));  //left alignment
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));

        setSize(300, 300);
        setVisible(true);

    }


    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();

    }
}

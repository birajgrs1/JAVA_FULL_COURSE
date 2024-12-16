package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.LayoutManagementFull;

import java.awt.*;

public class NullLayoutDemo extends Frame {

    NullLayoutDemo(){
        setLayout(null);

        Button btn = new Button("Button");
        btn.setBounds(50, 50, 100, 50);
        add(btn);

        setSize(300, 200);
        setVisible(true);

    }
    public static void main(String[] args) {
        new NullLayoutDemo();
    }
}

package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class LabelDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Label Demo");
        Label lbl1, lbl2;
        lbl1 = new Label("Hello World!");
        lbl1.setBounds(20,20,200,30);

        lbl2 = new Label("Hello Everyone!");
        lbl2.setBounds(20,40,200,30);

        f.add(lbl1);
        f.add(lbl2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

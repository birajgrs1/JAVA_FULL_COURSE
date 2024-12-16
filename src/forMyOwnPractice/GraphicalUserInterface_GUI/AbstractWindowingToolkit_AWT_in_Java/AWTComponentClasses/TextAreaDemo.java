package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea Demo");

        TextArea ta = new TextArea("Write Description here...");
        ta.setBounds(100, 100, 300, 300);
        f.add(ta);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

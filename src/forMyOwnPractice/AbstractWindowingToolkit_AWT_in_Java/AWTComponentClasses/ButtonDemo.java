package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class ButtonDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Button Demo");
        Button b1 = new Button("Click Here!!!");
        b1.setBounds(80, 200, 80,50);
        f.add(b1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

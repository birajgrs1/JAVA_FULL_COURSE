package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        Frame f  = new Frame("TextField Demo");
        TextField tf = new TextField("textfield demo...");
        tf.setBounds(60, 100, 200, 50);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);



    }
}

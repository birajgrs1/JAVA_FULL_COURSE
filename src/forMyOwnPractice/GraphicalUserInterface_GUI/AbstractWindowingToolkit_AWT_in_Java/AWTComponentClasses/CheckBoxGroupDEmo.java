package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class CheckBoxGroupDEmo {

    CheckBoxGroupDEmo() {
        Frame frame = new Frame("CheckBoxGroupDemo");
        CheckboxGroup checkBoxGroupObj = new CheckboxGroup();

        Checkbox ckBox1 = new Checkbox("Yes", checkBoxGroupObj, true);
        ckBox1.setBounds(100, 100, 50, 50);

        Checkbox ckBox2 = new Checkbox("No", checkBoxGroupObj, false);
        ckBox2.setBounds(100, 150, 50, 50);

        frame.add(ckBox1);
        frame.add(ckBox2);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxGroupDEmo();
    }
}

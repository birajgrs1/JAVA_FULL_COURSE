package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class CheckBoxDemo {
    CheckBoxDemo(){
        Frame checkBoxFrame = new Frame("CheckBox Demo");
        Checkbox  checkBox1 = new Checkbox("True", true);
        checkBox1.setBounds(100,100,60,60);

        Checkbox  checkBox2 = new Checkbox("False");
        checkBox2.setBounds(100,100,60,60);

        checkBoxFrame.add(checkBox1);
        checkBoxFrame.add(checkBox2);
        checkBoxFrame.setSize(500,500);
        checkBoxFrame.setLayout(null);
        checkBoxFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxDemo();

    }
}

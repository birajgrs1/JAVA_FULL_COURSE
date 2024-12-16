package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class ChoiceDemo {

    ChoiceDemo(){

        Frame frame = new Frame("Choice Demo");
        Choice choice = new Choice();
        choice.setBounds(80,80,100,100);
        choice.add("Apple");
        choice.add("Banana");
        choice.add("Orange");
        frame.add(choice);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceDemo();

    }
}

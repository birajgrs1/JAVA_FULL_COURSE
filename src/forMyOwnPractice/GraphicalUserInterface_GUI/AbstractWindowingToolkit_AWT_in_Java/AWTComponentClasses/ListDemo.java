package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class ListDemo {

    ListDemo(){
        Frame frame = new Frame("List Demo");
        List list = new List(5);
        list.setBounds(10, 10, 300, 300);
        list.setBackground(Color.GREEN);
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grape");
        list.add("Mango");

        frame.add(list);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ListDemo();
    }
}

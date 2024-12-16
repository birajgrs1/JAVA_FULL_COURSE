package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice2;

import javax.swing.*;

public class ListDemo {
    ListDemo(){
        JFrame frame = new JFrame("List Demo");
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Cherry");
        listModel.addElement("Grape");
        JList list = new JList(listModel);
        list.setBounds(100, 100, 75, 75);
        frame.add(list);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        new ListDemo();

    }
}

package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice2;

import javax.swing.*;

public class MenuDemo {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    MenuDemo() {
        JFrame frame = new JFrame("Menu Demo");
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");

        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}

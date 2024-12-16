package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.MenuInAWT;

import java.awt.*;

public class MenuDemo extends Frame {
    TextArea textArea;

    MenuDemo(){
        MenuBar menuBar = new MenuBar();   //Create menubar
        setMenuBar(menuBar);  //Add menubar to frame

        Menu files = new Menu("File");
        Menu date = new Menu("Date");
        Menu exit = new Menu("Exit");
        textArea = new TextArea(10,40);
        textArea.setBackground(Color.ORANGE);
        add(textArea);

        //Add menus to menubar
        menuBar.add(files);
        menuBar.add(date);
        menuBar.add(exit);

        //Create menu items to menus
        Menu menu = new Menu("New");
        files.add(menu);

        MenuItem save = new MenuItem("Save");
        files.add(save);

        MenuItem open = new MenuItem("Open");
        files.add(open);

        files.addSeparator();
        MenuItem print = new MenuItem("Print");
        files.add(print);

        CheckboxMenuItem tb  = new CheckboxMenuItem("Toolbar");
        files.add(tb);

        date.add(new MenuItem("Today"));
        exit.add(new MenuItem("Close"));
        setSize(500,300);
        setVisible(true);
    }
}

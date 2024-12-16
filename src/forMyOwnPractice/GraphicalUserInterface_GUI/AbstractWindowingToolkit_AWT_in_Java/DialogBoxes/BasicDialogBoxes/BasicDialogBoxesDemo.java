package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.DialogBoxes.BasicDialogBoxes;

import java.awt.*;

public class BasicDialogBoxesDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Dialog Box");

        Dialog dialog = new Dialog(frame, "My Dialog Box", true);  //modal
        dialog.setSize(300, 200);

        Label label = new Label("This is a simple dialog box", Label.CENTER);
        dialog.add(label);

        frame.setSize(400, 300);
        frame.setVisible(true);
        dialog.setVisible(true);
    }
}

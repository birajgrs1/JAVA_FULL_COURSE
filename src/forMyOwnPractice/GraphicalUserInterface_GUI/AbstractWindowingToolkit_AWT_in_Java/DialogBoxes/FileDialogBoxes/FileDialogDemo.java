package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.DialogBoxes.FileDialogBoxes;
import java.awt.*;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("File Dialog Example");

        FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        System.out.println("Selected File: " + fileDialog.getFile());
        System.out.println("Selected Directory: " + fileDialog.getDirectory());

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

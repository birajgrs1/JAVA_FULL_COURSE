package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class CanvasDemo1 {
    Frame canvas_f = new Frame("Canvas In AWT");

    public CanvasDemo1() {
        canvas_f.add(new CanvasDemo());
        canvas_f.setLayout(null);
        canvas_f.setSize(500, 500);
        canvas_f.setVisible(true);
        canvas_f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                canvas_f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new CanvasDemo1();
    }
}

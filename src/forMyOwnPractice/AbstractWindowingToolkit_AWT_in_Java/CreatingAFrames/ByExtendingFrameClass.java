package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.CreatingAFrames;

import java.awt.*;
import java.awt.event.*;

public class ByExtendingFrameClass extends Frame {
    ByExtendingFrameClass() {
        Button btn = new Button("Click Me");
        add(btn);
        setSize(300, 400);
        setTitle("Hello World");
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        ByExtendingFrameClass frame = new ByExtendingFrameClass();

    }
}

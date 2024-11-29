package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.CreatingAFrames;

import java.awt.*;

public class ByInstantiatingFrameClasses  {
    ByInstantiatingFrameClasses() {
        Frame frame = new Frame();
        Label label = new Label("GUI with awt");
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ByInstantiatingFrameClasses test = new ByInstantiatingFrameClasses();

    }
}

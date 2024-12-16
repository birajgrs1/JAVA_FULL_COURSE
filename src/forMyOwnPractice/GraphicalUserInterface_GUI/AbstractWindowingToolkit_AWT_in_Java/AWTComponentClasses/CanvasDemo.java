package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.AWTComponentClasses;

import java.awt.*;

public class CanvasDemo extends Canvas {
    public CanvasDemo() {
        setBackground(Color.WHITE);
        setSize(300, 200);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);

        g.fillRect(80, 80, 150, 100);

        g.setColor(Color.BLACK);
        g.drawRect(80, 80, 150, 100);
    }
}

package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice1;

import javax.swing.*;

public class SliderDemo {
    public static void main(String[] args) {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        JPanel panel = new JPanel();
        panel.add(slider);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

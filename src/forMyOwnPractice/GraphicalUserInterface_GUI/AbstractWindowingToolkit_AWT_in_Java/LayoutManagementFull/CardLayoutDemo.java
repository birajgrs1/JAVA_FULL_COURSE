package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.LayoutManagementFull;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame {
    CardLayout card;

    CardLayoutDemo() {
        card = new CardLayout();
        setLayout(card);

        add("Card1", new Button("Card 1"));
        add("Card2", new Button("Card 2"));
        add("Card3", new Button("Card 3"));

        // Switch cards using buttons
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                card.next(CardLayoutDemo.this);
            }
        });

        setSize(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        CardLayoutDemo demo = new CardLayoutDemo();
    }
}

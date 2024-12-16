package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo {
    TreeDemo() {
        JFrame frame = new JFrame("Tree Demo");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode appleNode = new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode bananaNode = new DefaultMutableTreeNode("Banana");
        DefaultMutableTreeNode cherryNode = new DefaultMutableTreeNode("Cherry");
        DefaultMutableTreeNode grapeNode = new DefaultMutableTreeNode("Grape");
        root.add(appleNode);
        root.add(bananaNode);
        root.add(cherryNode);
        root.add(grapeNode);
        JTree tree = new JTree(root);
        tree.setBounds(100, 50, 100, 150);
        frame.add(tree);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeDemo();

    }

}


package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice2;

import javax.swing.*;

public class TableDemo {
    TableDemo(){
        JFrame frame = new JFrame("Table Demo");
        String[] columns = {"Stu_ID", "Stu_Name", "Email", "Class", "Result", "Percentage"};
        String[][] data = {
                {"1", "Anjal", "anjal@gmail.com", "10", "Pass", "85%"},
                {"2", "Anita", "anita@gmail.com", "10", "Pass", "78%"},
                {"3", "Bivek", "bivek@gmail.com", "10", "Fail", "35%"},
                {"4", "Jayaram", "jayaram@gmail.com", "10", "Pass", "92%"},
                {"5", "Sujata", "sujata@gmail.com", "10", "Pass", "88%"}
        };
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 500, 150);
        frame.add(scrollPane);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {


        new TableDemo();

    }
}

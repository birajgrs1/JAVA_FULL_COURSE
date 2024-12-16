package forMyOwnPractice.GraphicalUserInterface_GUI.GUI_With_Swing.Practice1;
import javax.swing.*;

public class StartingWithSwing {
    public static void main(String[] args) {

        //Creating Frame
        JFrame frame = new JFrame("Simple Form Design");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        JPanel panel = new JPanel();
        frame.add(panel);

        //Adding components
        JLabel nameLabel= new JLabel("Name: ");
        panel.add(nameLabel);

        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        JLabel ageLabel= new JLabel("Age: ");
        panel.add(ageLabel);

        JTextField ageField = new JTextField(20);
        panel.add(ageField);

        JLabel genderLabel= new JLabel("Gender: ");
        panel.add(genderLabel);

        String[] genders = {"Male", "Female", "Other"};
        JComboBox <String> genderComboBox = new JComboBox <> (genders);
        panel.add(genderComboBox);

        JLabel hobbiesLabel= new JLabel("Hobbies: ");
        panel.add(hobbiesLabel);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        panel.add(readingCheckBox);

        JCheckBox musicCheckBox = new JCheckBox("Music");
        panel.add(musicCheckBox);

        JCheckBox sportCheckBox = new JCheckBox("Sport");
        panel.add(sportCheckBox);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        JButton clearButton = new JButton("Clear");
        panel.add(clearButton);

        frame.setVisible(true);



    }
}

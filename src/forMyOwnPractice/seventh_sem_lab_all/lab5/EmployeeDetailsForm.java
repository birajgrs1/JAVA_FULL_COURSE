package forMyOwnPractice.seventh_sem_lab_all.lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class EmployeeDetailsForm extends JFrame implements ActionListener {

    private JTextField nameField, ageField, salaryField;
    private JComboBox<String> genderComboBox;
    private JButton saveButton;

    public EmployeeDetailsForm() {

        setTitle("Employee Details Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel salaryLabel = new JLabel("Salary:");

        nameField = new JTextField();
        ageField = new JTextField();
        salaryField = new JTextField();
        String[] genders = {"Male", "Female"};
        genderComboBox = new JComboBox<>(genders);
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        panel.add(genderComboBox);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(saveButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            saveEmployeeDetails();
        }
    }

    private void saveEmployeeDetails() {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = (String) genderComboBox.getSelectedItem();
        String salary = salaryField.getText();

        try (FileWriter fw = new FileWriter("employee_details.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Name: " + name + ", Age: " + age + ", Gender: " + gender
                    + ", Salary: " + salary + "\n");
            JOptionPane.showMessageDialog(this, "Employee details saved  successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear fields after saving
            nameField.setText("");
            ageField.setText("");
            salaryField.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while saving employee details.", "Error",
                    JOptionPane.ERROR_MESSAGE);

                    ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmployeeDetailsForm().setVisible(true);
        });
    }
}

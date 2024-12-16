package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.PracticeSets.EmployeeDataEntryForm;
import java.awt.*;


public class EmployeeDetails extends Frame {
    EmployeeDetails(){
        // Set frame properties
        setTitle("Employee Data Entry Form");
        setSize(400, 450);
        setLayout(null);

        // Employee ID
        Label lblEmpId = new Label("Employee ID:");
        lblEmpId.setBounds(50, 50, 100, 20);
        TextField txtEmpId = new TextField();
        txtEmpId.setBounds(160, 50, 180, 20);

        // Employee Name
        Label lblEmpName = new Label("Employee Name:");
        lblEmpName.setBounds(50, 80, 100, 20);
        TextField txtEmpName = new TextField();
        txtEmpName.setBounds(160, 80, 180, 20);

        // Date of Birth
        Label lblDob = new Label("DOB:");
        lblDob.setBounds(50, 110, 100, 20);
        TextField txtDob = new TextField("YYYY-MM-DD");
        txtDob.setBounds(160, 110, 180, 20);

        // Salary
        Label lblSalary = new Label("Salary:");
        lblSalary.setBounds(50, 140, 100, 20);
        TextField txtSalary = new TextField();
        txtSalary.setBounds(160, 140, 180, 20);

        // Gender
        Label lblGender = new Label("Gender:");
        lblGender.setBounds(50, 170, 100, 20);
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox cbMale = new Checkbox("Male", genderGroup, true);
        cbMale.setBounds(160, 170, 60, 20);
        Checkbox cbFemale = new Checkbox("Female", genderGroup, false);
        cbFemale.setBounds(230, 170, 70, 20);

        // Country
        Label lblCountry = new Label("Country:");
        lblCountry.setBounds(50, 200, 100, 20);
        Choice countryChoice = new Choice();
        countryChoice.add("USA");
        countryChoice.add("India");
        countryChoice.add("Canada");
        countryChoice.add("Nepal");
        countryChoice.add("Other");
        countryChoice.setBounds(160, 200, 180, 20);

        // Remarks
        Label lblRemarks = new Label("Remarks:");
        lblRemarks.setBounds(50, 230, 100, 20);
        TextArea txtRemarks = new TextArea();
        txtRemarks.setBounds(160, 230, 180, 60);

        // Buttons
        Button btnAdd = new Button("Add");
        btnAdd.setBounds(100, 310, 80, 30);
        Button btnCancel = new Button("Cancel");
        btnCancel.setBounds(200, 310, 80, 30);

        // Add components to the frame
        add(lblEmpId);
        add(txtEmpId);
        add(lblEmpName);
        add(txtEmpName);
        add(lblDob);
        add(txtDob);
        add(lblSalary);
        add(txtSalary);
        add(lblGender);
        add(cbMale);
        add(cbFemale);
        add(lblCountry);
        add(countryChoice);
        add(lblRemarks);
        add(txtRemarks);
        add(btnAdd);
        add(btnCancel);

        setVisible(true);
    }
}

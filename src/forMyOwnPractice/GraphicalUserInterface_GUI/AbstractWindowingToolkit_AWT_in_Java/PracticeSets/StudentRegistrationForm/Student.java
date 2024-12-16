package forMyOwnPractice.GraphicalUserInterface_GUI.AbstractWindowingToolkit_AWT_in_Java.PracticeSets.StudentRegistrationForm;

import java.awt.*;

public class Student extends Frame {

    //Heading label
    Label lblheading = new Label("Student Details", Label.CENTER);
    //Name Label
    Label lblname = new Label("Student Name", Label.LEFT);
    //Age Label
    Label lblage = new Label("Age", Label.LEFT);
    //Gender Label
    Label lblgender = new Label("Gender (M/F)", Label.LEFT);
    //Address Label
    Label lbladdress = new Label("Address", Label.LEFT);
    //Course Label
    Label lblcourse = new Label("Course", Label.LEFT);
    //Label Semester
    Label lblsemester = new Label("Semester", Label.LEFT);

    Label l7 = new Label("", Label.RIGHT);
    //Hobbies Label
    Label lblhobbies = new Label("Hobbies", Label.LEFT);
    //Name Textfield
    TextField txtname = new TextField();
    //Choice list for age
    Choice chage = new Choice();
    CheckboxGroup cbg = new CheckboxGroup();
    //Male Checkbox
    Checkbox chkmale = new Checkbox("Male",true, cbg);
    //Female Checkbox
    Checkbox chkfemale = new Checkbox("Female",false, cbg);

    //Hobbies list box with multiple selection enabled
    List hb = new List(5, true);
    TextArea  txtaddress = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
    Choice course = new Choice();
    Choice sem = new Choice();
    Choice hobbies = new Choice();
    Choice age = new Choice();
    Button btn = new Button("Submit");


    Student(){
    setBackground(Color.CYAN);
    setForeground(Color.BLACK);
    setLayout(null);

    lblheading.setBounds(10,40,280,20);
    add(lblheading);

    lblname.setBounds(25,65,90,20);
    add(lblname);
    txtname.setBounds(120,65,170,20);
    add(txtname);

    lblage.setBounds(25,90,90,20);
    add(lblage);
    chage.setBounds(120,90,50,20);
    add(chage);
    chage.add("17");
    chage.add("18");
    chage.add("19");
    chage.add("20");
    chage.add("21");
    chage.add("22");
    chage.add("23");
    chage.add("24");

        lblgender.setBounds(25,120,90,20);
        add(lblgender);
        chkmale.setBounds(120,120,50,20);
        chkfemale.setBounds(180,120,70,20);
        add(chkmale);
        add(chkfemale);


        lblhobbies.setBounds(25,150,90,20);
    add(lblhobbies);
    hb.setBounds(120,150,120,60);
    add(hb);
    hb.add("Playing Cricket");
    hb.add("Travelling");
    hb.add("Reading");
    hb.add("Swimming");
    hb.add("Playing Football");

    lbladdress.setBounds(25,230,90,20);
    add(lbladdress);
    txtaddress.setBounds(120,230,170,60);
    add(txtaddress);

    lblcourse.setBounds(25,305,90,20);
    add(lblcourse);

    course.setBounds(120,305,100,20);
    course.add("BSc CSIT");
    course.add("BCA");
    course.add("BIT");
    course.add("B.E. Computer");
    course.add("BIM");
    add(course);

    lblsemester.setBounds(25,335,90,20);
    add(lblsemester);
    sem.add("1");
    sem.add("2");
    sem.add("3");
    sem.add("4");
    sem.add("5");
    sem.add("6");
    sem.add("7");
    sem.add("8");
    sem.setBounds(120,335, 90, 20);
    add(sem);

    l7.setBounds(120,345,50,30);
    add(l7);

    btn.setBounds(120, 400, 90, 20);
    add(btn);

    }
}

package forMyOwnPractice.AbstractWindowingToolkit_AWT_in_Java.PracticeSets.StudentRegistrationForm;

import java.awt.*;

public class MainProgram {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setSize(600,600);
        stu.setTitle("Student Registration Form");
//        stu.setBackground(Color.YELLOW);
        stu.setVisible(true);
    }
}
package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice2;

/*

 Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any
course.
• Instance methods: enrollStudent(String studentName),
unenrollStudent(String studentName).
• Static method: setMaxCapacity(int capacity), to set the maximum
capacity for courses.

 */

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollment;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int newMaxCapacity) {
        Course.maxCapacity = newMaxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollment < maxCapacity) {
            enrolledStudents[enrollment] = studentName;
            enrollment++;
            System.out.println(studentName + " has been enrolled.");
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
        }
    }

    void unEnrollStudent(String studentName) {
        int index = -1;
        for (int i = 0; i < enrollment; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < enrollment - 1; i++) {
                enrolledStudents[i] = enrolledStudents[i + 1];
            }
            enrolledStudents[enrollment - 1] = null;
            enrollment--;
            System.out.println(studentName + " has been removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (int i = 0; i < enrollment; i++) {
            System.out.println(enrolledStudents[i]);
        }
    }
}

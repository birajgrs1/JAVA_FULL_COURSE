package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice2;
import java.util.Scanner;


public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the course name:");
        String courseName = scanner.nextLine();
        Course course = new Course(courseName);

        boolean running = true;
        while (running) {
            System.out.println("\n1. Enroll Student");
            System.out.println("2. Unenroll Student");
            System.out.println("3. Display Enrolled Students");
            System.out.println("4. Set Max Capacity");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter student name to enroll: ");
                    String enrollName = scanner.nextLine();
                    course.enrollStudent(enrollName);
                    break;

                case 2:
                    System.out.print("Enter student name to unenroll: ");
                    String unenrollName = scanner.nextLine();
                    course.unEnrollStudent(unenrollName);
                    break;

                case 3:
                    course.displayEnrolledStudents();
                    break;

                case 4:
                    System.out.print("Enter new max capacity: ");
                    int newCapacity = scanner.nextInt();
                    Course.setMaxCapacity(newCapacity);
                    System.out.println("Max capacity updated to " + newCapacity);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();

    }
}

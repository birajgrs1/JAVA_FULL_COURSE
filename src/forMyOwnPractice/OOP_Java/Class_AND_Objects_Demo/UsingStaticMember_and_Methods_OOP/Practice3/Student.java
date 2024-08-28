package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.UsingStaticMember_and_Methods_OOP.Practice3;

public class Student {

    String name;
    int roll;
    String faculty;
    static int count;

//    Applying parameterized constructor

    Student(String stuName, int rollNo, String program) {
        System.out.println(" Object Created!!! ");
        name = stuName;
        roll = rollNo;
        faculty = program;
        count++;
    }

    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Faculty : " + faculty);
        System.out.println();
    }
    static void displayCount(){
        System.out.println("Number of Students : " + count);
    }
    public static void main(String[] args) {

        Student.displayCount();

        Student s1 = new Student("Ram", 2019, "CSIT");
        Student s2 = new Student("Shyam", 2021, "BCA");
        Student s3 = new Student("Hari", 2024, "BIT");

        Student.displayCount();

        System.out.println("\n---------- Student Records ----------\n");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

    }
}

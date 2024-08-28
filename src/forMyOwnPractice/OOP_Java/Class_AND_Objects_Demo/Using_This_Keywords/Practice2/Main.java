package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Using_This_Keywords.Practice2;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("\n----------------------\n");

        stu1.setDetails("Ram", 18);
        stu1.displayDetails();
        System.out.println("\n----------------------\n");
        Student stu2 = new Student();
        stu2.setDetails("Sita", 15);
        stu2.displayDetails();
    }
}

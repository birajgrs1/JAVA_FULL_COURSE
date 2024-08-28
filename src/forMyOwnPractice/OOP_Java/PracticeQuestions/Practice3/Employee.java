package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice3;
/*
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat

 */
public class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void printEmployee() {
        System.out.printf("%-15s %-20d %s%n", name, yearOfJoining, address);
    }

}

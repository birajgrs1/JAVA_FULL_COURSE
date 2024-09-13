package forMyOwnPractice.OOP_Java.Inheritance_JAVA.InheritanceBasic.SingleInheritance.Practice3;

import java.util.Scanner;

class Employee {

    int employeeId;
    String employeeName;
    double employeeSalary;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employeeId = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        employeeName = sc.next();

        System.out.println("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    void display(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

}

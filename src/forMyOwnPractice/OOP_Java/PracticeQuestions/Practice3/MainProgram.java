package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {


        /*
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

        //Print the header
        System.out.printf("%-15s %-20s %s%n", "Name", "Year of joining", "Address");

        emp1.printEmployee();
        emp2.printEmployee();
        emp3.printEmployee();

 */

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        String continueInput = "yes";

        while (continueInput.equalsIgnoreCase("yes")) {
            System.out.println("Enter details for a new employee:");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Year of joining: ");
            int yearOfJoining = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            employees.add(new Employee(name, yearOfJoining, address));
            System.out.println();

            System.out.print("Do you want to enter details for another employee? (yes/no): ");
            continueInput = sc.nextLine();
        }

        // Print the header
        System.out.printf("%-15s %-20s %s%n", "Name", "Year of joining", "Address");

        // Print employee details
        for (Employee employee : employees) {
            employee.printEmployee();
        }

        sc.close();
    }
}

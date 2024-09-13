package forMyOwnPractice.OOP_Java.Inheritance_JAVA.InheritanceBasic.SingleInheritance.Practice3;

import java.util.Scanner;

public class Programmer extends Employee {
    int incentive;

    void getIncentive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Incentive: ");
        incentive = sc.nextInt();
    }

    void printIncentive() {
        System.out.println("Incentive: " + incentive);
    }
}

package forMyOwnPractice.seventh_sem_lab_all.lab1;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\t--- Menu ---\n");
            System.out.println("\t 1. Add");
            System.out.println("\t 2. Subtract");
            System.out.println("\t 3. Exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter First Number");
                    int num1 = sc.nextInt();

                    System.out.println("Enter Second Number");
                    int num2 = sc.nextInt();

                    int sum = num1+num2;
                    System.out.println("The sum is: " + sum);
                    break;

                case 2:
                    System.out.println("Enter First Number");
                    int num3 = sc.nextInt();

                    System.out.println("Enter Second Number");
                    int num4 = sc.nextInt();

                    int diff = num3 - num4;
                    System.out.println("The Difference is: " + diff);
                    break;

                case 3:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }while (choice != 3);
        sc.close();
    }
}

package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class SimpleCalculator_Switch {

    /*
    Create a program to create a simple calculator that uses a
    switch statement to perform basic arithmetic operations
    like addition, subtraction, multiplication, and division
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        double secondNumber = sc.nextDouble();

        System.out.println("Enter the operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        double result = switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    yield 0;  
                } else {
                    yield firstNumber / secondNumber;
                }
            }
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };

        System.out.println("Your Answer is: " + result);
    }
}

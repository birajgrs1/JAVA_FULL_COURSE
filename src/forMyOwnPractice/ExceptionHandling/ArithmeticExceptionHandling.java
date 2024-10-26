package forMyOwnPractice.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        try {
            double result = num1 / num2;
            System.out.printf("Result is: %.2f", result);
        }
        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
          if(e.getMessage().equals("Division by zero")){
              System.out.println("Divide by zero occurred !!!");
          }
          else{
              throw e;
          }
        }

    }



}

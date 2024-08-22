package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

import java.util.Scanner;

public class CalculateFactorial {

    public static  long Factorial(int num) {
        long factorial = 1;
        int i = 2;

        if (num < 2){
            return 1;
        }

        while (i <= num){
            factorial *= i;
            i++;
        }
        return factorial;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        long factorial = Factorial(num);

        System.out.println("Factorial of " + num + " is " + factorial);

    }
}

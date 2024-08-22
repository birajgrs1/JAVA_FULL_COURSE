package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

import java.util.Scanner;

public class LeastCommonMultiple {

    public static int  calculateLCM(int firstNumber, int secondNumber){
        int i= 1;

        while(true){

            int factor = firstNumber * i;
            if( factor % secondNumber ==  0 ){
                return factor;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int lcm = calculateLCM(num1, num2);
        System.out.println(" LCM of " + num1 + " and " + num2 + " is " + lcm);

    }
}

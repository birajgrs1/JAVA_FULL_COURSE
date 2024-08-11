package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class Bitwise_Operators_Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();

        //bitwise AND
        int bitwiseAND = num1 & num2;
        System.out.println("The bitwise AND operator is: " + bitwiseAND);

        //bitwise OR
        int bitwiseOR = num1 | num2;
        System.out.println("The bitwise OR operator is: " + bitwiseOR);

        //XOR operator
        int bitwiseXOR = num1 ^ num2;
        System.out.println("The bitwise XOR operator is: " + bitwiseXOR);

        //NOT operator
        int notOperator = ~num1;
        System.out.println("The not operator is: " + notOperator);

        //Left-shift operator
        int leftShift = num1 >>> 1;

        System.out.println("The left shift operator is: " + leftShift);

        //Right-shift operator

        int rightShift = num1 >>> -2;

        System.out.println("The right shift operator is: " + rightShift);



    }
}

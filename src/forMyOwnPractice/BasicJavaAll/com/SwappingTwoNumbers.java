package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
//        int a=5;
//        int b=4;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a =sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();

        System.out.println("Before swapping, Value of a: "+a);
        System.out.println("Before swapping, Value of b: "+b);

  //Using assignment operator to swapping values

        int c=a;
        a=b;
        b=c;

        System.out.println();

        System.out.println("After swapping, Value of a: "+a);
        System.out.println("After swapping, Value of b: "+b);







    }
}

package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class FindEvenOrOddByTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        String evenOrOdd = (n%2 == 0 ? "Even Number": "Odd Number");
        System.out.println("Number is: "+ evenOrOdd);
    }
}

package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ticket discount calculator !!!");
        System.out.println("Please enter your age::: ");
        int age = sc.nextInt();
        System.out.println("Are you a female ?(true/false)");
        boolean isFemale = sc.nextBoolean();

        if (age < 5){
            System.out.println("You got 75% discount. ");
        }
        else if (isFemale) {
            System.out.println("You got 50% discount. ");
        }
        else if(age > 60 && !isFemale){
            System.out.println("You got 25% discount.");
        }
        else{
            System.out.println("You got no discount. ");
        }
    }
}

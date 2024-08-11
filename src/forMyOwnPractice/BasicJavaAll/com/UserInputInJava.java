package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class UserInputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();

        System.out.println("Hello, "+name);

        System.out.println("Enter your Age");
        short age=sc.nextShort();

        if(age > 18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("Sorry, You are not eligible for voting.");
        }
    }
}

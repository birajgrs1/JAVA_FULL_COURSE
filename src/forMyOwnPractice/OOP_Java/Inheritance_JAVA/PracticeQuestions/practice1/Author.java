package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice1;

import java.util.Scanner;

public class Author {
    String name;
    String qualification;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the author:");
        name = sc.nextLine();

        System.out.println("Enter the qualification of the author:");
        qualification = sc.nextLine();
    }

    public void putData(){
        System.out.println("Author name is: " + name);
        System.out.println("Author qualification is: " + qualification);
    }
}

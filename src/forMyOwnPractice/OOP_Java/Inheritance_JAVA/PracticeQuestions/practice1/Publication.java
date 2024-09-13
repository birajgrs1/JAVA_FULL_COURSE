package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice1;

import java.util.Scanner;

public class Publication{
    String pname;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter publication name:");
        pname = sc.nextLine();
    }
    public void putData(){
        System.out.println("Publication name: "+pname);
    }
}

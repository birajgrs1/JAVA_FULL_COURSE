package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice1;

import java.util.Scanner;

public class Book extends Author {
    String title;
    double price;

    Publication publication  = new Publication();

    @Override
    public void getData(){
        super.getData();
        publication.getData();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter book price: ");
        price = sc.nextDouble();

    }
    @Override
    public void putData() {
        super.putData();
        publication.putData();

        System.out.println("Book Title: " + title);
        System.out.println("Book Price: रु" + price+"/-");
    }
}

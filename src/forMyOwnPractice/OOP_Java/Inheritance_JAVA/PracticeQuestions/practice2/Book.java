package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice2;

import java.util.Scanner;

public class Book extends LibraryItem {
    private String ISBN;

    public Book() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        this.ISBN = scanner.nextLine();
    }

    @Override
    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("ISBN: " + ISBN);
    }
}

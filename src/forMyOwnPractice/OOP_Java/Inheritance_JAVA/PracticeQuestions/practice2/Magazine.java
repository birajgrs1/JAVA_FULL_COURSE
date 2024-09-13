package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice2;

import java.util.Scanner;

public class Magazine extends LibraryItem {
    private String issueNumber;

    public Magazine() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Issue Number: ");
        this.issueNumber = scanner.nextLine();
    }

    @Override
    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

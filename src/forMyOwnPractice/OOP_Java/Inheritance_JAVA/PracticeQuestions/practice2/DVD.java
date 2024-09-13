package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice2;

import java.util.Scanner;

public class DVD extends LibraryItem {
    private int durationInSeconds;

    public DVD() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Duration in Seconds: ");
        this.durationInSeconds = scanner.nextInt();
    }

    @Override
    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Duration: " + durationInSeconds + " seconds");
    }
}

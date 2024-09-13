package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice2;

import java.util.Scanner;

public class LibraryItem {

    private String itemID;
    private String title;
    private String author;
    private boolean isCheckedOut;

    public LibraryItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item ID: ");
        this.itemID = scanner.nextLine();
        System.out.print("Enter Title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter Author: ");
        this.author = scanner.nextLine();
        this.isCheckedOut = false;
    }

    public String getItemID() {
        return itemID;
    }

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isCheckedOut ? "Checked Out" : "Available"));
    }

    public void checkout() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Item checked out successfully.");
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item is already available.");
        }
    }
}

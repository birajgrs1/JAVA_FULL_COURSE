package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. Display All Items");
            System.out.println("5. Checkout Item");
            System.out.println("6. Return Item");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    items.add(new Book());
                    break;
                case 2:
                    items.add(new Magazine());
                    break;
                case 3:
                    items.add(new DVD());
                    break;
                case 4:
                    for (LibraryItem item : items) {
                        item.displayItemDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Enter Item ID to checkout: ");
                    String checkoutID = scanner.nextLine();
                    checkoutItem(items, checkoutID);
                    break;
                case 6:
                    System.out.print("Enter Item ID to return: ");
                    String returnID = scanner.nextLine();
                    returnItem(items, returnID);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void checkoutItem(List<LibraryItem> items, String itemID) {
        for (LibraryItem item : items) {
            if (item.getItemID().equals(itemID)) {
                item.checkout();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void returnItem(List<LibraryItem> items, String itemID) {
        for (LibraryItem item : items) {
            if (item.getItemID().equals(itemID)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }
}

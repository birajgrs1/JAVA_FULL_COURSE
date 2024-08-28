package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice1;

public class MainProgram {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Author A", "1");
        Book myBook = new Book("2");
        Book book2 = new Book("Python Programming", "Author B", "3");

        System.out.println("Total number of books: " + Book.getTotalBooks());

        book1.borrowBook();
        myBook.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        myBook.returnBook();

        book1.getDetails();
        book2.getDetails();

    }
}

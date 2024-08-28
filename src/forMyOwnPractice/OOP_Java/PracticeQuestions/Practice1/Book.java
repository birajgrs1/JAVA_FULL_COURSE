package forMyOwnPractice.OOP_Java.PracticeQuestions.Practice1;
/*
Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book
instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the
library.
 */

class Book {
    static int totalBooks = 0;
    String title, author;
    String isbn;
    boolean isBorrowed;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    // Constructor for default title and author
    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    // Static method to get the total number of books
    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        } else {
            isBorrowed = true;
            System.out.println("Enjoy your book.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed the book. Please leave a review.");
        } else {
            System.out.println("This book is already in the library.");
        }
    }

    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

}

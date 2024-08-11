/*create class name Book,and perform following actions:

Attributes:

bookid,bookName,bookPrice,authorName,library name(static),availability

method:

createBook() will store book details.(add  3 books).

deleteBook() will delete book by Id

displayBook()will display book details*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    String authorName;
    static String libraryName = "Central Library";
    boolean availability;

    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName, boolean availability) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = availability;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: $" + bookPrice);
        System.out.println("Author Name: " + authorName);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("----------------------------");
    }
}

public class LibrarySystem {
    static List<Book> books = new ArrayList<>();

    // Method to create books
    public static void createBook(int bookId, String bookName, double bookPrice, String authorName, boolean availability) {
        Book newBook = new Book(bookId, bookName, bookPrice, authorName, availability);
        books.add(newBook);
        System.out.println("Book added successfully!\n");
    }

    // Method to delete a book by its ID
    public static void deleteBook(int bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookId == bookId) {
                iterator.remove();
                System.out.println("Book with ID " + bookId + " deleted successfully!\n");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.\n");
    }

    // Method to display all books
    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.\n");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding 3 books initially
        createBook(1, "Java Programming", 299.99, "John Doe", true);
        createBook(2, "Python Programming", 199.99, "Jane Smith", true);
        createBook(3, "C++ Programming", 399.99, "Alan Turing", false);

        
            System.out.println("1. Display Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Delete a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            while (true) { 
            switch(option) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Book Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    System.out.print("Is the book available? (true/false): ");
                    boolean availability = scanner.nextBoolean();
                    createBook(id, name, price, author, availability);
                    break;
                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteBook(deleteId);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
    }



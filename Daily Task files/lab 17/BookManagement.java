import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Book class
class Book {
    // Attributes
    private int bookId;
    private String bookName;
    private double bookPrice;
    private String authorName;
    private boolean availability;
    private static final String libraryName = "ABC Library"; // Static attribute

    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName, boolean availability) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = availability;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isAvailable() {
        return availability;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    // Setter methods
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Author Name: " + authorName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("Library Name: " + libraryName);
        System.out.println();
    }
}
// Library class
class Library{
    private List<Book> books = new ArrayList<>(); // To store the books

    // Method to create books
    public void createBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getBookName());
    }

    // Method to delete a book by its ID
    public void deleteBook(int bookId) {
        Iterator<Book> iterator = books.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId() == bookId) {
                iterator.remove();
                System.out.println("Book with ID " + bookId + " has been deleted.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}


// Main class to manage books
class BookManagement {
    public static void main(String[] args) {
       
        Library library = new Library();

        // Creating and adding books
        library.createBook(new Book(1, "Java Programming", 599.99, "John Doe", true));
        library.createBook(new Book(2, "Effective Java", 899.50, "Joshua Bloch", true));
        library.createBook(new Book(3, "Clean Code", 799.00, "Robert C. Martin", false));

        // Displaying all books
        System.out.println("\nBooks in the library:");
        library.displayBooks();

        // Deleting a book by ID
        System.out.println("\nDeleting a book with ID 2:");
        library.deleteBook(2);

        // Displaying all books after deletion
        System.out.println("\nBooks in the library after deletion:");
        library.displayBooks();
    }
}

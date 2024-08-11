/*create class name Book,and perform following actions:

Attributes: bookid,bookName,bookPrice,authorName,library name(static),availability

Methods:

1. createBook() will store book details.(add  3 books).

2. deleteBook() will delete book by Id

3. displayBook()will display book details

 */
import java.util.Scanner;
public class Book {
    int bookID;
    String bookName;
    int bookPrice;
    String authorName;
    int availability;
    static String Library ="Anna Centenuary Library";
    Scanner sc = new Scanner(System.in);

Book(int bookID,String bookName,int bookPrice,String authorName, int availability){
   this.bookID = bookID;
   this.bookName = bookName;
   this.bookPrice = bookPrice;
   this.authorName = authorName;
   this.availability= availability;
}

public void gotoMethod(){
    
    System.out.println("1. createBook\n2. deleteBook\n3. displayBook\n");
    int option = sc.nextInt();

    switch (option) {
        case 1:
            createBook();
            break;
        case 2:
            deleteBook();
        case 3:
            displayBook();
        default:
             System.out.println("There is no option like that");
    }

}
public void createBook(){
    System.out.println("Enter the Book id : ");
    int bookID = sc.nextInt();
    System.out.println("Enter the book name : ");
    String bookName = sc.nextLine();
    System.out.println("Enter the price : ");
    int bookPrice = sc.nextInt();
    System.out.println("Enter the name of the author : ");
    String authorName = sc.nextLine();
    System.out.println("Enter the availability of books : ");
    int availability = sc.nextInt();


}
public void deleteBook(){
    System.out.println("Enter the ID of the book to delete: ");
    int bookID = sc.nextInt();
    


}
public String displayBook(){

}

    public static void main(String[] args) {
        
        Book b1 = new Book(302,"RichDad PoorDad",4000,"RobertClive",34);
        

    }

}

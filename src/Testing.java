import Book.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Testing{
    static private final BookStore bookStore = new BookStore();
    public void addPaperBook()
    {

        System.out.println("Testing Adding new Paper book");
        try {
            PaperBook book = new PaperBook("978-0133594140", "Computer Networking: A Top-Down Approach (7th Edition)", "James F. Kurose", LocalDate.parse("2016-03-06", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 20, 10);
            bookStore.addBook(book);
        }
        catch(Exception e) {
            System.out.println("Error in adding new book" + e.getMessage());
        }
    }
    public void addEbook()
    {
        System.out.println("Testing Adding new E book");
        try {
            EBook book = new EBook("978-0134610993", "Artificial Intelligence: A Modern Approach (4th Edition)", "Stuart Russell", LocalDate.parse("2020-04-28", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 30, "PDF");
            bookStore.addBook(book);
        }
        catch(Exception e) {
            System.out.println("Error in adding new book" + e.getMessage());
        }
    }
    public void getBook()
    {
        System.out.println("Testing Getting existing book");
        try {
            Book book = bookStore.getBook("978-0133594140");
            if (book != null) {
                System.out.println("Book found with title: "+book.getTitle());
            }
            else{
                System.out.println("Book not found!!!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error in retrieving book" + e.getMessage());
        }
    }
    public void nonExistingBook()
    {
        System.out.println("Testing Non Existing Paper Book");
        try{
            Book book =bookStore.getBook("978-0133524563");
            if (book != null) {
                System.out.println("Book found with title: "+book.getTitle());
            }
            else{
                System.out.println("Book not found!!!");
            }
        }
        catch(Exception e) {
            System.out.println("Error in non Existing Paper Book" + e.getMessage());
        }
    }
    public void buyPaperBook()
    {
        System.out.println("Testing Buying paper book");
        try {
            double total = bookStore.buyBook("978-0133594140", 2, "abdelrhmanzaghlolmahran64@gmail.com", "Egypt-Cairo");
            System.out.println("Total price is "+total);
        }
        catch(Exception e) {
            System.out.println("Error in buying paper book" + e.getMessage());
        }
    }

    public void buyEbook()
    {
        System.out.println("Testing Buying Ebook");
        try {
            double total = bookStore.buyBook("978-0134610993", 2, "abdelrhmanzaghlolmahran64@gmail.com", "Egypt-Cairo");
            System.out.println("Total price is "+total);
        }
        catch(Exception e) {
            System.out.println("Error in buying E Book" + e.getMessage());
        }
    }

    public void buyPaperBookMoreThanStock()
    {
        System.out.println("Testing Buying Paper Book More Than Stock");
        try {
            double total = bookStore.buyBook("978-0133594140", 11, "abdelrhmanzaghlolmahran64@gmail.com", "Egypt-Cairo");
            System.out.println("Total price is "+total);
        }
        catch(Exception e) {
            System.out.println("Error in buying paper book " + e.getMessage());
        }
    }

    public void removeOldBooks()
    {
        System.out.println("Testing Removing Old Books");
        try {
            PaperBook book = new PaperBook("978-0262510875", "Structure and Interpretation of Computer Programs", "Harold Abelson", LocalDate.parse("1996-07-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 15, 3);
            bookStore.addBook(book);
            EBook book2 = new EBook("978-1118063330", "Operating System Concepts", "Abraham Silberschatz", LocalDate.parse("1996-07-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 18, "PDF");
            bookStore.addBook(book2);
            bookStore.removeBooks(4);
        }
        catch(Exception e) {
            System.out.println("Error in removing Old Books" + e.getMessage());
        }
    }

}

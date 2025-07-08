import Book.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
    List<Book> books;
    public BookStore() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book with ISBN:" + book.getISBN()+" was added to the store");
    }
    public Book getBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    public double buyBook(String ISBN,int quantity,String email,String address) {
        Book book = getBook(ISBN);
        if(book == null){
            throw new IllegalArgumentException("No Book with this ISBN!!!");
        }
        if(!(book instanceof CanSell)){
            throw new IllegalArgumentException("Book is not for Sale!!!");
        }
        if(book instanceof PaperBook temp){
            if(temp.getStock() < quantity){
                throw new IllegalArgumentException("No enough stock of this book!!!");
            }
            temp.decrementStock(quantity);
            Main.ShippingService(temp,address);
            return quantity*temp.getPrice();
        }
        if (book instanceof EBook temp)
        {
            Main.MailService(temp,email);
            return temp.getPrice()*quantity;
        }
        return 0;
    }
    public void removeBooks(int years)
    {
        List<Book> temp = new ArrayList<Book>();
        List<Book> deleted = new ArrayList<Book>();
        LocalDate today = LocalDate.now();
        LocalDate past = today.minusYears(years);
        for(Book book : books)
        {
            if (book.getPublishDate().isAfter(past)) {
                temp.add(book);
            }
            else {
                System.out.println("Book "+book.getTitle()+" has been deleted");
            }
        }
        books = temp;
    }
}

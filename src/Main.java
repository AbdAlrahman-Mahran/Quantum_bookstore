import Book.EBook;
import Book.PaperBook;

public class Main {
    public static void ShippingService(PaperBook book, String address)
    {
        System.out.println("Shipping book with ISBN:"+book.getISBN() +" to address:"+address);
    }
    public static void MailService(EBook book, String email)
    {
        System.out.println("Mailing book with ISBN:"+book.getISBN()+ "to: "+email);
    }
    public static void main(String[] args) {
        Testing testing = new Testing();
        testing.addEbook();
        testing.addPaperBook();
        testing.buyEbook();
        testing.buyPaperBook();
        testing.getBook();
        testing.nonExistingBook();
        testing.buyPaperBookMoreThanStock();
        testing.removeOldBooks();
    }
}

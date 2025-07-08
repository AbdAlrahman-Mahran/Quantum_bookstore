package Book;

import java.time.LocalDate;
import java.util.Date;

public class PaperBook extends Book implements CanSell, CanShip{
    private int stock;
    public PaperBook(String ISBN, String title, String author, LocalDate publishDate, double price, int stock) {
        super(ISBN, title, author, publishDate, price);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void decrementStock(int value) {
        if(stock>=value)
            stock-=value;
    }
    public void incrementStock(int value) {
        stock+=value;
    }

}

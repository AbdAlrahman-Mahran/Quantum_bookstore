package Book;

import java.time.LocalDate;
import java.util.Date;

public abstract class Book
{
    private final String ISBN;
    private final String title;
    private final String author;
    private final LocalDate publishDate;
    private final double price;

    public Book(String ISBN, String title, String author, LocalDate publishDate, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public double getPrice() {
        return price;
    }

}

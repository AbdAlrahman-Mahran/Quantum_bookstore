package Book;

import java.time.LocalDate;
import java.util.Date;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, String author, LocalDate publishDate) {
        super(ISBN, title, author, publishDate, 0);
    }
}

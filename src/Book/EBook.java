package Book;

import java.time.LocalDate;
import java.util.Date;

public class EBook extends Book implements CanSell,CanEmail {
    private final String fileType;

    public EBook(String ISBN, String title, String author, LocalDate publishDate, double price, String fileType) {
        super(ISBN, title, author, publishDate, price);
        this.fileType = fileType;
    }
    public String getFileType() {
        return fileType;
    }
}

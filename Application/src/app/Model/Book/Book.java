package app.Model.Book;

import java.text.ParseException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Date;

/**
 * Book
 */
public class Book {

    private static final AtomicInteger count = new AtomicInteger(0);
    int bookId;
    String name;
    String authorName;
    Date date1;

    public Book(String name, String author, String date) throws ParseException {
        this.bookId = count.incrementAndGet();
        this.name = name;
        this.authorName = author;
        date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.date1 = sdf.parse(date);
    }

    public Book(String bookName) {
        this.name = bookName;
	}

	@Override
    public String toString() {
        return "ID: " + bookId + ", Nombre: " + name + ", Autor: " + authorName + ", Fecha de publicacion: " + date1;
    }

    public void listBook() {
        List<String> lsbook = new ArrayList<>();
        lsbook.add("La milagrosa");
        lsbook.add("Juan la maxima");
        lsbook.add("El milagro");
        System.out.println(lsbook);
    }
}
package app.Model.Book;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/******************
 * BookOperations
 ******************/
public class BookOperations {
    Scanner sc = new Scanner(System.in);
    private List<Book> books;

    public BookOperations() {
        books = new ArrayList<Book>();
    }

    /****************
     * ADGREGA LIBRO
     ****************/
    public void addBook(Book book) {
        if (!verifyIfAllElementPresent(book)) {
            books.add(book);
            System.out.println("Se ha añadido: " + book + "\n");
            return;
        }
    }

    /****************
     * BORRA LIBRO
     ****************/
    public void deleteBook(Book book) {
        for (Iterator<Book> iter = books.listIterator(); iter.hasNext();) {
            Book booky = iter.next();
            if (booky.name.equals(book.name)) {
                iter.remove();
                System.out.println("Se ha borrado: " + booky + "\n");
                return;
            }
        }
    }

    /****************************************
     * VERIFICA TODOS LOS ELEMENTO DEL LIBRO
     ****************************************/

    public boolean verifyIfAllElementPresent(Book book) {
        for (Book booky : books) {
            if (booky.name.equals(book.name) && booky.authorName.equals(book.authorName)
                    && booky.date1.equals(book.date1)) {
                return true;
            }
        }
        return false;
    }

    /*****************************
     * OBTIENE TODOS LOS LIBROS
     *****************************/
    public void getAllBooks() {
        if (books == null) {
            System.out.println("No existen libros.\n");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /******************************************
     * OBTIENE 1 LIBRO O 1 AUTOR EN ESPECIFICO
     *******************************************/
    public void getBook(String name) {
        String bookname = name;
        for (Book book : books) {
            if (book.name.equals(bookname) || book.authorName.equals(bookname)) {
                System.out.printf("Libro: " + book.name + "\nAutor: " + book.authorName + "\n");
                return;
            }
        }
    }
}
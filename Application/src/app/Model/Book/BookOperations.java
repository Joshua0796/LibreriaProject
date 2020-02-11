package app.Model.Book;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * BookOperations
 */
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
        // Divide and conquer
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
        // if (verifyOneElementPresent(book)) {
        // checkForDeleteString(book);
        for (Iterator<Book> iter = books.listIterator(); iter.hasNext();) {
            if (iter.hasNext())
            {
                book = iter.next();
                iter.remove();
                System.out.println("Se ha borrado: " + book + "\n");
                return;
            }
        }
        // books.remove(book);

        // }
    }
    /*
     * public boolean checkForDeleteString(Book book) { for (int i = 0; i <
     * books.size(); i++) { if (books.get(i).equals(book)) { return true; } } return
     * false; }
     */

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

    /****************************************************
     * VERIFICA EL ELEMENTO LIBRO
     ****************************************************/
    public boolean verifyOneElementPresent(Book book) {
        for (Book booky : books) {
            if (booky.name.equals(book.name)) {
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
        // System.out.println("llkd");
        String bookname = name;
        for (Book book : books) {
            if (book.name.equals(bookname) || book.authorName.equals(bookname)) {
                System.out.printf("Libro: " + book.name + "\nAutor: " + book.authorName + "\n");
                return;
            }
        }
    }

    /*
     * 
     * 
     * 
     * 
     * public void createBook(String bookname, String authorName, String date)
     * throws ParseException { Book newBook = new Book(bookname, authorName, date);
     * for (Book book : books) { addBook(newBook); /* if
     * (!book.name.equals(bookwhatever.name) &&
     * !book.authorName.equals(bookwhatever.authorName)) { books.add(bookwhatever);
     * System.out.println("Se ha creado el libro: " + bookname +
     * "\nSe ha creado autor: " + authorName + "\nFecha de publicacion: " + date);
     * getAllBooks(); return; }
     *
     * }
     * 
     * }
     * 
     * public void getBook(String name) { //while (sc.hasNext()) { //String bookname
     * = sc.nextLine().toString(); if (books.contains(name)) {
     * System.out.println(name); }
     * 
     * //System.out.println(books.get(name)); //author = new ArrayList<>();
     * //System.out.println(author.get(id)); }
     */
    /*
     * public void createBook(Book book) {
     * 
     * System.out.println("Ingrese el nuevo libro: "); // book.add(sc.nextLine());
     * System.out.println("Ingrese el nombre del autor: "); //
     * book.add(sc.nextLine());
     * System.out.println("Ingrese la fecha de publicacion"); //
     * book.add(sc.nextLine()); // sc.close();
     * 
     * // for (String name : book) { //
     * System.out.println("Se ha añadido el libro: " + name); // } }
     * 
     * public void updateBook(int id) { ArrayList<String> author = new
     * ArrayList<>(); System.out.println("Ingrese el nuevo Autor: "); //
     * author.set(id, sc.nextLine()); // sc.close();
     * 
     * for (String name : author) { System.out.println("Se ha añadido a: " + name);
     * } }
     * 
     * public void deleteBook() { ArrayList<String> author = new ArrayList<>();
     * System.out.println("Ingrese nombre del Autor que desea borrar: "); //
     * author.remove(sc.nextLine()); // sc.close();
     * 
     * for (String name : author) { System.out.println("Se ha borrado a: " + name);
     * } }
     */

}
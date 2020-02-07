package app.Model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BookOperations
 */
public class BookOperations {
    private List<Book> book;

    public void getBook(int id) {
        ArrayList<String> author = new ArrayList<>();
        System.out.println(author.get(id));
    }

    public void createBook() {
        ArrayList<String> book = new ArrayList<>();
        System.out.println("Ingrese el nuevo libro: ");
        //book.add(sc.nextLine());
        System.out.println("Ingrese la fecha de publicacion");
        //book.add(sc.nextLine());
        // sc.close();

        for (String name : book) {
            System.out.println("Se ha añadido a: " + name);
        }
    }

    public void updateBook(int id) {
        ArrayList<String> author = new ArrayList<>();
        System.out.println("Ingrese el nuevo Autor: ");
        //author.set(id, sc.nextLine());
        //sc.close();

        for (String name : author) {
            System.out.println("Se ha añadido a: " + name);
        }
    }

    public void deleteBook() {
        ArrayList<String> author = new ArrayList<>();
        System.out.println("Ingrese nombre del Autor que desea borrar: ");
        //author.remove(sc.nextLine());
        //sc.close();

        for (String name : author) {
            System.out.println("Se ha borrado a: " + name);
        }
    }

}
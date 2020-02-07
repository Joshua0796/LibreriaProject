package app.Model.Book;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Book
 */
public class Book {

    private int id;
    private static int idBook = 0;
    private String name;
    private Date publication_date;

    public Book(int id, String name, Date date)
    {
        this.id = idBook++;
        this.name = name;
        this.publication_date = date;
    }

    @Override
    public String toString(){
        return "ID: "+ id +", Nombre: "+ name + ", Fecha de publicacion: " + publication_date;
    }
    public void listBook() 
    {
        List<String> lsbook = new ArrayList<>();
        lsbook.add("La milagrosa");
        lsbook.add("Juan la maxima");
        lsbook.add("El milagro");
        System.out.println(lsbook);
    }
}
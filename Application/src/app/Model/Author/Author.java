package app.Model.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/********
 * Autor
 ********/
public class Author {

    private int id;
    private static int idAuthor = 0;
    private String name;

    public Author(int id, String name) {
        this.id = idAuthor++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: "+ id +", Autor: " + name;
    }

    Scanner sc = new Scanner(System.in);

    public void listAuthor() {
        List<String> lsauthor = new ArrayList<String>();
        lsauthor.add("Manuel");
        lsauthor.add("Francisco");
        lsauthor.add("Javier");
        System.out.println(lsauthor);
    }



}
package app.Model.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorOperations {
     private List<Author> authors;
     AuthorOperations authorOperations = new AuthorOperations();

     Scanner sc = new Scanner(System.in);

    /*  Author au = new Author(1, "Manuel");
     Author au1 = new Author(2, "Francisco");
     Author au2 = new Author(3, "Javier");

     authors=new ArrayList<Author>();lsauthor.add(au);lsauthor.add(au1);lsauthor.add(au2);

     for(
     Author author:lsauthor)
     {
          System.out.println(author);
     }
     */

     // TODO
     // addAuthor()
     // deleteAuthor()
     // editAuthor()
     // getAuthor(int id)
     // getAllAuthors()

     public void searchAuthor(int id) {
          ArrayList<String> author = new ArrayList<>();
          System.out.println(author.get(id));
     }

     public void createAuthor() {

          ArrayList<String> author = new ArrayList<>();
          System.out.println("Ingrese el nuevo Autor: ");
          author.add(sc.nextLine());
          sc.close();

          for (String name : author) {
               System.out.println("Se ha añadido a: " + name);
          }

     }

     public void deleteAuthor(int id) {

          ArrayList<String> author = new ArrayList<>();
          System.out.println("Ingrese nombre del Autor que desea borrar: ");
          author.remove(sc.nextLine());
          sc.close();

          for (String name : author) {
               System.out.println("Se ha borrado a: " + name);
          }

     }

     public void updateAuthor(int id) {

          ArrayList<String> author = new ArrayList<>();
          System.out.println("Ingrese el nuevo Autor: ");
          author.set(id, sc.nextLine());
          sc.close();

          for (String name : author) {
               System.out.println("Se ha añadido a: " + name);
          }
     }

}
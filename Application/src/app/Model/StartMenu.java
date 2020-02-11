package app.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

import app.Model.Author.*;
import app.Model.Book.*;

/****************
 * StartMenu
 ***************/
public class StartMenu {
    Scanner sc;
    Scanner scString;
    boolean salir;
    int num;
    int num2;
    String str;
    String bookName;
    String authorName;
    String publicationDate;
    final String errorNumero;
    // Author au, au1, au2;
    Book bo, bo1, bo2;
    // Author au1;
    // Author au2;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    // AuthorOperations authorOperations;
    BookOperations bookOperations;
    // Author au;

    public StartMenu() throws ParseException {
        sc = new Scanner(System.in);
        scString = new Scanner(System.in);
        salir = false;
        errorNumero = "Debes de insertar un numero.";
        bookOperations = new BookOperations();
        /************ PARA AUTOR *****************/
        /*
         * authorOperations = new AuthorOperations(); au = new Author("Manuel"); au1 =
         * new Author("Francisco"); au2 = new Author("Javier"); /
         *******************************************/

        bo = new Book("Las Cenizas", "Manuel", "16/02/2019");
        bo1 = new Book("Las Tinieblas", "Pedro", "16/01/1996");
        bo2 = new Book("Las Basuras", "Ramon", "23/03/2002");
        bookOperations.addBook(bo);
        bookOperations.addBook(bo1);
        bookOperations.addBook(bo2);

    }

    public void startMenu() {
        // data();

        // TODO: Id que se aumente solo
        while (!salir) {
            System.out.println("Seleccione accion a seguir: ");
            System.out.println("1. Visualizar");
            System.out.println("2. Creacion");
            System.out.println("3. Editar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");

            try {
                num = sc.nextInt();
                switch (num) {
                case 1:
                    formShow();
                    // authorOperations.getAllAuthors();
                    // toString();
                    // listAuthor();
                    // Author author = new Author(1, "");
                    /// Todo: llamar aqui metodo addauthor
                    break;
                case 2:
                    formCreate();
                    break;
                case 3:
                    // formUpdate();
                    break;
                case 4:
                    formDelete();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Usted acaba de salir de la aplicacion.");
                    break;
                default:
                    System.out.println("Solo permite las opciones del 1 al 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println(errorNumero);
                sc.next();
            }
        }
    }

    /*****************
     * VISUALIZACION
     ****************/
    public void formShow() {
        try {
            System.out.println("Selecciona que deseas Actualizar: ");
            System.out.println("1. Visualizar autor");
            System.out.println("2. Visualizar libro");
            System.out.println("3. Visualizar todo");
            System.out.println("4. Atras");
            num2 = sc.nextInt();

            switch (num2) {
            case 1:
                System.out.println("No funciona, favor probar con otra opcion.\n");
                // formShow();
                // authorOperations.getAllAuthors();
                break;
            case 2:
                System.out.println("Ingrese el libro que desea buscar: ");
                String str = scString.nextLine();
                bookOperations.getBook(str);
                // System.out.println("KLK");
                break;
            case 3:
                bookOperations.getAllBooks();
                break;
            case 4:
                startMenu();
            default:
                System.out.println("Solo permite las opciones del 1 al 3.\n");
                break;
            }

        } catch (InputMismatchException e) {
            System.out.println(errorNumero);
            // sc.next();
        }
    }

    /***************************
     * FORMULARIO PARA CREACION
     ***************************/

    public void formCreate() {
        try {
            System.out.println("Selecciona que deseas crear: ");
            System.out.println("1. Crear Autor");
            System.out.println("2. Crear libro");
            System.out.println("3. Atras");
            num2 = sc.nextInt();
            switch (num2) {
            case 1:
                System.out.println("funciona");
                break;
            case 2:
                System.out.println("Ingrese el nombre del libro: ");
                bookName = scString.nextLine();
                System.out.println("\nIngrese el nombre del autor: ");
                authorName = scString.nextLine();
                System.out.println("\nIngrese la fecha de publicacion en formato dd-MM-yyyy: ");
                publicationDate = scString.nextLine();
                bookOperations.addBook(new Book(bookName, authorName, publicationDate));
                break;
            case 3:
                startMenu();
            default:
                System.out.println("Solo permite las opciones del 1 al 3.");
                break;
            }

        } catch (InputMismatchException | ParseException e) {
            System.out.println(errorNumero);
            sc.next();
        }

    }

    /***************************
     * FORMULARIO PARA BORRAR
     ***************************/

    public void formDelete() {
        try {
            System.out.println("Selecciona que deseas borrar: ");
            System.out.println("1. Borrar Autor");
            System.out.println("2. Borrar libro");
            System.out.println("3. Atras");
            num2 = sc.nextInt();
            switch (num2) {
            case 1:
                System.out.println("funciona");
                break;
            case 2:
                System.out.println("Ingrese el nombre del libro: ");
                bookName = scString.nextLine();
                bookOperations.deleteBook(new Book(bookName));
                break;
            case 3:
                startMenu();
            default:
                System.out.println("Solo permite las opciones del 1 al 3.");
                break;
            }

        } catch (InputMismatchException e) {
            System.out.println(errorNumero);
            sc.next();
        }

    }

    /***************************
     * FORMULARIO PARA ACTUALIZAR
     ***************************/
    /*
     * public void formUpdate() { try {
     * System.out.println("Selecciona que deseas Actualizar: ");
     * System.out.println("1. Actualizar Autor");
     * System.out.println("2. Actualizar libro"); System.out.println("3. Atras");
     * num2 = sc.nextInt(); switch (num2) { case 1: System.out.println("funciona");
     * break; case 2: System.out.println("KLK"); break; case 3: startMenu();
     * default: System.out.println("Solo permite las opciones del 1 al 3."); break;
     * }
     * 
     * } catch (InputMismatchException e) { System.out.println(errorNumero);
     * sc.next(); }
     * 
     * }
     */
    /*
     * public void data() {
     * 
     * 
     * authorOperations.addAuthor(au); authorOperations.addAuthor(au1);
     * authorOperations.addAuthor(au2);
     * 
     * bookOperations.addBook(bo); bookOperations.addBook(bo1);
     * bookOperations.addBook(bo2);
     * 
     * }
     */

}
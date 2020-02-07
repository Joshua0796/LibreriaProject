package app.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

import app.Model.Author.*;

/****************
 * StartMenu
 ***************/
public class StartMenu {
    Scanner sc;
    boolean salir;
    int num;
    int num2;
    final String errorNumero;
    
    AuthorOperations authorOperations;
    //Author au;

    public StartMenu() {
        sc = new Scanner(System.in);
        salir = false;
        errorNumero = "Debes de insertar un numero.";
        authorOperations = new AuthorOperations();
    }

    public void startMenu() {

        /*
        Author au = new Author(1, "Manuel");
        Author au1 = new Author(2, "Francisco");
        Author au2 = new Author(3, "Javier");
        */
        /*
         * List<Author> lsauthor = new ArrayList<Author>(); lsauthor.add(au);
         * lsauthor.add(au1); lsauthor.add(au2);
         */
        /*
         * for (Author author : lsauthor) { System.out.println(author); }
         */

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
                authorOperations.getAllAuthors();    
                //toString();
                    //listAuthor();
                    //Author author = new Author(1, "");
                    /// Todo: llamar aqui metodo addauthor
                    break;
                case 2:
                    formCreate();
                    break;
                case 3:
                    formUpdate();
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

    /***************************
     * FORMULARIO PARA CREACION
     ***************************/

    public void formCreate() {
        try {
            System.out.println("Selecciona que deseas crear: ");
            System.out.println("1. Crear Autor");
            System.out.println("2. Crear libro");
            System.out.println("3. Salir");
            num2 = sc.nextInt();
            switch (num2) {
            case 1:
                Author au = new Author("Manuel");
                Author au1 = new Author("Francisco");
                Author au2 = new Author("Javier");
                authorOperations.addAuthor(au);
                authorOperations.addAuthor(au1);
                authorOperations.addAuthor(au2);
                authorOperations.getAllAuthors();
                System.out.println("funciona");
                break;
            case 2:
                System.out.println("KLK");
                break;
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
     * FORMULARIO PARA BORRAR
     ***************************/

    public void formDelete() {
        try {
            System.out.println("Selecciona que deseas borrar: ");
            System.out.println("1. Borrar Autor");
            System.out.println("2. Borrar libro");
            System.out.println("3. Salir");
            num2 = sc.nextInt();
            switch (num2) {
            case 1:
                System.out.println("funciona");
                break;
            case 2:
                System.out.println("KLK");
                break;
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

    public void formUpdate() {
        try {
            System.out.println("Selecciona que deseas Actualizar: ");
            System.out.println("1. Actualizar Autor");
            System.out.println("2. Actualizar libro");
            System.out.println("3. Salir");
            num2 = sc.nextInt();
            switch (num2) {
            case 1:
                System.out.println("funciona");
                break;
            case 2:
                System.out.println("KLK");
                break;
            default:
                System.out.println("Solo permite las opciones del 1 al 3.");
                break;
            }

        } catch (InputMismatchException e) {
            System.out.println(errorNumero);
            sc.next();
        }

    }

}
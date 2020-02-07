package app.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

import app.Model.Author.*;

/****************
 * StartMenu
 ***************/
public class StartMenu {
    Scanner sc ;
    boolean salir ;
    int num;    
    final String errorNumero;

    public StartMenu() {
        sc = new Scanner(System.in);
        salir = false;        
        num = sc.nextInt();
        errorNumero = "Debes de insertar un numero.";
    }
    public void startMenu() {

        Author au = new Author(1, "Manuel");
        Author au1 = new Author(2, "Francisco");
        Author au2 = new Author(3, "Javier");
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
            System.out.println("1. Visualizar Autores");
            System.out.println("2. Crear Autor");
            System.out.println("3. Actualizar Autor");
            System.out.println("4. Borrar Autor");
            System.out.println("5. Salir");

            try {
                switch (num) {
                case 1:
                    toString();
                    Author author = new Author(1, "");
                    /// Todo: llamar aqui metodo addauthor
                    break;
                case 2:
                    formularioCreacion();
                    /*
                    switch (num) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        return;
                    }
                    // cautor.createAuthor();
                    break;
                    */
                case 3:
                    switch (num) {
                    case 1:
                        /*
                         ** metodo adgregar autor
                         */
                        break;
                    case 2:
                        /*
                         ** metodo adgregar libro
                         */
                        break;
                    case 3:
                        return;
                    // uautor.updateAuthor();
                    }
                case 4:
                    switch (num) {
                    case 1:
                        /*
                         ** metodo adgregar autor
                         */
                        break;
                    case 2:
                        /*
                         ** metodo adgregar libro
                         */
                        break;
                    case 3:
                        return;
                    }
                    // dautor.deleteAuthor();
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo permite las opciones del 1 al 4.");
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

    public void formularioCreacion() {
        while (!salir) {
            System.out.println("1. Crear Autor");
            System.out.println("2. Crear libro");
            System.out.println("3. Salir");
        }
        try {
            switch (num) {
            case 1:
                // toString();
                System.out.println("funciona");
                break;
            case 2:
                break;
            case 3:
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println(errorNumero);
            sc.next();
        }

    }
}
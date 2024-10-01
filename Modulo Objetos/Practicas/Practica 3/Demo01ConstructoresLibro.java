/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        /*Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 "Herbert Schildt", "978-0071809252", 21.72);
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               "John Horton", "978-1512108347");*/
        Autor autor = new Autor("Herbert Schildt","una bibliografia","el origen");
        Libro libro1= new Libro("Java","yo",2012,"Isbn",100,autor);
        Libro libro2= new Libro("Java2","yo2","isbn2",autor);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
    }
    
}

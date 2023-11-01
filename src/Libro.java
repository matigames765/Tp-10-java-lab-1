public class Libro {
    /*
    8.	Crea una clase Libro con atributos como título, autor y año de publicación.
     */
    String titulo;
    String autor;
    int anio_publicacion;
    /*
    9.	Implementa un método en la clase Libro que permita mostrar la información del libro
    en la consola.
     */
    public void mostrarInformacion(){
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anio_publicacion);
    }
}

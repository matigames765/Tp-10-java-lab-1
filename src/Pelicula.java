public class Pelicula {
    /*
    15.	Crea una clase Película con atributos como título, director y duración en minutos.
    Implementa un método para mostrar la información de la película.
     */
    String titulo;
    String director;
    int duracion;
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion en minutos: " + duracion);
    }
}

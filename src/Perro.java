public class Perro {
    /*
    1.	Crea una clase Perro con atributos como nombre, raza y edad.
     */
    String name;
    String race;
    int age;

    public Perro(String name, String race,int age){
        this.name = name;
        this.race = race;
        this.age = age;
    }
    /*
    3.	Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en la consola.
     */
    public void ladrar(){
        System.out.println("Guau, guau");
    }
}

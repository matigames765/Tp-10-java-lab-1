import java.lang.Math;
public class Circulo {
    /*

    4.	Crea una clase Círculo con un atributo de radio y métodos para calcular su área
    y circunferencia

     */
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radio,2);
    }
    public double calculatePerimeter(){
        return Math.PI * 2 * radio;
    }

    public static void main(String[] args) {
        /*5.	Crea un objeto de la clase Círculo y calcula su área y circunferencia.*/
        Circulo circle1 = new Circulo(3.4);

        double area_circle1 = circle1.calculateArea();
        System.out.println("El area del circulo 1 es " + area_circle1);

        double perimeter_circle1 = circle1.calculatePerimeter();
        System.out.println("El perimetro del circulo es " + perimeter_circle1);
    }
}

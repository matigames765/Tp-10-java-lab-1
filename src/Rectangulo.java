public class Rectangulo {
    /*
    12.	Crea una clase Rectángulo con atributos de ancho y alto y métodos para calcular su
    área y perímetro.
     */
    double ancho;
    double alto;

    public double area(){
        return ancho * alto;
    }
    public double perimetro(){
        return alto + ancho;
    }
}

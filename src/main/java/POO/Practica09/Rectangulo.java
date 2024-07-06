/*  Practica 09: 
    Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
    el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, 
    y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:

        - Una super clase llamada Polígono.
        - Una sub clase llamada Rectángulo.
        - Una sub clase llamada Triángulo.
 */
package POO.Practica09;

/**
 * @author Ahmed Darhbane
 */
public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "\nlado1: " + lado1 + "\nlado2: " + lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }
}

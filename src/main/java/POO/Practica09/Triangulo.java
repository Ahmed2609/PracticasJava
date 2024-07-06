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
public class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n" +super.toString()+ "\nlado1: " + lado1 + "\nlado2: " + lado2 + "\nlado3: " + lado3;
    }

    @Override
    public double area() {
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
}

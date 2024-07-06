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
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "numero de Lados: " + numeroLados;
    }
    
    public abstract double area();
    
    
}

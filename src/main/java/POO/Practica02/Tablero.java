/*  Practica 02: 
    Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero 
    y actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
    Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
 */
package POO.Practica02;

/**
 * @author Ahmed Darhbane
 */
public class Tablero {

    // Atributos
    private int x;
    private int y;

    // METODOS
    public Tablero(int x, int y) {
        this.x = this.x;
        this.y = this.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moverArriba(int incremento) {
        y += incremento;
    }

    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    public void moverDerecha(int incremento) {
        x += incremento;
    }

    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

}

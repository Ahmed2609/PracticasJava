/*  Practica 09:
    Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 
    y que no termine de generar números hasta que no saque el 24. 
    El programa deberá decir al final cuántos números se han generado.
 */
package D_NumerosAleatorios;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica09 {

    public static void main(String[] args) {
        int numeroGenerado = 0;
        int contador = 0;

        System.out.println("Generando numeros aleatorios pares entre 0 y 100 hasta obtener 24...");

        while (numeroGenerado != 24) {
            numeroGenerado = ThreadLocalRandom.current().nextInt(0, 51) * 2;
            System.out.println(numeroGenerado);
            contador++;
        }

        System.out.println("Se han generado " + contador + " numeros.");
    }

}

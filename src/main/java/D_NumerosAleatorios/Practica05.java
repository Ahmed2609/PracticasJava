/*  Practica 05:
    Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
    Muestra también el máximo, el mínimo y la media de esos números.
 */
package D_NumerosAleatorios;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica05 {

    public static void main(String[] args) {
        Random rm = new Random();
        int numeros, suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double media = 0;

        System.out.println("50 numeros enteros aleatorios entre 100 y 199:");

        for (int i=0; i<50; i++) {
            numeros = ThreadLocalRandom.current().nextInt(100, 200);

            suma += numeros;
            if (numeros > max) {
                max = numeros;
            } else if (numeros < min) {
                min = numeros;
            }

            System.out.print(numeros + " ");
        }

        media = (double) suma / 50;

        System.out.println("\nEl maximo es: " + max);
        System.out.println("El minimo es: " + min);
        System.out.println("La media es:m " + media);
    }
}

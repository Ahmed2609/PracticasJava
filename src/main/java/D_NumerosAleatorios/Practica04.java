/*  Practica 04:
    Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
*/
package D_NumerosAleatorios;

import java.util.Random;

/**
 * @author Ahmed Darhbane
 */
public class Practica04 {
    public static void main(String[] args) {
        Random rm = new Random();
        int num;
        
        for (int i=0; i<20; i++) {
            num = rm.nextInt(11);
            System.out.print(num+" ");
        }
        
    }
}
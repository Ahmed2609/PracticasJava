/*  Practica 02:
    Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al intróducido.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[5];
        
        for (int i=0; i<arreglo.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        System.out.println("Arreglo Inverso:");
        for (int i=arreglo.length-1; i>=0; i--) {
            System.out.print(" "+arreglo[i]);
        }
    }
}

/*  Practica 05:
    Leer por teclado dos tablas de 10 números enteros y mezclarlas en una 
    tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        
        // Leer primer arreglo A    
        System.out.println("\nDigite el PRIMER arreglo:");
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = sc.nextInt();
        }
        
        // Leer segundo arreglo B
        System.out.println("\nDigite el SEGUNDO arreglo: ");
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = sc.nextInt();
        }
        
        // Mezclar arreglos en C
        int j=0;
        int k=0;
        for (int i=0; i<20; i+=2) {
            c[i] = a[j];
            c[i+1] = b[k];
            j++;
            k++;
        }
        
        // Imprimir el arreglo mezclado C
        System.out.println("\nEl Tercer arreglo es: ");
        for (int i=0; i<20; i++) {
            System.out.print(c[i] +" ");
        }
        System.out.println();
        
        
    }
}

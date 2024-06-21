/*  Practica 06:
    Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una, 
    tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];
        
        // Leer primer arreglo A    
        System.out.println("\nDigite el PRIMER arreglo:");
        for (int i=0; i<a.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = sc.nextInt();
        }
        
        // Leer segundo arreglo B
        System.out.println("\nDigite el SEGUNDO arreglo: ");
        for (int i=0; i<b.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = sc.nextInt();
        }
        
        int i=0;
        int j=0;
        while(i<12){
            for (int k=0; k<3; k++) {
                c[j] = a[i+k];
                j++;
            }
            
            for (int k=0; k<3; k++) {
                c[j] = b[i+k];
                j++;
            }
            i+=3;
        }
        
        // Imprimir el arreglo mezclado C
        System.out.println("\nEl Tercer arreglo es: ");
        for (int k=0; k<c.length; k++) {
            System.out.print(c[k] +" ");
        }
        System.out.println();
    }
}

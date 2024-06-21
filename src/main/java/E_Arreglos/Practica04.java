/*
    Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el 
    siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        
        for (int i=0; i<arreglo.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        int j =arreglo.length;
        for (int i = 0; i <arreglo.length/2; i++) {
            System.out.print(j+" - "+arreglo[i]+" - ");
            j--;
        }

    }
}

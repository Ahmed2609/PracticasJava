/*Practica 03:
    Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la 
    media de los números positivos, la media de los negativos y contar el número de ceros.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[5];
        double mediaPos=0,mediaNeg=0,sumaPos=0,sumaNeg=0;
        int contPos=0,contNeg=0,zeros=0;
        
        for (int i=0; i<arreglo.length; i++) {
            System.out.print((i+1)+". Digite un numero:");
            arreglo[i] = sc.nextInt();
        }
        
        for (int i=0; i<arreglo.length; i++) {
            
            if (arreglo[i] > 0) {
                contPos++;
                sumaPos+= arreglo[i];
            }else if (arreglo[i] < 0) {
                contNeg++;
                sumaNeg+= arreglo[i];
            }else {
                zeros++;
            }
        }
        
        if (contPos > 0) {
            mediaPos = sumaPos / contPos;
        }
        if (contNeg > 0) {
            mediaNeg = sumaNeg / contNeg;
        }
        
        System.out.println("Media de POSITIVOS: " + mediaPos);
        System.out.println("Media de NEGATIVOS: " + mediaNeg);
        System.out.println("Total de ZEROS: " + zeros);
    }
    
}

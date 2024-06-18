/*  Practica 09: 
    Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo: 
    el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. 
    EI último pasa a ser el primero.
*/
package E_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        
        System.out.println("Ingrese los numeros en la .:Tabla:.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite un numero " + (i + 1) + "/10: ");
            numeros[i] = sc.nextInt();
        }
        
        int ultimo = numeros[9];
        
        for (int i = 8; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        
        numeros[0] = ultimo;
        
        for(int numero:numeros){
            System.out.print(numero+" ");
        }
        
        
    }
    
}

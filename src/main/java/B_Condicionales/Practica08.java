/*  Practica 08:
    Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cifras = 1;
        
        System.out.print("Digite un numero(0-99. 999): ");
        numero = sc.nextInt();
        
        if (numero >= 0 && numero <= 99999) {
            // Contar las cifras del número
            
            if (numero >= 10) cifras++;
            if (numero >= 100) cifras++;
            if (numero >= 1000) cifras++;
            if (numero >= 10000) cifras++;

            System.out.println("El numero ingresado tiene " + cifras + " cifras.");
        } else {
            System.out.println("El numero ingresado esta fuera del rango permitido.");
        }
    }
    
}


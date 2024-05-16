/* Practica 01:
    Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Ingrese un numero (numero negativo para salir): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }
        }

        System.out.println("Ha ingresado un numero negativo. ADIOS");
    }

}

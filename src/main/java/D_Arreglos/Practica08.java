/*  Practica 08: 
    Diseñar una aplicación que declare una tabla de 10 elementos enteros. 
    Leer mediante el teclado 8 números. Después se debe pedir un número y una 
    posición, insertarlo en la posición indicada desplazando los que estén detrás.
 */
package D_Arreglos;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int scNum, posicion;
        int totalSc = 8;

        System.out.println("Ingrese los numeros en la .:Tabla:.");
        for (int i = 0; i < totalSc; i++) {
            System.out.print("Digite un numero " + (i + 1) + "/8: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite un numero: ");
        scNum = sc.nextInt();
        System.out.print("Digite una poscion(0-9): ");
        posicion = sc.nextInt();

        for (int i = totalSc - 1; i >= posicion; i--) {
            numeros[i + 1] = numeros[i]; // 9[8] - 8[7]

        }
        numeros[posicion] = scNum;

        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}

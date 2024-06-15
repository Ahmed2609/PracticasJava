/*
    METODO BURBUJA
 */
package E_MetodosDeOrdenamiento;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class MetodoBurbuja01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        System.out.print("Digite el total de numeros a introducir: ");
        nElementos = sc.nextInt();

        arreglo = new int[nElementos];

        System.out.println("Ingrese los numeros en la .:Tabla:.");
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un numero " + (i + 1) + "/" + nElementos + ": ");
            arreglo[i] = sc.nextInt();
        }

        // Metodo Burbuja
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Mostrando el arreglo ordenado en forma CRECIENTE
        System.out.println("\nArreglo ordenado en forma CRECIENTE: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nArreglo ordenado en forma DECRECIENTE: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("");

    }
}

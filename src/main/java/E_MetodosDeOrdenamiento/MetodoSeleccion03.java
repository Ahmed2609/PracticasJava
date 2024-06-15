/*

 */
package E_MetodosDeOrdenamiento;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class MetodoSeleccion03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;

        System.out.print("Digite el numero de elementos a ingresar: ");
        nElementos = sc.nextInt();

        arreglo = new int[nElementos];

        System.out.println("Ingrese los numeros en la .:Tabla:.");
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un numero " + (i + 1) + "/" + nElementos + ": ");
            arreglo[i] = sc.nextInt();
        }

        // Ordenamienot por SELECCION
        for (int i = 0; i < nElementos; i++) {
            min = i;
            for (int j = i + 1; j < nElementos; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        // Mostrando el arreglo ordenado en forma CRECIENTE
        System.out.println("\nOrden ASCENDENTE: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nOrden DESCENDENTE: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

    }

}

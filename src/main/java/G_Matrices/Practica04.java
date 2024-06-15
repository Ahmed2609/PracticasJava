/*  Practica 04:
    Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
 */
package G_Matrices;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;

        System.out.print("Digite el numero de Filas: ");
        nFilas = sc.nextInt();
        System.out.print("Digite el numero de Columnas:");
        nCol = sc.nextInt();

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        // Suma de FILAS
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("La suma de la fila[" + i + "] es: " + sumaFilas);
        }
        System.out.println("");

        // Suma de COLUMNAS
        for (int j = 0; j < nCol; j++) {
            sumaCol = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("La suma de la columna[" + j + "] es: " + sumaCol);
        }
        System.out.println("");

    }
}

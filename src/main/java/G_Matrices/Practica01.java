/*  Practica 01:
    Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */
package G_Matrices;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        System.out.print("Digite el numero de Filas: ");
        nFilas = sc.nextInt();
        System.out.print("Digite el numero de Columnas: ");
        nCol = sc.nextInt();

        matriz = new int[nFilas][nCol];

        System.out.println("Digite una matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        if (nFilas == nCol) {
            int i, j;
            i = 0;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                System.out.println("\nLa matriz es simetrica");
            } else {
                System.out.println("\nLa matriz NO es simetrica ");
            }
        } else {
            System.out.println("\nLa matriz NO es simetrica");
        }

    }
}

/*  Practica 05: 
    Utilizando DOS matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.
 */
package G_Matrices;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz1[][], matriz2[][];

        matriz1 = new int[5][9];
        matriz2 = new int[9][5];

        System.out.println("Digite la matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nLa matriz original es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        // TRASPONEMOS
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        System.out.println("\nLa matriz Traspuesta es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }

    }

}

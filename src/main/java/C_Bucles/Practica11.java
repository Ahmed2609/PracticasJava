/*  Practica 11:
    Diseñar un programa que calcule el producto de los primeros 10 números impares
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int producto = 1;

        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            producto *= i;
        }

        System.out.println("El producto de los 10 numeros impares es de: " + producto);
    }
}

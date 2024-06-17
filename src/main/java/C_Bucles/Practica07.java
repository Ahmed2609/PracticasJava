/*  Practica 07:
    Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0, cont = 0;
        float media = 0;

        do {
            System.out.print("Digite un numero(Negativo para Salir): ");
            num = sc.nextInt();

            if (num >= 0) {
                cont++;
                suma += num;
            }

        } while (num >= 0);

        if (cont != 0) {
            media = (float) suma / cont;
            System.out.println("La media de todos los numeros introducidos es de: " + media);
        } else {
            System.out.println("No se introdujeron numeros positivos.");
        }
    }
}

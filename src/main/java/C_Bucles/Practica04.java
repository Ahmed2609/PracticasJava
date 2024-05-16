/*  Practica 04: 
    Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbne
 */
public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cont = 0;

        do {
            System.out.print("Digite un numero(Negativo para Salir.): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                cont++;
            }
        } while (numero >= 0);

        System.out.println("Se han introducido " + cont + " numeros POSITIVOS");
    }
}

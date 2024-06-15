/*  Practica 05:
    Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, 
    y luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. 
    EI proceso termina cuando el usuario acierta y mostrar el número de intentos.
 */
package C_Bucles;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numAdivinar;

        int numAleatorio = rd.nextInt(101);
        System.out.println(numAleatorio);

        do {
            System.out.print("Digite el numero a adivinar: ");
            numAdivinar = sc.nextInt();

            if (numAdivinar > numAleatorio) {
                System.out.println("Es MENOR");
            } else if (numAdivinar < numAleatorio) {
                System.out.println("Es MAYOR");
            } else {
                System.out.println("\nAcertaste!! es era el " + numAdivinar);
            }
        } while (numAdivinar != numAleatorio);

    }

}

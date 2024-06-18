/*  Practica 06:
    Escribe un programa que piense un número al azar entre 0 y 100. 
    El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
    Después de cada intento fallido, el programa dirá cuántas oportunidades quedan 
    y si el número introducido es menor o mayor que el número secreto.
 */
package D_NumerosAleatorios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, secreto, cont = 5;

        secreto = ThreadLocalRandom.current().nextInt(0, 101);
        System.out.println(secreto);
        while (cont > 0) {
            System.out.print("Digite un numero (0-100): ");
            num = sc.nextInt();

            if (num < 0 || num > 100) {
                System.out.println("El numero debe estar entre 0 y 100");
                continue;
            }

            cont--;

            if (num > secreto) {
                System.out.println("El numero es MENOR");
            } else if (num < secreto) {
                System.out.println("El numero es MAYOR");
            } else {
                System.out.println("¡Enhorabuena! El número es: " + secreto);
                break;
            }

            if (cont > 0) {
                System.out.println("Te quedan " + cont + " intentos\n");
            } else {
                System.out.println("\nTe has quedado sin intentos :( El numero era: " + secreto);
            }
        }
    }
}
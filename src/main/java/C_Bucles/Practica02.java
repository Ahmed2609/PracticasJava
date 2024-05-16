/* Practica 02:
    Leer un número e indicar si es positivo o negativo. EI proceso se repetirá hasta que se introduzca un 0.
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite un numero(0 para salir.):");
            numero = sc.nextInt();

            if (numero > 0) {
                System.out.println(numero + " es POSITIVO");
            } else if (numero < 0) {
                System.out.println(numero + " es NEGATIVO");
            } else {
                System.out.println("Gracias por tu visita");;
            }
        } while (numero != 0);
    }

}

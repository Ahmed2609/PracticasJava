/*  Practica 03: 
    Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package C_Bucles;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite un numero(0 para Salir.): ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Gracias por tu visita");
            } else if (numero % 2 == 0) {
                System.out.println(numero + " es PAR");
            } else {
                System.out.println(numero + " es IMPAR");
            }
        } while (numero != 0);
    }

}

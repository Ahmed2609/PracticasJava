/*  Practica 02:
    Pedir dos números y decir cual es el mayor o si son iguales.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 *
 * @author Ahmed Darhbane
 */
public class Practica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite el PRIMER numero: ");
        num1 = sc.nextDouble();
        System.out.print("Digite el SEGUNDO numero: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " ES mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " ES mayor que " + num1);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }

}

/*  Practica 01:
    Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero entero: ");
        num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println(num + " ES multiplo de 10");
        }

    }
}

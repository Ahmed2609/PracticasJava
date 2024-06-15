/*  Practica 06:
    Hacer un programa que tome dos números y diga si ambos son pares o impares.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite el PRIMER numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite el SEGUNDO numero: ");
        num2 = sc.nextInt();

        if (num1%2==0 && num2%2==0) {
            System.out.println("Ambos numeros son PARES");
        } else if (num1%2==0 || num2%2==0) {
            System.out.println("Uno es PAR y el otro es IMPAR");
        } else {
            System.out.println("Los dos son IMPARES");
        }

    }
}

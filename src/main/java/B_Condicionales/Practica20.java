/*  Practica 20:
    Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, x = 0;

        System.out.println("Ecuacion de PRIMER GRADO: ax + b = 0\n");

        System.out.print("Digite a: ");
        a = sc.nextInt();
        System.out.print("Digite b: ");
        b = sc.nextInt();

        if (a == 0) {
            System.out.println("Esta ecuacion no tiene solucion real");
        } else {
            x = -b / a;
            System.out.println("x: " + x);
        }

    }
}

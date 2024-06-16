/*
    Realiza un programa que resuelva una ecuación de segundo grado 
    (del tipo ax2 + bx + c = 0).
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, discriminante, raiz;

        System.out.println("Resolver Ecuacion de Segundo Grado: ax2 + bx + c = 0\n");

        System.out.print("Digite a: ");
        a = sc.nextDouble();
        System.out.print("Digite b: ");
        b = sc.nextDouble();
        System.out.print("Digite c: ");
        c = sc.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            raiz = Math.sqrt(discriminante);
            x1 = (-b + raiz) / (2 * a);
            x2 = (-b - raiz) / (2 * a);
            System.out.println("Las soluciones son:");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);

        } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            System.out.println("La única solución es:");
            System.out.println("x: " + x1);
        } else {
            System.out.println("La ecuacion no tiene solucion Real");
        }

        sc.close();     
    }
}

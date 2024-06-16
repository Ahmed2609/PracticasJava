/*  Practica 22:
    Realiza un programa que calcule la media de tres notas.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite la tercera nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las tres notas es: " + media);

        sc.close();
    }

}

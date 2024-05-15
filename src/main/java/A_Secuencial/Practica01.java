/* Practica 01: 
    Hacer un programa que calcule e imprima la suma de TRES calificaciones.
 */
package A_Secuencial;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, notaFinal;

        System.out.print("Digite la PRIMERA calificacion: ");
        nota1 = sc.nextInt();
        System.out.print("Digite la SEGUNDA calificacion: ");
        nota2 = sc.nextInt();
        System.out.print("Digite la TERCERA calificacion: ");
        nota3 = sc.nextInt();

        notaFinal = nota1 + nota2 + nota3;

        System.out.println("Suma de todas las calificaciones: " + notaFinal);
    }

}

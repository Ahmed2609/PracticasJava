/*  Practica 23:
    Amplía el programa anterior para que diga la nota del boletín 
    (insuficiente, suficiente, bien, notable o sobresaliente).
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica23 {

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

        if (media < 5) {
            System.out.println("La nota del boletin es: Insuficiente");
        } else if (media < 6) {
            System.out.println("La nota del boletin es: Suficiente");
        } else if (media < 7) {
            System.out.println("La nota del boletin es: Bien");
        } else if (media < 9) {
            System.out.println("La nota del boletin es: Notable");
        } else {
            System.out.println("La nota del boletin es: Sobresaliente");
        }

        sc.close();
    }

}

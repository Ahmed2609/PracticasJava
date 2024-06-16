/*  Practica 21:
    Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
    Aplica la fórmula t = √2h/g siendo g = 9.81m/s^2
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, tiempo, g = 9.81;

        System.out.print("Digite la altura(metros): ");
        altura = sc.nextDouble();

        tiempo = Math.sqrt((2 * altura) / g);

        System.out.println("El tiempmo que tardara en caer es de: " + tiempo);

    }
}

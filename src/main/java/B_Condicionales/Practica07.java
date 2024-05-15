/*  Practica 07: 
    Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        boolean flag = false;

        System.out.print("Digite el PRIMER numero: ");
        num1 = sc.nextDouble();
        System.out.print("Digite el SEGUNDO numero: ");
        num2 = sc.nextDouble();
        System.out.print("Digite el TERCER numero: ");
        num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }
        }

    }
}

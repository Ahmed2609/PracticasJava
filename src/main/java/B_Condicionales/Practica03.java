/*  Practica 03:
    Hacer un programa que lea un caracter por teclado compruebe si es una letra mayúscula.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("Digite una letra: ");
        letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra esta en MAYUSCULA");
        } else {
            System.out.println("La letra esta en MINUSCULA");
        }

    }

}

/*  Practica 01:
    Construir un programa que simule el funcionamiento de una calculadora que puede realizar 
    las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. 
    EI usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos: 
        - S o s para la suma
        - R o r para la resta
        - M o m para el producto 
        - D o d para la división.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char opcion;

        System.out.print("Eliga una Opcion:"
                + "\nS, s -> Sumar"
                + "\nR, r -> Restar"
                + "\nM, m -> Multiplicar"
                + "\nD, d -> Division"
                + "\nOpcion: ");
        opcion = sc.next().charAt(0);

        System.out.println("Ingrese el PRIMER valor:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el SEGUNDO valor:");
        num2 = sc.nextInt();

        switch (opcion) {
            case 's':
                System.out.println("Suma: " + (num1 + num2));
                break;
            case 'r':
                System.out.println("Resta: " + (num1 - num2));
                break;
            case 'm':
                System.out.println("Producto: " + (num1 * num2));
                break;
            case 'd':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operacion no valida.");
        }

    }
}

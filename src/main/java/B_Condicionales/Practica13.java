/*  Practica 01:
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Euros, con el siguiente menú de opciones:
        - Ingresar dinero a la cuenta
        - Retirar dinero de la cuenta
        - Salir
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double ingreso, retiro, saldo = 1_000;

        System.out.print("Eliga una Opcion:"
                + "\n1. Ingresar dinero a la cuenta"
                + "\n2. Retirar dinero de la cuenta"
                + "\n3. Salir"
                + "\nOpcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Digite cuanto quiere ingresar: ");
                ingreso = sc.nextDouble();
                saldo += ingreso;
                System.out.println("SALDO DISPONIBLE: " + saldo + "€");
                break;
            case 2:
                System.out.print("Digite cuanto quiere retirar(saldo actual: " + saldo + "€): ");
                retiro = sc.nextDouble();
                if (retiro > saldo) {
                    System.out.println("No tiene suficiente Saldo. SALDO DISPONIBLE: " + saldo + "€");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. SALDO DISPONIBLE: " + saldo + "€");
                }
                break;
            default:
                System.out.println("Gracias por la visita!!");

        }

    }
}

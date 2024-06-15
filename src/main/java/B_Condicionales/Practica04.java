/*  Practica 04: 
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300. 
    ¿Cuál será la cantidad que pagará una persona por su compra?
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double descuento = 0.20;
        double totalConDescuento, montoDescuento, compra;

        System.out.println("Digite el total de la compra: ");
        compra = sc.nextInt();

        if (compra > 300) {
            montoDescuento = descuento * compra;
            totalConDescuento = compra - montoDescuento;
            System.out.println("El total de la compra es de: " + totalConDescuento + "\nDescuento de: " + montoDescuento);
        } else {
            System.out.println("El total de la compra es de: " + compra);
        }

    }
}

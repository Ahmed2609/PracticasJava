/*  Practica 02:
    Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
    también la suma total (los puntos que suman entre los tres dados).
 */
package D_NumerosAleatorios;

import java.util.Random;

/**
 * @author Ahmed Darhbane
 */
public class Practica01 {

    public static void main(String[] args) {
        Random rm = new Random();
        int dado1, dado2, dado3,suma;

        dado1 = rm.nextInt(6) + 1;
        dado2 = rm.nextInt(6) + 1;
        dado3 = rm.nextInt(6) + 1;
        suma = dado1 +dado2+dado3;

        System.out.println("Tirada de dados:");
        System.out.println("Dado 1: "+dado1+"\nDado 2: "+dado2+"\nDado 3: "+dado3);
        System.out.println("La suma de todos los dado es de: "+suma);
        
    }
}

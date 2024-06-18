/*  Practica 02:
    Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. 
    Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
    Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 
    2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
    Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
 */
package D_NumerosAleatorios;

import java.util.Random;

/**
 * @author Ahmed Darhbane
 */
public class Practica02 {

    public static void main(String[] args) {
        Random rm = new Random();
        int palos, carta;

        palos = rm.nextInt(4) + 1;
        carta = rm.nextInt(13) + 1;
        System.out.println(palos + " " + carta);

        String paloAleatorio;
        switch (palos) {
            case 1: paloAleatorio = "Picas"; break;
            case 2: paloAleatorio = "Corazones"; break;
            case 3: paloAleatorio = "Diamantes";break;
            case 4: paloAleatorio = "Treboles";break;
            default: paloAleatorio = "";
        }

        String cartaAleatoria;
        switch (carta) {
            case 1: cartaAleatoria = "A";break;
            case 11: cartaAleatoria = "J";break;
            case 12: cartaAleatoria = "Q";break;
            case 13: cartaAleatoria = "K";break;
            default: cartaAleatoria = String.valueOf(carta);
        }
        
        System.out.println("La carta aleatoria es: " + cartaAleatoria + " de " + paloAleatorio);
    }
}

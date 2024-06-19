/*  Practica 10:
    Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
    El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los 
    siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 */
package D_NumerosAleatorios;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica10 {

    public static void main(String[] args) {
        char caracterElegido;
        int randomChar;

        System.out.println("Diez lineas formadas por caracteres aleatorios:");

        for (int i = 0; i < 10; i++) {

            randomChar = ThreadLocalRandom.current().nextInt(1, 7); // Generar número entre 1 y 6
            if (randomChar == 1) {
                caracterElegido = '*';
            } else if (randomChar == 2) {
                caracterElegido = '-';
            } else if (randomChar == 3) {
                caracterElegido = '=';
            } else if (randomChar == 4) {
                caracterElegido = '.';
            } else if (randomChar == 5) {
                caracterElegido = '|';
            } else {
                caracterElegido = '@';
            }

            int longitud = ThreadLocalRandom.current().nextInt(1, 41);

            for (int j = 0; j < longitud; j++) {
                System.out.print(caracterElegido);
            }
            System.out.println();
        }
    }
}

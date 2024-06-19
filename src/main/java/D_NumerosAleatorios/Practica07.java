/*  Practica 08:
    Escribe un programa que muestre tres apuestas de la quiniela en
    tres columnas para los 14 partidos y el pleno al quince (15 filas).
 */
package D_NumerosAleatorios;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica07 {

    public static void main(String[] args) {
        System.out.println("Tres apuestas de la quiniela para los 14 partidos y el pleno al quince:");

        for (int i = 1; i <= 15; i++) {
            // Generar apuestas para las tres columnas
            int resultado1 = ThreadLocalRandom.current().nextInt(1, 4);
            int resultado2 = ThreadLocalRandom.current().nextInt(1, 4);
            int resultado3 = ThreadLocalRandom.current().nextInt(1, 4);

            String apuesta1 = "";
            String apuesta2 = "";
            String apuesta3 = "";

            if (resultado1 == 1) {
                apuesta1 = "1";
            } else if (resultado1 == 2) {
                apuesta1 = "X";
            } else if (resultado1 == 3) {
                apuesta1 = "2";
            }

            if (resultado2 == 1) {
                apuesta2 = "1";
            } else if (resultado2 == 2) {
                apuesta2 = "X";
            } else if (resultado2 == 3) {
                apuesta2 = "2";
            }

            if (resultado3 == 1) {
                apuesta3 = "1";
            } else if (resultado3 == 2) {
                apuesta3 = "X";
            } else if (resultado3 == 3) {
                apuesta3 = "2";
            }

            System.out.printf("Partido %2d: %s %s %s%n", i, apuesta1, apuesta2, apuesta3);
        }
    }
}

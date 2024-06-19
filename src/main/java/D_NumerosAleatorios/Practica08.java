/*  Practica 08:
    Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, 
    la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. 
    Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */
package D_NumerosAleatorios;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ahmed Darhbane
 */
public class Practica08 {

    public static void main(String[] args) {
        System.out.println("Tres apuestas de la quiniela para los 14 partidos y el pleno al quince:");

        for (int i = 1; i <= 15; i++) {
            int resultado1 = ThreadLocalRandom.current().nextInt(1, 7); // Generar número entre 1 y 6
            int resultado2 = ThreadLocalRandom.current().nextInt(1, 7); // Generar número entre 1 y 6
            int resultado3 = ThreadLocalRandom.current().nextInt(1, 7); // Generar número entre 1 y 6

            String apuesta1 = "";
            String apuesta2 = "";
            String apuesta3 = "";

            if (resultado1 <= 3) {
                apuesta1 = "1"; // 3/6 de probabilidad
            } else if (resultado1 <= 5) {
                apuesta1 = "X"; // 2/6 de probabilidad
            } else {
                apuesta1 = "2"; // 1/6 de probabilidad
            }

            if (resultado2 <= 3) {
                apuesta2 = "1"; // 3/6 de probabilidad
            } else if (resultado2 <= 5) {
                apuesta2 = "X"; // 2/6 de probabilidad
            } else {
                apuesta2 = "2"; // 1/6 de probabilidad
            }

            if (resultado3 <= 3) {
                apuesta3 = "1"; // 3/6 de probabilidad
            } else if (resultado3 <= 5) {
                apuesta3 = "X"; // 2/6 de probabilidad
            } else {
                apuesta3 = "2"; // 1/6 de probabilidad
            }

            System.out.printf("Partido %2d: %s %s %s%n", i, apuesta1, apuesta2, apuesta3);
        }
    }

}

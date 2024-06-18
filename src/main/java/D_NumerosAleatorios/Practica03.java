/*  Practica 03:
    Igual que el ejercicio anterior pero con la baraja española. Se utilizará 
    la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/
package D_NumerosAleatorios;

import java.util.Random;

/**
 * @author Ahmed Darhbane
 */
public class Practica03 {
    public static void main(String[] args) {
        Random rm = new Random();                
        int palos,carta;
        
        palos = rm.nextInt(4)+1;
        carta = rm.nextInt(12)+1;
        
        String nombrePalo;
        switch (palos) {
            case 1: nombrePalo = "Oro";break;
            case 2: nombrePalo = "Copas";break;
            case 3: nombrePalo = "Espada";break;
            case 4: nombrePalo = "Bastos";break;
            default: nombrePalo = "";
        }
        
        String nombreCarta;
        switch (carta) {
            case 1: nombreCarta = "AS";break;
            case 8: nombreCarta = "Sota";break;
            case 9: nombreCarta = "Caballo";break;
            case 10: nombreCarta = "Rey";break;
            default: nombreCarta = String.valueOf(carta);
        }
        
        System.out.println("La carta aleatoria es: " + nombreCarta + " de " + nombrePalo);

    }
}
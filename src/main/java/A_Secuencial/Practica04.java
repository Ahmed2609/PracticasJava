/*  Practica 04:
    Programa para covertir horas a minutos
 */
package A_Secuencial;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos;

        System.out.println("Ingrese las horas: ");
        hora = sc.nextInt();

        minutos = hora * 60;
        System.out.println(hora + " minutos son " + minutos + " minutos");
    }
}

/*  Practica 10:
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
    Suponiendo que todos los meses son de 30 días.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;

        System.out.println(".:VALIDADOR DE FECHAS:.\n");

        System.out.print("Digite el DIA(1-30): ");
        dia = sc.nextInt();
        System.out.print("Digite el MES(1-12): ");
        mes = sc.nextInt();
        System.out.print("Digite el AÑO: ");
        year = sc.nextInt();

        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (year != 0)) {
            System.out.println("La fecha es CORRECTA");
        } else {
            System.out.println("La fecha es NO es correcta");
        }

    }
}

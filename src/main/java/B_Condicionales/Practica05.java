/*  Practica06: 
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        - Si trabaja 40 horas o menos se le paga $16 por hora
        - Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaSemana, horaExtra;
        int salario;

        System.out.print("Digite el total de horas trabajadas(Semanal): ");
        horaSemana = sc.nextInt();

        if (horaSemana <= 40) {
            salario = horaSemana * 16;
        } else {
            horaExtra = horaSemana - 40;
            salario = 40 * 16 + horaExtra * 20;

        }

        System.out.println("Salario de la semana es de: " + salario);
    }
}

/* Practica 03:
   Hacer un programa que calcule e imprima el salario semanal de un empleado 
   a partir de sus horas semanales trabajadas y de su salario por hora.
 */
package A_Secuencial;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasSemanales;
        double salarioHora, salarioSemanal;

        System.out.print("Ingrese las horas trabajadas de la semana: ");
        horasSemanales = sc.nextInt();
        System.out.print("Ingrese el salario por hora: ");
        salarioHora = sc.nextDouble();

        salarioSemanal = horasSemanales * salarioHora;

        System.out.println("El salario de la semana es de: " + salarioSemanal);

    }
}

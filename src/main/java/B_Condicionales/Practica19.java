/*  Practica 19: 
    Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta 
    que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
    A partir de la hora 41, se pagan a 16 euros la hora.
*/
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioSemanal;
        int horaExtra,horasTotales,precioOrdinario;
        
        System.out.print("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
        horasTotales = sc.nextInt();
        
        precioOrdinario = 40 * 12;
        
        if (horasTotales <= 40) {
            salarioSemanal = horasTotales * 12;
        }else {
            horaExtra = horasTotales - 40;
            salarioSemanal = precioOrdinario + (horaExtra*16);
        }
        
        System.out.println("El sueldo semanal que le corresponde es de "+salarioSemanal);
        
    }
}

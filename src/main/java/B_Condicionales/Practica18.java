/*  Practica 18:
    Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*/
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dSemana;
        String nombre="";
        
        System.out.print("Digite el dia de la Semana(1-7): ");
        dSemana = sc.nextInt();
        
        switch (dSemana) {
            case 1: nombre = "Lunes";break;
            case 2: nombre = "Martes";break;
            case 3: nombre = "Miercoles";break;
            case 4: nombre = "Jueves";break;
            case 5: nombre = "Viernes";break;
            case 6: nombre = "Sabado";break;
            case 7: nombre = "Domingo";break;
            default: System.out.println("Dia de la semana INCORRECTO");
        }
        
        System.out.println("Dia "+dSemana + " corresponde a: " + nombre);
        
    }
}

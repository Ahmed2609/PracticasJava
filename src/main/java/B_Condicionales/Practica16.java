/*  Practica16:
   

*/
package B_Condicionales;

import java.util.Scanner;

/**
 *
 * @author Ahmed Darhbane
 */
public class Practica16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dSemana;
        
        System.out.print("Digite el dia de la semana(1-7): ");
        dSemana = sc.nextInt();
        
        switch(dSemana) {
            case 1: System.out.println("Programacion");break;
            case 2: System.out.println("Lenguaje de Marcas");break;
            case 3: System.out.println("Sistemas Informaticos");break;
            case 4: System.out.println("Bases de Datos");break;
            case 5: System.out.println("Entornos de desarrollo");break;
            case 6: System.out.println("Fin de Semana");break;
            case 7: System.out.println("Fin de Semana");break;
            default: System.out.println("Dia Incorrecto");
        }
    }
    
}

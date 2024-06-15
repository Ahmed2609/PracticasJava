/*  Practica 12:
    Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        System.out.print("Digite una nota(0-10): ");
        nota = sc.nextInt();
        
        switch(nota) {
            case 1,2,3,4: System.out.println("INSUFICIENTE");break;
            case 5: System.out.println("SUFICIENTE");
            case 6: System.out.println("BIEN");
            case 7,8: System.out.println("NOTABLE");
            case 9,10: System.out.println("SOBRESALIENTE");
        }

    }
}

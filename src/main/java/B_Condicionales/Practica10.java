/*  Practica 01:
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;
        boolean flag = false;

        System.out.println(".:VALIDADOR DE FECHAS:.\n");

        System.out.print("Digite el DIA(1-30): ");
        dia = sc.nextInt();
        System.out.print("Digite el MES(1-12): ");
        mes = sc.nextInt();
        System.out.print("Digite el YEAR: ");
        year = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12: if (dia >= 1 && dia <= 31) flag=true;
                break;
            case 2: if (dia>=1 && dia<=28) flag=true;
                break;
            case 4,6,9,11: if(dia>=1 && dia<=30) flag=true;
                break;
            default: System.out.println("Mes incorrecto");

        }
        
        if (flag) {
            System.out.println("\nLa fecha es correcta.");
        } else {
            System.out.println("\nLa fecha NO es correcta.");
        }

    }
}

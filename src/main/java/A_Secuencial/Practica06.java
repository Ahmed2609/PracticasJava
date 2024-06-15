/*  Practica 06:
    Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. 
    Juan tiene la mitad de lo que poseene Luis y Guillermo juntos. 
    Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los TRES.
 */
package A_Secuencial;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double guillermo, luis, juan, total;

        System.out.print("Ingrese la cantidad que tiene Guillermo: ");
        guillermo = sc.nextDouble();
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;


        total = guillermo + luis + juan;

        System.out.println("Entre los tres tienen: " + total);

    }
}

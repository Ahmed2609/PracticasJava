/*  Practica 05: 
    Tres personas desean invertir su dinero para fundar una empresa,
    cada una de ellos invierte una cantidad distinta, obtener el porcentaje 
    que cada quien invierte con respecto a la cantidad total invertida.
 */
package A_Secuencial;

import java.util.Scanner;

/**
 *
 * @author Ahmed Darhbane
 */
public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fundador1, fundador2, fundador3, total;

        System.out.print("Digite la cantida a invertir(Fundador 1): ");
        fundador1 = sc.nextDouble();
        System.out.print("Digite la cantida a invertir(Fundador 2): ");
        fundador2 = sc.nextDouble();
        System.out.print("Digite la cantida a invertir(Fundador 3): ");
        fundador3 = sc.nextDouble();

        total = fundador1 + fundador2 + fundador3;

        System.out.printf("Fundador 1 ha invertido el %.2f%%\n", (fundador1 / total) * 100);
        System.out.printf("Fundador 2 ha invertido el %.2f%%\n", (fundador2 / total) * 100);
        System.out.printf("Fundador 3 ha invertido el %.2f%%\n", (fundador3 / total) * 100);

    }

}

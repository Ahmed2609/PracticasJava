/*
    Busqueda BINARIA
 */
package F_Busquedas;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Binaria02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = {1, 2, 3, 4, 5};
        int dato, inf, sup, mitad, i;
        boolean flag = false;

        System.out.print("Digite el numero a buscar: ");
        dato = sc.nextInt();

        // Busqueda BINARIA
        inf = 0;
        sup = 5;
        i = 0;

        mitad = (inf + sup) / 2;
        while (inf <= sup && i < 5) {
            if (arreglo[mitad] == dato) {
                flag = true;
                break;
            }
            if (arreglo[mitad] > dato) {
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if (arreglo[mitad] < dato) {
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
            i++;
        }

        if (flag == false) {
            System.out.println("El numero NO se encuentra en el arreglo");
        } else {
            System.out.println("El numero ha sido encontrado en la posicion: " + mitad);
        }

    }

}

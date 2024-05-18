/*
    Busqueda Secuencial
    
    arreglo[] = {3,1,2,5,4}; dato = 2;
 */
package F_Busquedas;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Secuencial01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = {3, 1, 2, 5, 4}; // 5 elementos;
        int dato;
        boolean flag = false;

        System.out.print("Digite el numero a buscar: ");
        dato = sc.nextInt();

        // Busqueda SECUENCIAL
        int i = 0;
        while (i < 5 && flag == false) {
            if (arreglo[i] == dato) {
                flag = true;
            }
            i++;
        }

        if (flag == false) {
            System.out.println("El numero NO se encuentra en el arreglo");
        } else {
            System.out.println("El numero ha sido encontrado en la posicion: " + (i - 1));
        }

    }

}

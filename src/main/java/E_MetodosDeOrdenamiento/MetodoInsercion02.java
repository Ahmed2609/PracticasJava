/*  
    Ordenamiento: Ordenamiento por INSERCION
 */
package E_MetodosDeOrdenamiento;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class MetodoInsercion02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos,pos,aux;

        System.out.print("Digite el numero de elementos a ingresar: ");
        nElementos = sc.nextInt();

        arreglo = new int[nElementos];

        System.out.println("Ingrese los numeros en la .:Tabla:.");
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un numero " + (i + 1) + "/" + nElementos + ": ");
            arreglo[i] = sc.nextInt();
        }
        
        // Ordenamiento por INSERCION
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        // Mostrando el arreglo ordenado en forma CRECIENTE
        System.out.println("\nOrden ASCENDENTE: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nOrden DESCENDENTE: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

    }

}

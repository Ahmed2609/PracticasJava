/* Practica 01: 
    Hacer un programa que calcule e imprima la suma de TRES calificaciones
*/
package A_Secuenciales;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,nota3,total;
        
        System.out.print("Introduce la PRIMERA calificacion: ");
        nota1 = sc.nextDouble();
        System.out.print("Introduce la SEGUNDA calificacion: ");
        nota2 = sc.nextDouble();
        System.out.print("Introduce la TERCERA calificacion: ");
        nota3 = sc.nextDouble();
        
        total = nota1 + nota2 + nota3;
        
        System.out.println("\nEl total de las calificaciones es de: " + total);
        
        
        
        
    }
    
}

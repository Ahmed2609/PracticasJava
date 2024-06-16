/*
    Realiza un programa que pida una hora por teclado y que muestre luego 
    buenos días, buenas tardes o buenas noches según la hora. 
    Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
    Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
*/
package B_Condicionales;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Practica17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.print("Digite una hora(0-24): ");
        hora = sc.nextInt();
        
        if (hora>5 && hora<=12) {
            System.out.println("Buenos Dias!!");
        }else if(hora>=13 && hora <=20){
            System.out.println("Buenas Tardes!!");
        }else if((hora>=21 && hora <=23) || (hora>=0 && hora<=5)){
            System.out.println("Buenas Noches!!");
        }else{
            System.out.println("Hora ingresada INCORRECTA");
        }
        
    }
}
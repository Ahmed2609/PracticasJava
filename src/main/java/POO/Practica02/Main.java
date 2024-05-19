/*  Practica 02: 
    Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero 
    y actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
    Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
 */
package POO.Practica02;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tab1;
        int x, y, opcion, incremento=0;

        System.out.print("Digite la coordenada inicial de X: : ");
        x = sc.nextInt();
        System.out.print("Digite la coordenada inicial de Y: ");
        y = sc.nextInt();

        tab1 = new Tablero(x, y);

        do {
            System.out.println("\n\t:.MENU:. ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");
            System.out.print("Digite la opcion: ");

            opcion = sc.nextInt();

            if (opcion != 5) {
                System.out.print("Digite la cantidad de espacios a moverse: ");
                incremento = sc.nextInt();
            }

            switch (opcion) {
                case 1: tab1.moverArriba(incremento);break;
                case 2: tab1.moverAbajo(incremento);break;
                case 3: tab1.moverDerecha(incremento);break;
                case 4: tab1.moverIzquierda(incremento);break;
                case 5: break;
                default: System.out.println("Error!! se equivoco de opcion de menu");break;
            }
            
            System.out.println("\nPosicion Actual(X,Y): (" + tab1.getX() + "," + tab1.getY() + ")");
        } while (opcion != 5);

    }
}

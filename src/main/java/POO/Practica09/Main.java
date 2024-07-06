/*  Practica 09: 
    Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
    el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, 
    y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:

        - Una super clase llamada Polígono.
        - Una sub clase llamada Rectángulo.
        - Una sub clase llamada Triángulo.
 */
package POO.Practica09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
     static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        // Llenar un poligono
        llenarPoligono();
        
        // Mostrar lso datos
        mostrarResultados();
        
    }
    
    public static void llenarPoligono() {
        char respuesta;
        int opcion;
        
        do {            
            do {                
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
            } while (opcion<1 || opcion>2);
            
            switch (opcion) {
                case 1: llenarTriangulo(); // Llenar un Triangulo
                    break;
                case 2: llenarRectangulo(); // Llenar un Rectangulo
                    break;
            }
            
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = sc.next().charAt(0);
            System.out.println("");
        } while (respuesta=='s' || respuesta=='S');
    }
    
    public static void llenarTriangulo() {
         double lado1,lado2,lado3;
         
         System.out.print("\nDigite el lado1 del triangulo: ");
         lado1 = sc.nextDouble();
         System.out.print("Digite el lado2 del triangulo: ");
         lado2 = sc.nextDouble();
         System.out.print("Digite el lado3 del triangulo: ");
         lado3 = sc.nextDouble();
         
         Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
         poligono.add(triangulo);
         
         
    }
    
    public static void llenarRectangulo() {
        double lado1,lado2;
        
        System.out.print("\nDigite el lado1 del Rectangulo: ");
        lado1 = sc.nextDouble();
        System.out.print("Digite el lado2 del Rectangulo: ");
        lado2 = sc.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados() {
        for(Poligono poli: poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: " + poli.area());
            System.out.println("");
        }
    }
}


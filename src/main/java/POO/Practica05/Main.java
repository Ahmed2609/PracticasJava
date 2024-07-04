package POO.Practica05;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {
    public static double mayorArea(Triangulo_Isosceles triangulo[]){
        double area;
        
        area = triangulo[0].obtenerArea();
        for (int i=1; i<triangulo.length; i++) {
            if (triangulo[i].obtenerArea() > area) {
                area = triangulo[i].obtenerArea();
            }
        }
        
        return area;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.print("Digite el numero de Triangulos a ingresar: ");
        nTriangulos = sc.nextInt();

        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];

        for (int i=0; i<triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo "+(i+1)+": ");
            System.out.print("Introduzca la base: ");
            base = sc.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = sc.nextDouble();
            
            
            triangulos[i] = new Triangulo_Isosceles(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+ triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
            
        }
        
        System.out.println("\nEl area del Triangulo de mayor superficie es: "+mayorArea(triangulos));
    }
}

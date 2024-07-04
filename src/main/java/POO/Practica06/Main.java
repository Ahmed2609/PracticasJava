/*  Practica 06:
    Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
        1. Sumar dos números complejos
        2. Multiplicar 2 números complejos
        3. Comparar 2 números complejos (iguales o no)
        4. Multiplicar un número complejos por un entero
 */
package POO.Practica06;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            numero1 = a + bi
            numero2 = c + di
        */
        NumeroComplejo numero1,numero2,suma,mult;
        double a,b,c,d;
        int opcion,numero;
        
        do{
            System.out.println("\n\tMenu:");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar dos números complejos");
            System.out.println("3. Comparar dos números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("\nDigite el PRIMER numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        a = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = sc.nextDouble();
                        System.out.println("\nDigite el SEGUNDO numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        c = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = sc.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        suma = numero1.calcularSuma(numero2);
                        System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i");
                    break;
                case 2: System.out.println("\nDigite el PRIMER numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        a = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = sc.nextDouble();
                        System.out.println("\nDigite el SEGUNDO numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        c = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = sc.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        mult = numero1.calcularProducto(numero2);
                        System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
                    break;
                case 3: System.out.println("\nDigite el PRIMER numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        a = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = sc.nextDouble();
                        System.out.println("\nDigite el SEGUNDO numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        c = sc.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = sc.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        if (numero1.comprobarIgualdad(numero2)){
                            System.out.println("\nLos numeros complejos son iguales");
                        }else{
                            System.out.println("\nLos numeros complejos NO son iguales");
                        }
                    break;
                case 4:
                    System.out.println("\nDigite el PRIMER numero complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    System.out.print("Ahora digite el numero entero: ");
                    numero = sc.nextInt();
                    
                    numero1 = new NumeroComplejo(a, b);
                    
                    mult = numero1.multiplicarPorEntero(numero);
                    System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
                break;
            }
            System.out.println("");
        }while(opcion != 5);
        
        
        
    }
}

/*  Practica 07:
    Hacer un programa sencillo para realizar gestiones en un banco para 10 cual tendremos 2 clases 
    (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre, apellido y DNI. 
    EI cliente puede consultar saldo, así como ingresar y retirar dinero de sus cuentas. 
    Además cada cuenta se caracteriza por un número de cuenta y un saldo.
*/
package POO.Practica07;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {
    public static int buscarNumeroCuenta(Cuenta cuentas[], int n){
        int i=0, indice=0;
        boolean bandera = false;
        
        while ((i<cuentas.length) && (bandera==false)) {            
            if (cuentas[i].getNumeroCuenta() == n) {
                bandera = true;
                indice = i;
            }
            i++;
        }
        
        if (bandera == false) {
            indice = -1;
        }
        
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,apellido,dni;
        int numeroCuenta,nCuentas,opcion,indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.println("\n\t.:BBVA:.");
        System.out.print("Digite el nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = sc.nextLine();
        System.out.print("Digite el DNI del cliente: ");
        dni = sc.nextLine();
        System.out.print("Ahora, digite cuantas cuentas tiene: ");
        nCuentas = sc.nextInt();
        
        cuentas = new Cuenta[nCuentas];
        
        for (int i=0; i<cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta "+(i+1)+": ");
            System.out.print("Digite el numero de cuentas: ");
            numeroCuenta = sc.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = sc.nextDouble();
            
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
        
        do {            
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = sc.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if (indiceCuenta == -1) {
                            System.out.println("\nEl numero de cuenta ingresado NO existe");
                        }else{
                            System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                            cantidad = sc.nextDouble();
                            
                            cliente.ingresar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nIngreso realizado correctamente");
                            System.out.println("Saldo disponible: "+ cliente.consultar_saldo(indiceCuenta));
                        }
                    break;
                case 2: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = sc.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if (indiceCuenta == -1) {
                            System.out.println("\nEl numero de cuenta ingresado no existe");
                        }else{
                            System.out.print("\nDigite la cantidad de dinero que desea retirar: ");
                            cantidad = sc.nextDouble();
                            
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                        }
                    break;
                case 3: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = sc.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if (indiceCuenta == -1) {
                            System.out.println("\nEl numero de cuenta ingresado no existe");
                        }else{
                            System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                        }
                    break;
                case 4: break;
                default:    System.out.println("Error, ser confundio de numero de opcion");
            }
        } while (opcion != 4);
    }
}

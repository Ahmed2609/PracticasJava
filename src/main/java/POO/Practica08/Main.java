/*
    Una empresa de envío de paquetes tiene varias sucursales en todo el país. 
    Cada sucursal esta definida por su número de sucursal, dirección y ciudad. 
    Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen 
    en cuenta el precio del paquete y la prioridad, sabiendo que se cobra un dólar por kilo, 
    10 dólares más si la prioridad es alta y 20 si es express. Cada paquete enviado 
    tendrá un número de referencia y el DNI de la persona que lo envía.
 */
package POO.Practica08;

import java.util.Scanner;

/**
 * @author Ahmed Darhbane
 */
public class Main {
    public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal){
        int indice = 0;
        boolean encontrado = false;
        
        for (int i=0; i<contadorSucursal; i++) {
            if (t[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
            }
        }
        
        if (encontrado == false) {
            indice = -1;
        }
        
        return indice;
    }
    
    public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;
        
        for (int i=0; i<contadorPaquete; i++) {
            if (t[i].getNumeroPaquete()== numeroPaquete) {
                encontrado = true;
            }
        }
        
        if (encontrado == false) {
            indice = -1;
        }
        
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSucursal, numeroPaquete, prioridad, opcion;
        int contadorSucursal=0, contadorPaquete=0,indiceSucursal, indicePaquete;
        String direccion, ciudad, dni;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        
        do {            
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite la opcion de menu: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: System.out.print("\nDigite el numero de sucursal: ");
                        numeroSucursal = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite la direccion: ");
                        direccion = sc.nextLine();
                        System.out.print("Digite la ciudad: ");
                        ciudad = sc.nextLine();
                        
                        sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                        contadorSucursal++;
                    break;
                case 2: System.out.println("\nDigite el numero de Sucursal: ");
                        numeroSucursal = sc.nextInt();
                        
                        indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                        
                        if (indiceSucursal == -1) {
                            System.out.println("La sucursal no Existe");
                        }else{
                            System.out.print("\nDigite el numero de paquete: ");
                            numeroPaquete = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Digite el DNI de la persona: ");
                            dni = sc.nextLine();
                            System.out.print("Digite el peso del paquete: ");
                            peso = sc.nextDouble();
                            System.out.print("Digite la prioridad (0=normal, 1=alta, 2=express): ");
                            prioridad = sc.nextInt();
                            
                            paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                            
                            precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
                            System.out.println("\nEl precio es: "+ precioPaquete);
                            
                            contadorPaquete++;
                        }
                    break;
                case 3: System.out.print("\nDigite el numero de sucursal: ");
                        numeroSucursal = sc.nextInt();
                        
                        indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                        
                        if (indiceSucursal == -1) {
                            System.out.println("La sucursal no existe");
                        }else {
                            System.out.println("\nLos datos de la sucursal son: ");
                            System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                        }
                    break;
                case 4: System.out.println("\nDigite el numero de paquete: ");
                        numeroPaquete = sc.nextInt();
                        
                        indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                        
                        if (indicePaquete == -1) {
                            System.out.println("El paquete no existe");
                        }else {
                            System.out.println("\nLos datos del paquete son: ");
                            System.out.println(paquete[indicePaquete].mostrarDatos());
                        }
                    break;
                case 5: 
                        for (int i=0; i<contadorSucursal; i++) {
                            System.out.println("\nLos datos de la sucursal Nº" +(i+1)+": ");
                            System.out.println(sucursal[i].mostrarDatosSucursal());
                        }
                    break;
                case 6: 
                        for (int i=0; i<contadorPaquete; i++) {
                            System.out.println("\nLos datos de la sucursal Nº" +(i+1)+": ");
                            System.out.println(paquete[i].mostrarDatos());
                        }
                    break;
                case 7: break;
                default: System.out.println("Error, opcion de menu incorrecta"); break;
            }
            System.out.println("");
        } while (opcion != 7);

        
        
    }
}

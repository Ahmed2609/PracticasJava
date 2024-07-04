/*  Practica 04:
    Construir un programa para una competencia de atletismo, el programa debe gestionar 
    una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera, 
    al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
package POO.Practica04;

import java.util.Scanner;

/**
 * @author Ahmed
 */
public class Main {
    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice = 0;
        
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i=1; i<atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numeroAtleta,nAtletas,indiceAtletaGanador;
        float tiempoCarrera;
        
        System.out.print("Digite el numero de Atletas a participar: ");
        nAtletas = sc.nextInt();
        
        Atleta atletas[] = new Atleta[nAtletas];
        
        for (int i=0; i<atletas.length; i++) {
            sc.nextLine();
            System.out.println("\nDigite los datos del atleta "+(i+1)+": ");
            System.out.print("Numero del atleta: ");
            numeroAtleta = sc.nextInt();
            sc.nextLine();
            System.out.print("Nombre del atleta: ");
            nombre = sc.nextLine();
            System.out.print("Tiempo de carrera: ");
            tiempoCarrera = sc.nextFloat();
            
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador es:");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatos());
    }
}

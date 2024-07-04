/*  Practica 04:
    Construir un programa para una competencia de atletismo, el programa debe gestionar 
    una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera, 
    al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
package POO.Practica04;

/**
 * @author Ahmed Darhbane
 */
public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatos(){
        return "Numero de Atleta: "+numeroAtleta+"\nNombre de Atleta: "+nombre+"\nTiempo de carrera: "+tiempoCarrera+"\n";
    }
    
}

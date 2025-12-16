
import java.util.ArrayList;

/**
 * Representa un repositorio de algoritmos que pueden ser recogidos por los desarrolladores.
 * Esta clase es segura para hilos.
 */
public class Repositorio {

    private ArrayList<String> algoritmos;
    long tiempoTotalCompilacion;

    /**
     * Constructor para Repositorio.
     * @param algoritmos La lista inicial de algoritmos.
     */
    public Repositorio(ArrayList<String> algoritmos) {
        this.algoritmos = algoritmos;
        this.tiempoTotalCompilacion = 0;
    }

    /**
     * Recoge un algoritmo del repositorio.
     * Si el repositorio está vacío, el hilo esperará.
     */
    public synchronized void recogerAlgoritmo() {
       try {
           while (algoritmos.isEmpty()) {
               wait();
           }

           algoritmos.removeFirst();
           System.out.println("Se ha recogido un algoritmo.");
           int restantes = algoritmosRestantes();
           System.out.println("Quedan " + restantes + " algoritmos por recoger.");
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

    /**
     * Coloca dos nuevos algoritmos en el repositorio y notifica a los hilos en espera.
     * @param algoritmo1 El primer algoritmo a añadir.
     * @param algoritmo2 El segundo algoritmo a añadir.
     */
    public synchronized void colocarAlgoritmo(String algoritmo1, String algoritmo2) {
        algoritmos.add(algoritmo1);
        algoritmos.add(algoritmo2);
        System.out.println("Se han agregado dos algoritmos.");
        notifyAll(); // Notifica a los hilos que esperan en recogerAlgoritmo
    }

    /**
     * Suma el tiempo de compilación al total.
     * @param tiempo El tiempo a sumar.
     */
    public synchronized void sumarTiempo(long tiempo) {
        tiempoTotalCompilacion += tiempo;
    }

    /**
     * Devuelve el número de algoritmos restantes en el repositorio.
     * @return El número de algoritmos restantes.
     */
    public synchronized int algoritmosRestantes() {
        return algoritmos.size();
    }

    /**
     * Obtiene el tiempo total de compilación.
     * @return El tiempo total de compilación.
     */
    public synchronized long getTiempoTotalCompilacion() {
        return tiempoTotalCompilacion;
    }
}

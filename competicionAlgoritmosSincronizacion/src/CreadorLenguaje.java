
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * Representa un desarrollador que crea un lenguaje de programación.
 * Compite con otros desarrolladores para recoger algoritmos de un repositorio.
 */
public class CreadorLenguaje extends Thread {

    private CountDownLatch contadorComenzar;
    private CyclicBarrier barrera;
    private Repositorio repo;
    private String nombre;

    /**
     * Constructor para CreadorLenguaje.
     * @param contadorComenzar El CountDownLatch para sincronizar el inicio.
     * @param barrera La CyclicBarrier para sincronizar la conexión.
     * @param repo El repositorio de algoritmos.
     * @param nombre El nombre del desarrollador.
     */
    public CreadorLenguaje(CountDownLatch contadorComenzar, CyclicBarrier barrera, Repositorio repo, String nombre) {
        this.contadorComenzar = contadorComenzar;
        this.barrera = barrera;
        this.repo = repo;
        this.nombre = nombre;
    }

    /**
     * El método principal del hilo.
     * Espera a que todos los hilos estén listos, luego compite por los algoritmos en el repositorio.
     */
    @Override
    public void run() {
        try {
            contadorComenzar.await();
            System.out.println("Conectándose al servidor...");
            sleep(4);
            barrera.await();

            System.out.println("Conectado.");

            while (repo.algoritmosRestantes() != 0) {
                repo.recogerAlgoritmo();
                System.out.println(nombre + " ha recogido un algoritmo.");
                System.out.println(nombre + " está compilando algoritmos...");
                long tiempoCompilacion = 2;
                sleep(tiempoCompilacion);
                repo.sumarTiempo(tiempoCompilacion);

                System.out.println("Compilación terminada.");
            }

            System.out.println("El repositorio está vacio, " + nombre + " ha terminado.");
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}



import java.util.concurrent.CountDownLatch;

/**
 * Representa a Ada Lovelace, que genera algoritmos y los añade al repositorio.
 */
public class AdaLovelace extends Thread {
    private CountDownLatch detenerProduccion;
    private Repositorio repo;

    /**
     * Constructor para AdaLovelace.
     * @param detenerProduccion El CountDownLatch para señalar cuándo detener la producción.
     * @param rep El repositorio de algoritmos.
     */
    public AdaLovelace(CountDownLatch detenerProduccion, Repositorio rep) {
        this.detenerProduccion = detenerProduccion;
        this.repo = rep;
    }

    /**
     * El método principal del hilo.
     * Genera lotes de algoritmos y los añade al repositorio hasta que se le indica que se detenga.
     */
    @Override
    public void run() {
        while (detenerProduccion.getCount() > 0) {
            System.out.println("Ada va a generar un lote de algoritmos.");
            try {
                // Dormir durante 1 segundo
                sleep(1000); 
                repo.colocarAlgoritmo("Algoritmo", "Algoritmo");
                detenerProduccion.countDown();
                detenerProduccion.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Ada ha terminado su trabajo.");
    }
}

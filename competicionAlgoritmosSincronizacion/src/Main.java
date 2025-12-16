
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * La clase principal que simula la competición de desarrollo de lenguajes.
 */

public class Main {
    /**
     * El punto de entrada principal de la aplicación.
     * Crea e inicia los hilos de Ada Lovelace y los creadores de lenguajes.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
   public static void main(String[] args) {
        final int PRODUCCION_MAX = 50;
        final int MAX_CREADORES = 3;
        ArrayList<String> algoritmos = new ArrayList<>();
        Repositorio repositorio = new Repositorio(algoritmos);
        CountDownLatch detenerProduccion = new CountDownLatch(PRODUCCION_MAX);
        CyclicBarrier barrier = new CyclicBarrier(MAX_CREADORES);
        AdaLovelace ada = new AdaLovelace(detenerProduccion, repositorio);
        CreadorLenguaje dennis = new CreadorLenguaje(detenerProduccion,barrier, repositorio, "Dennis");
        CreadorLenguaje james = new CreadorLenguaje(detenerProduccion,barrier, repositorio, "James");
        CreadorLenguaje guido = new CreadorLenguaje(detenerProduccion,barrier, repositorio, "Guido");

        try {
          ada.start();
          dennis.start();
          james.start();
          guido.start();

          ada.join();
          dennis.join();
          james.join();
          guido.join();

      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }

       System.out.println("Ejecución terminada.");
       long tiempo = repositorio.getTiempoTotalCompilacion() / PRODUCCION_MAX;
       System.out.println("Tiempo medio de compilación: " + tiempo + "ms");
   }
}

# Competición de Algoritmos de Sincronización

Este proyecto es una simulación de una competición entre desarrolladores de lenguajes de programación para implementar algoritmos. La simulación utiliza hilos de Java para representar a los participantes y demuestra el uso de primitivas de sincronización como `CountDownLatch`, `CyclicBarrier` y bloques `synchronized` para gestionar el acceso a recursos compartidos.

## Descripción del Proyecto

La simulación consta de los siguientes componentes principales:

- **Main**: La clase principal que inicializa y coordina la simulación. Crea una instancia de `AdaLovelace` y varios `CreadorLenguaje`, y los inicia como hilos.
- **AdaLovelace**: Un hilo que representa a Ada Lovelace. Su función es generar nuevos algoritmos y añadirlos a un `Repositorio` compartido.
- **CreadorLenguaje**: Hilos que representan a los desarrolladores de lenguajes (Dennis, James, Guido). Compiten por recoger algoritmos del `Repositorio`, los "compilan" (simulado con un `sleep`) y registran el tiempo de compilación.
- **Repositorio**: Una clase segura para hilos que actúa como un repositorio central de algoritmos. Gestiona la adición y eliminación de algoritmos, asegurando que las operaciones estén sincronizadas para evitar condiciones de carrera.

## Sincronización

El proyecto utiliza varias técnicas de sincronización para coordinar los hilos:

- **`CountDownLatch`**: Se utiliza para dos propósitos:
    1. Para asegurar que los hilos `CreadorLenguaje` no comiencen a trabajar hasta que todos estén listos.
    2. Para señalar el final de la producción de algoritmos, deteniendo a `AdaLovelace` después de que se hayan generado un número determinado de algoritmos.
- **`CyclicBarrier`**: Se utiliza para sincronizar la conexión de los hilos `CreadorLenguaje` a un "servidor" simulado antes de que comiencen a competir por los algoritmos.
- **`synchronized`**: Los métodos en la clase `Repositorio` están sincronizados para garantizar que solo un hilo pueda modificar la lista de algoritmos a la vez, evitando así inconsistencias en los datos. Se utilizan `wait()` y `notifyAll()` para manejar el caso en que el repositorio está vacío.

## Cómo Ejecutar

1.  Compile los archivos Java.
2.  Ejecute la clase `Main`.

La salida mostrará el progreso de la simulación, incluyendo la generación y recogida de algoritmos, y los tiempos de compilación. Al final, se imprimirá el tiempo medio de compilación de los algoritmos.

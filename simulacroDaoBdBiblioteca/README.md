# Proyecto de Gestión de Biblioteca con JDBC y DAO

Este proyecto es una aplicación de consola en Java que demuestra el uso de JDBC para interactuar con una base de datos MySQL. La aplicación gestiona una base de datos de una biblioteca, con tablas para libros, autores y editoriales.

## Características

*   **Patrón de diseño DAO (Data Access Object):** La interacción con la base de datos se abstrae a través de interfaces y clases de implementación, promoviendo un código más limpio y mantenible.
*   **Operaciones CRUD completas:** Se implementan las operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) para las entidades `Libro`, `Escritor` y `Editorial`.
*   **Gestión de la conexión a la base de datos:** Se utiliza una clase de utilidad (`ConectionDB`) para gestionar la conexión a la base de datos de manera eficiente.
*   **Ejemplos de consultas complejas:** Se incluyen ejemplos de consultas que involucran múltiples tablas.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

*   `ejJDBCdao`: Paquete principal que contiene la clase `Jdbc` con métodos de ejemplo para interactuar con la base de datos.
*   `ejJDBCdao.dao`: Contiene las interfaces DAO (`LibroDAO`, `EscritorDAO`, `EditorialDAO`) que definen las operaciones de acceso a datos.
*   `ejJDBCdao.data`: Contiene las implementaciones de las interfaces DAO (`LibroDAOImpl`, `EscritorDAOImpl`, `EditorialDAOImpl`).
*   `ejJDBCdao.model`: Contiene las clases de modelo (`Libro`, `Escritor`, `Editorial`) que representan las entidades de la base de datos.
*   `ejJDBCdao.utils`: Contiene la clase de utilidad `ConectionDB` para gestionar la conexión a la base de datos.

## Requisitos

*   Java Development Kit (JDK) 8 o superior.
*   MySQL Server.
*   Un cliente de base de datos (como DBeaver, MySQL Workbench, etc.) para crear la base de datos y las tablas.

## Configuración de la Base de Datos

1.  **Crear la base de datos:**
    ```sql
    CREATE DATABASE biblioteca;
    ```
2.  **Usar la base de datos:**
    ```sql
    USE biblioteca;
    ```
3.  **Crear las tablas:**
    ```sql
    CREATE TABLE escritores (
        COD_ESCRITOR INT PRIMARY KEY,
        NOMBRE_ESCRITOR VARCHAR(100),
        PAIS_ESCRITOR VARCHAR(50),
        FECHA_NACIMIENTO DATE
    );

    CREATE TABLE editoriales (
        COD_EDITORIAL INT PRIMARY KEY,
        NOMBRE_EDITORIAL VARCHAR(100),
        SEDE_SOCIAL VARCHAR(100),
        TIPO VARCHAR(50)
    );

    CREATE TABLE libros (
        COD_LIBRO INT PRIMARY KEY,
        NOMBRE_LIBRO VARCHAR(100),
        NUMERO_PAGINAS INT,
        TEMA VARCHAR(50),
        AUTOR INT,
        EDITORIAL INT,
        FOREIGN KEY (AUTOR) REFERENCES escritores(COD_ESCRITOR),
        FOREIGN KEY (EDITORIAL) REFERENCES editoriales(COD_EDITORIAL)
    );
    ```
4.  **Configurar la conexión:**
    Abre el archivo `src/ejJDBCdao/utils/ConectionDB.java` y modifica los siguientes campos con tus credenciales de MySQL:
    ```java
    private static final String user = "tu_usuario";
    private static final String passwd = "tu_contraseña";
    ```

## Cómo Ejecutar

1.  Clona o descarga este repositorio.
2.  Abre el proyecto en tu IDE de Java preferido (Eclipse, IntelliJ IDEA, etc.).
3.  Ejecuta la clase `Main.java`.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes alguna sugerencia, por favor, abre un *issue* o envía un *pull request*.

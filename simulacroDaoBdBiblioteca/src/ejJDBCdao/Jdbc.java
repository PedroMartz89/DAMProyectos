package ejJDBCdao;

import ejJDBCdao.model.Editorial;
import ejJDBCdao.model.Escritor;
import ejJDBCdao.model.Libro;
import ejJDBCdao.utils.ConectionDB;

import java.sql.*;
import java.util.Scanner;

/**
 * Clase que contiene métodos para realizar operaciones directas con la base de datos
 * relacionadas con escritores, editoriales y libros.
 */
public class Jdbc {
	
	/**
     * Lista y muestra por consola los datos de todas las tablas: escritores, editoriales y libros.
     */
	public void listarDatosTodasTablas() {
		final String SQL_ESCRITORES = "SELECT * from escritores;";
        final String SQL_EDITORIALES = "SELECT * from editoriales;";
        final String SQL_LIBROS = "SELECT  * from libros;";
        try (Connection conn = ConectionDB.getInstance();
             Statement stmt = conn.createStatement();) {

            System.out.println("--- Escritores ---");
            ResultSet rsEscritores = stmt.executeQuery(SQL_ESCRITORES);
            while (rsEscritores.next()) {
                int cod_escritor = rsEscritores.getInt(1);
                String nombre = rsEscritores.getString(2);
                String pais = rsEscritores.getString(3);
                Date fecha = rsEscritores.getDate(4);

                Escritor e = new Escritor(cod_escritor, nombre, pais, fecha);
                System.out.println(e);
            }
            rsEscritores.close();

            ResultSet rsEditoriales = stmt.executeQuery(SQL_EDITORIALES);
            System.out.println("--- Editoriales ---");
            while (rsEditoriales.next()) {
                int cod_editorial = rsEditoriales.getInt(1);
                String nombre = rsEditoriales.getString(2);
                String sede = rsEditoriales.getString(3);
                String tipo = rsEditoriales.getString(4);

                Editorial e = new Editorial(cod_editorial, nombre, sede, tipo);
                System.out.println(e);
            }
            rsEditoriales.close();

            ResultSet rsLibros = stmt.executeQuery(SQL_LIBROS);
            System.out.println("--- Libros ---");
            while (rsLibros.next()) {
                int cod = rsLibros.getInt(1);
                String nombre = rsLibros.getString(2);
                int numPag = rsLibros.getInt(3);
                String tema  = rsLibros.getString(4);
                int autor = rsLibros.getInt(5);
                int editorial = rsLibros.getInt(6);

                Libro l = new Libro(cod, nombre, numPag, tema, autor, editorial);
                System.out.println(l);
            }

            rsLibros.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}

    /**
     * Solicita datos al usuario para dar de alta un nuevo libro en la base de datos.
     * Verifica la existencia del autor y la editorial antes de la inserción.
     */
    public void darLibroDeAlta() {
        final String SQL_ID_AUTOR = "SELECT COD_ESCRITOR FROM escritores WHERE COD_ESCRITOR = ?;";
        final String SQL_ID_EDITORIAL = "SELECT COD_EDITORIAL FROM editoriales WHERE COD_EDITORIAL = ?;";
        final String SQL_INSERT_LIBRO = "INSERT INTO libros (COD_LIBRO, NOMBRE_LIBRO, NUMERO_PAGINAS, TEMA, AUTOR, EDITORIAL) VALUES (?, ?, ?, ?, ?, ?);";

        try (Scanner sc = new Scanner(System.in);
             Connection conn = ConectionDB.getInstance()) {

            System.out.println("Introduce el código del libro: ");
            int cod_libro = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea pendiente

            System.out.println("Introduce el nombre del libro: ");
            String nombre_libro = sc.nextLine();

            System.out.println("Introduce el número de páginas: ");
            int numPag = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea pendiente

            System.out.println("Introduce el tema: ");
            String tema = sc.nextLine();

            // Buscar el autor
            int autor = obtenerIdValido(sc, SQL_ID_AUTOR, "Introduce el id del autor: ", "Autor no encontrado, intenta nuevamente.");

            // Buscar la editorial
            int editorial = obtenerIdValido(sc, SQL_ID_EDITORIAL, "Introduce el id de la editorial: ", "Editorial no encontrada, intenta nuevamente.");

            // Insertar el libro
            try (PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT_LIBRO)) {
                pstmt.setInt(1, cod_libro);
                pstmt.setString(2, nombre_libro);
                pstmt.setInt(3, numPag);
                pstmt.setString(4, tema);
                pstmt.setInt(5, autor);
                pstmt.setInt(6, editorial);
                pstmt.executeUpdate();
                System.out.println("Se ha creado el libro.");
            }

        } catch (SQLException e) {
            System.out.println("No se ha podido crear el libro por un error: " + e.getMessage());
            e.printStackTrace();  // Para mayor detalle de la excepción
        }
    }

    /**
     * Método auxiliar para validar la existencia de un ID en una tabla específica.
     *
     * @param sc  para leer la entrada del usuario.
     * @param sql Consulta SQL para verificar el ID.
     * @param mensajeSolicitud Mensaje para solicitar el ID.
     * @param mensajeError Mensaje a mostrar si el ID no es válido.
     * @return El ID válido introducido por el usuario.
     * @throws SQLException Si ocurre un error de acceso a la base de datos.
     */
    private int obtenerIdValido(Scanner sc, String sql, String mensajeSolicitud, String mensajeError) throws SQLException {
        boolean encontrado = false;
        int id = 0;

        while (!encontrado) {
            System.out.println(mensajeSolicitud);
            int idEntrada = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea pendiente

            try (PreparedStatement pstmt = ConectionDB.getInstance().prepareStatement(sql)) {
                pstmt.setInt(1, idEntrada);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    id = idEntrada;
                    encontrado = true;
                } else {
                    System.out.println(mensajeError);
                }
            }
        }

        return id;
    }


    /**
     * Solicita el ID de un escritor y lo elimina de la base de datos si existe.
     */
	public void eliminarEscritor() {
        final String SQL_DELETE = "DELETE FROM escritores WHERE cod_escritor = ?;";
        final String SQL_SELECT_ID_ESCRITOR = "SELECT COD_ESCRITOR FROM escritores WHERE COD_ESCRITOR = ?;";
		try (Scanner sc = new Scanner(System.in);
             Connection conn = ConectionDB.getInstance();
             ){

            Statement stmt = conn.createStatement();
            int id = obtenerIdValido(sc, SQL_SELECT_ID_ESCRITOR, "Introduce el código del escritor a eliminar: ", "No se ha encontrado el escritor.");

            if (id == 0) {
                return;
            }
            PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();


        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	/**
     * Muestra los libros escritos por un autor específico, solicitando el nombre del autor.
     */
	public void mostrarLibrosEscritor() {
		final String SQL_SELECT_LIBROS_AUTOR = "SELECT DISTINCT l.NOMBRE_LIBRO, l.NUMERO_PAGINAS, l.TEMA, e.NOMBRE_EDITORIAL " +
                "FROM libros l " +
                "JOIN escritores s ON l.AUTOR = s.COD_ESCRITOR " +
                "JOIN editoriales e ON l.EDITORIAL = e.COD_EDITORIAL " +
                "WHERE s.NOMBRE_ESCRITOR = ?";

        try (Scanner sc = new Scanner(System.in);
             Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(SQL_SELECT_LIBROS_AUTOR);){

            System.out.println("Introduce el nombre de un escritor para ver todos sus libros: ");
            String nombreEscritor = sc.nextLine();

            pstmt.setString(1, nombreEscritor);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String nombreLibro = rs.getString(1);
                int numPag = rs.getInt(2);
                String tema = rs.getString(3);
                String editorial = rs.getString(4);
                System.out.printf("Nombre: %s - Páginas: %d - Tema: %s - Editorial: %s", nombreLibro, numPag, tema, editorial);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

}

package ejJDBCdao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase de utilidad para gestionar la conexión a la base de datos.
 * Utiliza el patrón Singleton para asegurar una única instancia de la conexión.
 */
public class ConectionDB {

    private static final String user = "user";
    private static final String passwd = "toty";
    private static final String url = "jdbc:mysql://localhost/";
    private static String database = "biblioteca";
    private static Connection connection;

    /**
     * Obtiene una instancia de la conexión a la base de datos.
     * Si la conexión no existe, la crea.
     *
     * @return La instancia de la conexión a la base de datos.
     * @throws RuntimeException Si ocurre un error al establecer la conexión.
     */
    public static Connection getInstance() {

        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url+database, user, passwd);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

}

package ejJDBCdao.data;

import ejJDBCdao.dao.EscritorDAO;
import ejJDBCdao.model.Escritor;
import ejJDBCdao.utils.ConectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz EscritorDAO que proporciona acceso a datos
 * para la entidad Escritor utilizando JDBC.
 */
public class EscritorDAOImpl implements EscritorDAO {

    /**
     * Inserta un nuevo registro de escritor en la base de datos.
     *
     * @param escritor Objeto de la clase Escritor que contiene los datos a guardar (código, nombre, país, fecha de nacimiento).
     */
    @Override
    public void create(Escritor escritor) {
        String sql = "INSERT INTO escritor (cod_escritor, nombre_escritor, pais_escritor, fecha_nacimiento) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, escritor.getCod_escritor());
            pstmt.setString(2, escritor.getNombre_escritor());
            pstmt.setString(3, escritor.getPais_escritor());
            pstmt.setDate(4, escritor.getFecha_nacimiento());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Busca y recupera un escritor de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_escritor) del escritor que se desea buscar.
     * @return El objeto Escritor encontrado con todos sus datos, o null si no existe ningún escritor con ese ID.
     */
    @Override
    public Escritor read(int id) {
        String sql = "SELECT * FROM escritor WHERE cod_escritor = ?";
        Escritor escritor = null;
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                escritor = new Escritor(
                        rs.getInt("cod_escritor"),
                        rs.getString("nombre_escritor"),
                        rs.getString("pais_escritor"),
                        rs.getDate("fecha_nacimiento")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return escritor;
    }

    /**
     * Actualiza la información de un escritor existente en la base de datos.
     *
     * @param escritor Objeto Escritor con los datos modificados. Se usará su cod_escritor para identificar el registro a actualizar.
     */
    @Override
    public void update(Escritor escritor) {
        String sql = "UPDATE escritor SET nombre_escritor = ?, pais_escritor = ?, fecha_nacimiento = ? WHERE cod_escritor = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, escritor.getNombre_escritor());
            pstmt.setString(2, escritor.getPais_escritor());
            pstmt.setDate(3, escritor.getFecha_nacimiento());
            pstmt.setInt(4, escritor.getCod_escritor());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un registro de escritor de la base de datos.
     *
     * @param id El código único (cod_escritor) del escritor que se desea eliminar.
     */
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM escritor WHERE cod_escritor = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Recupera el listado completo de escritores almacenados en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Escritor correspondientes a todos los registros de la tabla.
     */
    @Override
    public List<Escritor> readAll() {
        String sql = "SELECT * FROM escritor";
        List<Escritor> escritores = new ArrayList<>();
        try (Connection conn = ConectionDB.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                escritores.add(new Escritor(
                        rs.getInt("cod_escritor"),
                        rs.getString("nombre_escritor"),
                        rs.getString("pais_escritor"),
                        rs.getDate("fecha_nacimiento")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return escritores;
    }
}

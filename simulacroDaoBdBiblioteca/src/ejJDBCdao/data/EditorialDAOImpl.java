package ejJDBCdao.data;

import ejJDBCdao.dao.EditorialDAO;
import ejJDBCdao.model.Editorial;
import ejJDBCdao.utils.ConectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz EditorialDAO que proporciona acceso a datos
 * para la entidad Editorial utilizando JDBC.
 */
public class EditorialDAOImpl implements EditorialDAO {

    /**
     * Inserta un nuevo registro de editorial en la base de datos.
     *
     * @param editorial Objeto de la clase Editorial que contiene los datos a guardar (código, nombre, sede, tipo).
     */
    @Override
    public void create(Editorial editorial) {
        String sql = "INSERT INTO editorial (cod_editorial, nombre_editorial, sede_social, tipo) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, editorial.getCod_editorial());
            pstmt.setString(2, editorial.getNombre_editorial());
            pstmt.setString(3, editorial.getSede_social());
            pstmt.setString(4, editorial.getTipo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Busca y recupera una editorial de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_editorial) de la editorial que se desea buscar.
     * @return El objeto Editorial encontrado con todos sus datos, o null si no existe ninguna editorial con ese ID.
     */
    @Override
    public Editorial read(int id) {
        String sql = "SELECT * FROM editorial WHERE cod_editorial = ?";
        Editorial editorial = null;
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                editorial = new Editorial(
                        rs.getInt("cod_editorial"),
                        rs.getString("nombre_editorial"),
                        rs.getString("sede_social"),
                        rs.getString("tipo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return editorial;
    }

    /**
     * Actualiza la información de una editorial existente en la base de datos.
     *
     * @param editorial Objeto Editorial con los datos modificados. Se usará su cod_editorial para identificar el registro a actualizar.
     */
    @Override
    public void update(Editorial editorial) {
        String sql = "UPDATE editorial SET nombre_editorial = ?, sede_social = ?, tipo = ? WHERE cod_editorial = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, editorial.getNombre_editorial());
            pstmt.setString(2, editorial.getSede_social());
            pstmt.setString(3, editorial.getTipo());
            pstmt.setInt(4, editorial.getCod_editorial());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un registro de editorial de la base de datos.
     *
     * @param id El código único (cod_editorial) de la editorial que se desea eliminar.
     */
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM editorial WHERE cod_editorial = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Recupera el listado completo de editoriales almacenadas en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Editorial correspondientes a todos los registros de la tabla.
     */
    @Override
    public List<Editorial> readAll() {
        String sql = "SELECT * FROM editorial";
        List<Editorial> editoriales = new ArrayList<>();
        try (Connection conn = ConectionDB.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                editoriales.add(new Editorial(
                        rs.getInt("cod_editorial"),
                        rs.getString("nombre_editorial"),
                        rs.getString("sede_social"),
                        rs.getString("tipo")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return editoriales;
    }
}

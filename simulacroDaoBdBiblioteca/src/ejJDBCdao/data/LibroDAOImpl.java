package ejJDBCdao.data;

import ejJDBCdao.dao.LibroDAO;
import ejJDBCdao.model.Libro;
import ejJDBCdao.utils.ConectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz LibroDAO que proporciona acceso a datos
 * para la entidad Libro utilizando JDBC.
 */
public class LibroDAOImpl implements LibroDAO {

    /**
     * Inserta un nuevo registro de libro en la base de datos.
     *
     * @param libro Objeto de la clase Libro que contiene los datos a guardar (código, nombre, páginas, tema, autor, editorial).
     */
    @Override
    public void create(Libro libro) {
        String sql = "INSERT INTO libro (cod_libro, nombre_libro, numero_paginas, tema, autor, editorial) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, libro.getCod_libro());
            pstmt.setString(2, libro.getNombre_libro());
            pstmt.setInt(3, libro.getNumero_paginas());
            pstmt.setString(4, libro.getTema());
            pstmt.setInt(5, libro.getAutor());
            pstmt.setInt(6, libro.getEditorial());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Busca y recupera un libro de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_libro) del libro que se desea buscar.
     * @return El objeto Libro encontrado con todos sus datos, o null si no existe ningún libro con ese ID.
     */
    @Override
    public Libro read(int id) {
        String sql = "SELECT * FROM libro WHERE cod_libro = ?";
        Libro libro = null;
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                libro = new Libro(
                        rs.getInt("cod_libro"),
                        rs.getString("nombre_libro"),
                        rs.getInt("numero_paginas"),
                        rs.getString("tema"),
                        rs.getInt("autor"),
                        rs.getInt("editorial")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libro;
    }

    /**
     * Actualiza la información de un libro existente en la base de datos.
     *
     * @param libro Objeto Libro con los datos modificados. Se usará su cod_libro para identificar el registro a actualizar.
     */
    @Override
    public void update(Libro libro) {
        String sql = "UPDATE libro SET nombre_libro = ?, numero_paginas = ?, tema = ?, autor = ?, editorial = ? WHERE cod_libro = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, libro.getNombre_libro());
            pstmt.setInt(2, libro.getNumero_paginas());
            pstmt.setString(3, libro.getTema());
            pstmt.setInt(4, libro.getAutor());
            pstmt.setInt(5, libro.getEditorial());
            pstmt.setInt(6, libro.getCod_libro());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un registro de libro de la base de datos.
     *
     * @param id El código único (cod_libro) del libro que se desea eliminar.
     */
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM libro WHERE cod_libro = ?";
        try (Connection conn = ConectionDB.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Recupera el listado completo de libros almacenados en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Libro correspondientes a todos los registros de la tabla.
     */
    @Override
    public List<Libro> readAll() {
        String sql = "SELECT * FROM libro";
        List<Libro> libros = new ArrayList<>();
        try (Connection conn = ConectionDB.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                libros.add(new Libro(
                        rs.getInt("cod_libro"),
                        rs.getString("nombre_libro"),
                        rs.getInt("numero_paginas"),
                        rs.getString("tema"),
                        rs.getInt("autor"),
                        rs.getInt("editorial")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
}

package ejJDBCdao.dao;

import ejJDBCdao.model.Libro;

import java.util.List;

/**
 * Interfaz que define las operaciones de acceso a datos (CRUD) para la entidad Libro.
 */
public interface LibroDAO {

    /**
     * Inserta un nuevo registro de libro en la base de datos.
     *
     * @param libro Objeto de la clase Libro que contiene los datos a guardar (código, nombre, páginas, tema, autor, editorial).
     */
    void create(Libro libro);

    /**
     * Busca y recupera un libro de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_libro) del libro que se desea buscar.
     * @return El objeto Libro encontrado con todos sus datos, o null si no existe ningún libro con ese ID.
     */
    Libro read(int id);

    /**
     * Actualiza la información de un libro existente en la base de datos.
     *
     * @param libro Objeto Libro con los datos modificados. Se usará su cod_libro para identificar el registro a actualizar.
     */
    void update(Libro libro);

    /**
     * Elimina un registro de libro de la base de datos.
     *
     * @param id El código único (cod_libro) del libro que se desea eliminar.
     */
    void delete(int id);

    /**
     * Recupera el listado completo de libros almacenados en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Libro correspondientes a todos los registros de la tabla.
     */
    List<Libro> readAll();
}

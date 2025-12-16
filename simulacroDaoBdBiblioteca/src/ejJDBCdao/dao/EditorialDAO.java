package ejJDBCdao.dao;

import ejJDBCdao.model.Editorial;

import java.util.List;

/**
 * Interfaz que define las operaciones de acceso a datos (CRUD) para la entidad Editorial.
 */
public interface EditorialDAO {

    /**
     * Inserta un nuevo registro de editorial en la base de datos.
     *
     * @param editorial Objeto de la clase Editorial que contiene los datos a guardar (código, nombre, sede, tipo).
     */
    void create(Editorial editorial);

    /**
     * Busca y recupera una editorial de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_editorial) de la editorial que se desea buscar.
     * @return El objeto Editorial encontrado con todos sus datos, o null si no existe ninguna editorial con ese ID.
     */
    Editorial read(int id);

    /**
     * Actualiza la información de una editorial existente en la base de datos.
     *
     * @param editorial Objeto Editorial con los datos modificados. Se usará su cod_editorial para identificar el registro a actualizar.
     */
    void update(Editorial editorial);

    /**
     * Elimina un registro de editorial de la base de datos.
     *
     * @param id El código único (cod_editorial) de la editorial que se desea eliminar.
     */
    void delete(int id);

    /**
     * Recupera el listado completo de editoriales almacenadas en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Editorial correspondientes a todos los registros de la tabla.
     */
    List<Editorial> readAll();
}

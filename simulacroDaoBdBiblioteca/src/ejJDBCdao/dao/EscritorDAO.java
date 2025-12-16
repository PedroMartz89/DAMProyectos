package ejJDBCdao.dao;

import ejJDBCdao.model.Escritor;

import java.util.List;

/**
 * Interfaz que define las operaciones de acceso a datos (CRUD) para la entidad Escritor.
 */
public interface EscritorDAO {

    /**
     * Inserta un nuevo registro de escritor en la base de datos.
     *
     * @param escritor Objeto de la clase Escritor que contiene los datos a guardar (código, nombre, país, fecha de nacimiento).
     */
    void create(Escritor escritor);

    /**
     * Busca y recupera un escritor de la base de datos utilizando su identificador único.
     *
     * @param id El código único (cod_escritor) del escritor que se desea buscar.
     * @return El objeto Escritor encontrado con todos sus datos, o null si no existe ningún escritor con ese ID.
     */
    Escritor read(int id);

    /**
     * Actualiza la información de un escritor existente en la base de datos.
     *
     * @param escritor Objeto Escritor con los datos modificados. Se usará su cod_escritor para identificar el registro a actualizar.
     */
    void update(Escritor escritor);

    /**
     * Elimina un registro de escritor de la base de datos.
     *
     * @param id El código único (cod_escritor) del escritor que se desea eliminar.
     */
    void delete(int id);

    /**
     * Recupera el listado completo de escritores almacenados en la base de datos.
     *
     * @return Una lista (List) que contiene objetos Escritor correspondientes a todos los registros de la tabla.
     */
    List<Escritor> readAll();
}

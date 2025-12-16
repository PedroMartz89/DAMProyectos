package ejJDBCdao.model;

/**
 * Clase que representa la entidad Editorial.
 * Contiene información sobre una editorial, incluyendo su código, nombre, sede social y tipo.
 */
public class Editorial {

    private int cod_editorial;
    private String nombre_editorial;
    private String sede_social;
    private String tipo;

    /**
     * Constructor para crear un nuevo objeto Editorial.
     *
     * @param cod_editorial    El código único de la editorial.
     * @param nombre_editorial El nombre de la editorial.
     * @param sede_social      La ubicación de la sede social de la editorial.
     * @param tipo             El tipo de editorial (por ejemplo, "Independiente", "Grande", etc.).
     */
    public Editorial(int cod_editorial, String nombre_editorial, String sede_social, String tipo) {
        this.cod_editorial = cod_editorial;
        this.nombre_editorial = nombre_editorial;
        this.sede_social = sede_social;
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en cadena del objeto Editorial.
     *
     * @return Una cadena que contiene los detalles de la editorial.
     */
    @Override
    public String toString() {
        return "Editorial{" +
                "cod_editorial=" + cod_editorial +
                ", nombre_editorial='" + nombre_editorial + '\'' +
                ", sede_social='" + sede_social + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    // Getters y Setters

    public int getCod_editorial() {
        return cod_editorial;
    }

    public void setCod_editorial(int cod_editorial) {
        this.cod_editorial = cod_editorial;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    public String getSede_social() {
        return sede_social;
    }

    public void setSede_social(String sede_social) {
        this.sede_social = sede_social;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

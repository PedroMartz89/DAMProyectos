package ejJDBCdao.model;

import java.sql.Date;

/**
 * Clase que representa la entidad Escritor.
 * Contiene información sobre un escritor, incluyendo su código, nombre, país de origen y fecha de nacimiento.
 */
public class Escritor {
    private int cod_escritor;
    private String nombre_escritor;
    private String pais_escritor;
    private Date fecha_nacimiento;

    /**
     * Constructor para crear un nuevo objeto Escritor.
     *
     * @param cod_escritor      El código único del escritor.
     * @param nombre_escritor   El nombre del escritor.
     * @param pais_escritor     El país de origen del escritor.
     * @param fecha_nacimiento  La fecha de nacimiento del escritor.
     */
    public Escritor(int cod_escritor, String nombre_escritor, String pais_escritor, Date fecha_nacimiento) {
        this.cod_escritor = cod_escritor;
        this.nombre_escritor = nombre_escritor;
        this.pais_escritor = pais_escritor;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Devuelve una representación en cadena del objeto Escritor.
     *
     * @return Una cadena que contiene los detalles del escritor.
     */
    @Override
    public String toString() {
        return "Escritor{" +
                "cod_escritor=" + cod_escritor +
                ", nombre_escritor='" + nombre_escritor + '\'' +
                ", pais_escritor='" + pais_escritor + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                '}';
    }

    // Getters y Setters

    public int getCod_escritor() {
        return cod_escritor;
    }

    public void setCod_escritor(int cod_escritor) {
        this.cod_escritor = cod_escritor;
    }

    public String getNombre_escritor() {
        return nombre_escritor;
    }

    public void setNombre_escritor(String nombre_escritor) {
        this.nombre_escritor = nombre_escritor;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPais_escritor() {
        return pais_escritor;
    }

    public void setPais_escritor(String pais_escritor) {
        this.pais_escritor = pais_escritor;
    }
}

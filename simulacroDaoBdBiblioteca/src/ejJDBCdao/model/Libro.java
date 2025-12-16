package ejJDBCdao.model;

/**
 * Clase que representa la entidad Libro.
 * Contiene información sobre un libro, incluyendo su código, nombre, número de páginas,
 * tema, y los identificadores del autor y la editorial.
 */
public class Libro {

    private int cod_libro;
    private String nombre_libro;
    private int numero_paginas;
    private String tema;
    private int autor;
    private int editorial;

    /**
     * Constructor para crear un nuevo objeto Libro.
     *
     * @param cod_libro      El código único del libro.
     * @param nombre_libro   El nombre o título del libro.
     * @param numero_paginas El número total de páginas del libro.
     * @param tema           La categoría o género del libro.
     * @param autor          El identificador del autor del libro.
     * @param editorial      El identificador de la editorial del libro.
     */
    public Libro(int cod_libro, String nombre_libro, int numero_paginas, String tema, int autor, int editorial) {
        this.cod_libro = cod_libro;
        this.nombre_libro = nombre_libro;
        this.numero_paginas = numero_paginas;
        this.tema = tema;
        this.autor = autor;
        this.editorial = editorial;
    }

    /**
     * Devuelve una representación en cadena del objeto Libro.
     *
     * @return Una cadena que contiene los detalles del libro.
     */
    @Override
    public String toString() {
        return "Libro{" +
                "cod_libro=" + cod_libro +
                ", nombre_libro='" + nombre_libro + '\'' +
                ", numero_paginas=" + numero_paginas +
                ", tema='" + tema + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                '}';
    }

    // Getters y Setters

    public int getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(int cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }
}

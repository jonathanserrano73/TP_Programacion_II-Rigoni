package Kata3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio >= 1900 && nuevoAnio <= 2025) {
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Error el año de publicacion debe estar entre 1900 y el año actual\n");
        }

    }
}
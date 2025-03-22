package Kata1;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Apellido: " + this.apellido + "\nNombre: " + this.nombre + "\nCurso: " + this.curso + "\nCalificación: " + this.calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (this.calificacion + puntos <= 10.0) {
            this.calificacion += puntos;
        } else {
            this.calificacion = 10.0;
        }

    }

    public void bajarCalificion(double puntos) {
        if (this.calificacion + puntos >= 0.0) {
            this.calificacion -= puntos;
        } else {
            this.calificacion = 0.0;
        }

    }
}

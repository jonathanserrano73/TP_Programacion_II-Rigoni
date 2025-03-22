package Kata2;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nEdad: " + this.edad);
    }

    public void cumplirAnios(int anio) {
        this.edad += anio;
    }
}

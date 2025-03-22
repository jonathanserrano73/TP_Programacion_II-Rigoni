package Kata1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante("Jonathan", "Serrano", "Programacion", 8.0);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(4.0);
        System.out.println("Calificación: " + estudiante1.getCalificacion());
        estudiante1.bajarCalificion(3.0);
        System.out.println("Calificación: " + estudiante1.getCalificacion());
    }
}

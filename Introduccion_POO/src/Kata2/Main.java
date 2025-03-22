package Kata2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Cristobal", "Schnauzer miniatura", 3);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(1);
        System.out.println("Informacion actualizada");
        mascota1.mostrarInfo();
    }
}

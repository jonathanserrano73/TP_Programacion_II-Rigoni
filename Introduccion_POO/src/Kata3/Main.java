package Kata3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Misery", "Stephen King", 1987);
        System.out.println("Informacion actual: ");
        System.out.println("Titulo: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nAño Publicacion: " + libro1.getAnioPublicacion() + "\n");
        libro1.setAnioPublicacion(1700);
        libro1.setAnioPublicacion(1988);
        System.out.println("Informacion actualizada: ");

        System.out.println("Titulo: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nAño Publicacion: " + libro1.getAnioPublicacion());
    }
}

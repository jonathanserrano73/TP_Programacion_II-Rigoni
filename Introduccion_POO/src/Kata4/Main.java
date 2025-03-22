package Kata4;

public class Main {
    public static void main(String[] args) {

        Gallina gallina1 = new Gallina(1, 3);
        Gallina gallina2 = new Gallina(1, 5);

        System.out.println("Estado de las Gallinas: ");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevo(2);
        gallina2.ponerHuevo(3);

        gallina1.envejecer();
        gallina2.envejecer();

        System.out.println("Estado Actualizado de las Gallinas: ");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

    }
}
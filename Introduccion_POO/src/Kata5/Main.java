package Kata5;

public class Main {
    public static void main(String[] args) {

        NaveEspacial nave1= new NaveEspacial("Endeavour", 50);

        nave1.mostrarEstado();

        nave1.avanzar(60);

        nave1.recargarCombustible(40);

        nave1.avanzar(60);

        nave1.mostrarEstado();

        System.out.println("------------------------------");
        nave1.mostrarEstado();

        nave1.avanzar(50);

        nave1.recargarCombustible(60);
        nave1.avanzar(50);

        nave1.mostrarEstado();


    }
}
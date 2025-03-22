package Kata5;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar(){
        if (combustible>10) {
            combustible -= 10;
            System.out.println("La Nave "+nombre+ " despego");
        }else{
            System.out.println("Combustible Insuficiente para Despegar");
        }
    }

    public void avanzar(int distancia){
        if (combustible>=distancia+10){
            despegar();
            combustible-=distancia;
            System.out.println("La nave recorrio un distancia de: "+distancia+"\n");
        }else{
            System.out.println("Combustible Insuficiente para Avanzar");
        }
    }

    public void recargarCombustible (int cantidad){
        if (combustible+cantidad<=100){
            combustible+=cantidad;
            System.out.println("Combustible actual: " + combustible+"\n");
        }else{
            combustible=100;
            System.out.println("Tanque de combustible lleno");
        }
    }
    public void mostrarEstado(){
        System.out.println("Estado Actual de la Nave: ");
        System.out.println("Nombre Nave: "+nombre+"\nCombustible Actual: "+combustible+"\n");
    }
}
package Kata4;

public class Gallina {

    private String  idGallina;
    private int edad;
    private int huevospuestos;
    private static int contador=1;

    public Gallina( int edad, int huevospuestos) {
        this.idGallina = "GALLINA"+ String.format("%03d", contador++) ;
        this.edad = edad;
        this.huevospuestos = huevospuestos;
    }

    public void ponerHuevo(int cant){
        huevospuestos+=cant;
    }

    public void envejecer(){
        edad+=1;
    }
    public void mostrarEstado(){
        System.out.println("idGallina: "+idGallina+"\nEdad: "+edad+"\nHuevos Puestos: "+huevospuestos+"\n");
    }
}
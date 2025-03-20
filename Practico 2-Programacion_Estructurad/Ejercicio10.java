import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int stockActual, cantidadVendida, cantidadRecibida, stockNuevo;

        System.out.println("Ingrese el stock actual: ");
        stockActual=sc.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida=sc.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida= sc.nextInt();

        stockNuevo=actualizarStock(stockActual,cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+stockNuevo);

    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock;
        nuevoStock=stockActual-cantidadVendida+cantidadRecibida;
        return nuevoStock;
    }
}

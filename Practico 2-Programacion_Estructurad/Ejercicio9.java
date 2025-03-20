import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double precio, peso, costoEnvio;
        String zona;
        System.out.println("Ingrese el precio de producto: ");
        precio=sc.nextDouble();

        System.out.println("Ingrese el peso del paquete: ");
        peso=sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        zona= sc.nextLine().toLowerCase();

        costoEnvio=calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: "+costoEnvio);
        calcularTotalCompra(precio, costoEnvio);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio;
        costoEnvio=0;
        if (zona.equals("nacional")){
            costoEnvio=peso*5;
        } else if (zona.equals("internacional")) {
            costoEnvio=peso*10;
        }

        return costoEnvio;
    }

    public static void calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra;

        totalCompra=precioProducto+costoEnvio;

        System.out.println("El total a pagar es: "+ totalCompra);
    }
}

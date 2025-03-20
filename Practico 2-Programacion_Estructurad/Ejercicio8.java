import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioBase, impuesto, descuento;

        System.out.println("Ingrese el precio base del producto: ");
        precioBase=sc.nextDouble();

        System.out.println("Ingrese el impuesto en porcentaje: ");
        impuesto=sc.nextDouble();
        impuesto=impuesto/100;

        System.out.println("Ingrese el descuento en porcentaje: ");
        descuento=sc.nextDouble();
        descuento=descuento/100;

        calcularPrecioFinal(precioBase, impuesto, descuento);
        }
    public static void calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal=precioBase+(precioBase*impuesto)-(precioBase*descuento);

        System.out.println("El precio final del producto es: "+precioFinal);

    }
}

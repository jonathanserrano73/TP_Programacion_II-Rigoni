import java.util.Scanner;

public class Ejercicio11 {
    static double DESCUENTO_ESPECIAL=0.10;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double precio;
        System.out.println("Ingrese el precio del producto: ");
        precio=sc.nextDouble();

        calcularDescuentoEspecial(precio);


    }

    public static void calcularDescuentoEspecial(double precio){

        double descuentoAplicado, precioFinal;
        descuentoAplicado=precio*DESCUENTO_ESPECIAL;
        System.out.println("El descuento aplicado es: "+ descuentoAplicado);
        precioFinal=precio-descuentoAplicado;
        System.out.println("El precio fina con descuento es: "+ precioFinal);

    }
}

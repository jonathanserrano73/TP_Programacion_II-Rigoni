import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double precio, precioFinal;
        String categoria;

        System.out.println("Indique el precio del producto: ");
        precio=sc.nextDouble();
        sc.nextLine();

        System.out.println("Indique la categoria: ");
        categoria = sc.nextLine().toUpperCase();
        while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C") ){
            System.out.println("Error. Vuelva a ingresar la Categoria ( A, B o C");
            categoria=sc.nextLine().toUpperCase();
        }

        switch (categoria){
            case "A":
                System.out.println("Descuento aplicado: 10%");
                precioFinal=precio-(precio*0.10);
                System.out.println("Precio Final: " + precioFinal);
                break;
            case "B":
                System.out.println("Descuento aplicado: 15%");
                precioFinal=precio-(precio*0.15);
                System.out.println("Precio Final: " + precioFinal);
                break;
            case "C":
                System.out.println("Descuento Aplicado: 20%");
                precioFinal=precio-(precio*0.2);
                System.out.println("Precio Final: " + precioFinal);
                break;
            default:
                System.out.println("Error ");
        }
    }
}

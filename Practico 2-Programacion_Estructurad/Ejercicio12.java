
public class Ejercicio12 {
    public static void main(String[] args) {

        double [] precios= {199.99 , 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios Originales: ");
        for (double precio:precios){

            System.out.println("Precio: $"+precio);
        }

        precios[2] =129.99;
        System.out.println("Precios Modificados: ");
        for (double precio:precios){
            System.out.println("Precio: $"+precio);
        }
    }

}

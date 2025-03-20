public class Ejercicio13 {

    public static void preciosOriginales(double[] precios,int i){
        if (i== precios.length){
            return;
        }
        System.out.println("Precio: $"+precios[i]);
        preciosOriginales(precios, i+1);
    }
    public static void preciosModificados(double[] precios, int i){
        if (i== precios.length){
            return;
        }
        System.out.println("Precio: $"+precios[i]);
        preciosModificados(precios,i+1);
    }

    public static void main(String[] args) {
        double [] precios= {199.99 , 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios Originales: ");
        preciosOriginales(precios,0);

        precios[2]=129.99;

        System.out.println("Precios Modificados: ");
        preciosOriginales(precios,0);
    }
}

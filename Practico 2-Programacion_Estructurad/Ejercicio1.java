import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int anio;

        System.out.println("Ingrese el año que desee verificar si es biciesto: ");
        anio= sc.nextInt();

        if ((anio%4==0 && anio%100!=0) || anio%400==0  ) {
            System.out.println("El año " + anio + " es bisiesto");

        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}

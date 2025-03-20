import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int edad;
        System.out.println("Ingrese su edad: ");
        edad= sc.nextInt();

        if (edad>0 && edad<12){
            System.out.println("Eres un Niño");
        } else if (edad>=12 && edad<=17) {
            System.out.println("Eres un Adolescente");
        } else if (edad>=18 && edad<=59) {
            System.out.println("Eres un Adulto");
        } else if (edad>=60) {
            System.out.println("Eres un Adulto Mayor");
        }else {
            System.out.println("Edad no valida");
        }
    }
}

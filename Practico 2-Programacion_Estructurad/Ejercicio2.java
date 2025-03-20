import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, mayor;
        System.out.println("Ingrese el primer número");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = sc.nextInt();

        System.out.println("Ingrese el tercer número");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 >num3){
            mayor=num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        }else {
            mayor=num3;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}

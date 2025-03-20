import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num, suma;
        suma=0;
        System.out.println("Ingresa un numero (0 para terminar): ");
        num = sc.nextInt();
        while (num != 0) {
            if (num % 2 == 0){
                suma= suma + num;

            }
            System.out.println("Ingresa un numero (0 para terminar): ");
            num = sc.nextInt();
        }

        System.out.println("La suma de los numeros pares es: "+suma);
    }
}

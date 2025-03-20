import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int nota;

        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota= sc.nextInt();
        }while (nota<0 || nota>10);

        System.out.println("Nota guardada correctamente");
    }
}

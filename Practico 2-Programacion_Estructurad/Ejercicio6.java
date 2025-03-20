import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num, pos, neg, ceros, cant;
        pos=0;
        neg=0;
        ceros=0;
        cant=10;
        for (int i = 0; i < cant ; i++) {
            System.out.println("Ingrese el numero "+(i+1) +": ");
            num= sc.nextInt();
            if (num > 0){
                pos+=1;
            } else if (num < 0) {
                neg+=1;
            }else{
                ceros+=1;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: "+pos);
        System.out.println("Negativos: "+neg);
        System.out.println("Ceros: "+ceros);
    }
}

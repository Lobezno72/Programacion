import java.util.Scanner;

public class ejercicio16 {
    static void main() {
        int num;
        int digito;
        int suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres sumar sus dígitos");
        num= sc.nextInt();
        do {
            digito = num%10;
            suma += digito;
            num /= 10;
        }while (num>0);
        System.out.println("La suma de los dígitos es: "+suma);
        sc.close();
    }
}

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int numero;
        int sumaDivisores=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número PERFECTO.");
        } else {
            System.out.println(numero + " NO es un número perfecto.");
        }
        sc.close();
    }
}

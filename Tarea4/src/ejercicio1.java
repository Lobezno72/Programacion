import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        String cadena;
        int contador=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }
        System.out.println("La cadena tiene " + contador + " caracteres.");

        scanner.close();
    }
}

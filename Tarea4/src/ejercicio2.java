import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        String cadena;
        char letra;
        int contador=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        cadena = scanner.nextLine();
        System.out.print("Introduce la letra que deseas buscar: ");
        letra = scanner.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra " + letra + " aparece " + contador + " veces en la cadena.");

        scanner.close();
    }
}

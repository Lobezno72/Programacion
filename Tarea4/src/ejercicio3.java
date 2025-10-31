import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        String cadena;
        String invertida="";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("La cadena invertida es: " + invertida);

        sc.close();
    }
}

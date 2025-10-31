import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        String cadena;
        String invertido = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena para saber si es palíndroma");
        cadena = sc.nextLine().toLowerCase();

        for (int i =cadena.length()-1; i>=0; i--){
            invertido += cadena.charAt(i);
        }
        if (cadena.equals(invertido)){
            System.out.println("La cadena es palíndroma");
        } else {
            System.out.println("La cadena NO es palíndroma");
        }
        sc.close();
    }
}


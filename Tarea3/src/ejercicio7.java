import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int jug1;
        int jug2;
        boolean ganaJug1 = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos al juego de Piedra, Papel, Tijera, Lagarto, Spock ");
        System.out.println("Opciones:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Lagarto");
        System.out.println("5. Spock");
        System.out.println("Jugador 1 por favor elija que desea sacar: ");
        jug1 = sc.nextInt();
        System.out.println("Jugador 2 por favor elija que desea sacar: ");
        jug2 = sc.nextInt();

        if (jug1 < 1 || jug1 > 5 || jug2 < 1 || jug2 > 5) {
            System.out.println("Opción inválida. Debe ser un número entre 1 y 5.");
            return;
        }

        if (jug1 == jug2) {
            System.out.println("Empate!");
        } else {

            switch (jug1) {
                case 1: // Piedra
                    ganaJug1 = (jug2 == 3 || jug2 == 4); // aplasta tijeras o lagarto
                    break;
                case 2: // Papel
                    ganaJug1 = (jug2 == 1 || jug2 == 5); // cubre piedra o desautoriza Spock
                    break;
                case 3: // Tijera
                    ganaJug1 = (jug2 == 2 || jug2 == 4); // corta papel o decapita lagarto
                    break;
                case 4: // Lagarto
                    ganaJug1 = (jug2 == 2 || jug2 == 5); // come papel o envenena Spock
                    break;
                case 5: // Spock
                    ganaJug1 = (jug2 == 1 || jug2 == 3); // vaporiza piedra o rompe tijeras
                    break;
            }

            if (ganaJug1) {
                System.out.println("¡Gana el Jugador 1!");
            } else {
                System.out.println("¡Gana el Jugador 2!");
            }
        }

        sc.close();
    }
}

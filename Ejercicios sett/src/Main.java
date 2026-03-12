import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--- MENU EJERCICIOS SET ---");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Ejercicio 15");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    EjerciciosSet.ejercicio1();
                    break;

                case 2:
                    EjerciciosSet.ejercicio2();
                    break;

                case 3:
                    EjerciciosSet.ejercicio3();
                    break;

                case 4:
                    EjerciciosSet.ejercicio4();
                    break;

                case 5:
                    EjerciciosSet.ejercicio5();
                    break;

                case 6:
                    EjerciciosSet.ejercicio6();
                    break;

                case 7:
                    EjerciciosSet.ejercicio7();
                    break;

                case 8:
                    EjerciciosSet.ejercicio8();
                    break;

                case 9:
                    EjerciciosSet.ejercicio9();
                    break;

                case 10:
                    EjerciciosSet.ejercicio10();
                    break;

                case 11:
                    EjerciciosSet.ejercicio11();
                    break;

                case 12:
                    EjerciciosSet.ejercicio12();
                    break;

                case 13:
                    EjerciciosSet.ejercicio13();
                    break;

                case 14:
                    EjerciciosSet.ejercicio14();
                    break;

                case 15:
                    EjerciciosSet.ejercicio15();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
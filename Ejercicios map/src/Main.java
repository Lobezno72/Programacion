import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--- MENU EJERCICIOS MAP ---");
            System.out.println("1. Paises y capitales");
            System.out.println("2. Frecuencia de palabras");
            System.out.println("3. Agenda telefonica");
            System.out.println("4. Lista a Map");
            System.out.println("5. Traductor");
            System.out.println("6. Notas estudiantes");
            System.out.println("7. Inventario");
            System.out.println("8. Contar caracteres");
            System.out.println("9. Empleados ordenados");
            System.out.println("10. Sistema de votacion");
            System.out.println("0. Salir");

            System.out.print("Elige opcion: ");
            opcion = sc.nextInt();

            switch(opcion){

                case 1: EjerciciosMap.ejercicio1(); break;
                case 2: EjerciciosMap.ejercicio2(); break;
                case 3: EjerciciosMap.ejercicio3(); break;
                case 4: EjerciciosMap.ejercicio4(); break;
                case 5: EjerciciosMap.ejercicio5(); break;
                case 6: EjerciciosMap.ejercicio6(); break;
                case 7: EjerciciosMap.ejercicio7(); break;
                case 8: EjerciciosMap.ejercicio8(); break;
                case 9: EjerciciosMap.ejercicio9(); break;
                case 10: EjerciciosMap.ejercicio10(); break;

                case 0: System.out.println("Saliendo..."); break;

                default: System.out.println("Opcion no valida");
            }

        } while(opcion != 0);

        sc.close();
    }
}
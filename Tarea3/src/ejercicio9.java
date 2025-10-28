import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        double num1=0, num2=0, resultado=0;
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=== Calculadora Avanzada ===");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Potencia (^)");
            System.out.println("6. Raíz cuadrada (√)");
            System.out.println("7. Factorial (!)");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 7){
                System.out.println("Ha seleccionado la opción numero " + opcion);
            }else {
                System.out.println("Opción invalida");
            }
        }while (opcion <= 0 || opcion >= 8);

        switch (opcion) {
            case 1: // Suma
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2: // Resta
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3: // Multiplicación
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4: // División
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5: // Potencia
                System.out.print("Ingrese un número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese a que potencia lo desea elevar número: ");
                num2 = sc.nextDouble();
                if (num2 < 0 && num1 == 0) {
                    System.out.println("Error: 0 elevado a un exponente negativo no está definido.");
                } else {
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 6: // Raíz cuadrada
                System.out.print("Ingrese el número del cual quiera la raiz cuadrada: ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                } else {
                    resultado = Math.sqrt(num1);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 7: // Factorial
                System.out.print("Ingrese el numero del cual desea el factorial: ");
                num1 = sc.nextDouble();
                if (num1 < 0 || num1 != (int) num1) {
                    System.out.println("Error: El factorial solo se calcula para enteros no negativos.");
                } else {
                    int n = (int) num1;
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("Resultado: " + factorial);
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme las medidas de los 3 lados del triangulo: ");
        System.out.println("Lado 1: ");
        lado1 = sc.nextDouble();
        System.out.println("Lado 2: ");
        lado2 = sc.nextDouble();
        System.out.println("Lado 3: ");
        lado3 = sc.nextDouble();
        if (lado1==lado2 && lado1==lado3){
            System.out.println("El triangulo es Equilátero.");
        }else if (lado1==lado2 || lado1==lado3 || lado2==lado3){
            System.out.println("El triangulo es Isóceles.");
        }else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
            System.out.println("El triangulo es Escaleno.");
        }else
            System.out.println("No forman un triangulo.");
    }
}

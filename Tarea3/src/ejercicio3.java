import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        int nota1,nota2,nota3,nota4,nota5;
        int promedio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las notas de las 5 materias: ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();
        nota5 = sc.nextInt();
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        if (promedio >=90 && promedio <=100){
            System.out.println("Tu nota media es: " + promedio + " por ende tienes un A");
        }else if (promedio >=80 && promedio <=89){
            System.out.println("Tu nota media es: " + promedio + " por ende tienes un B");
        }else if (promedio >=70 && promedio <=79){
            System.out.println("Tu nota media es: " + promedio + " por ende tienes un C");
        }else if (promedio >=60 && promedio <=69){
            System.out.println("Tu nota media es: " + promedio + " por ende tienes un D");
        }else if (promedio >60){
            System.out.println("Tu nota media es: " + promedio + " por ende tienes un F");
        }else
            System.out.println("ERROR");
    }
}

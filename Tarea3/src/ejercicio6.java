import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        double ingreso;
        int dependientes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de dependientes. ");
        dependientes = sc.nextInt();
        System.out.println("Introduzca cuantos ingresos tiene al año, ");
        ingreso = sc.nextDouble();
        if (dependientes<=3){
            if (ingreso<20000){
                System.out.println("Has de pagar " + ((ingreso/100)*5) + " en impuestos.");
            }else if (ingreso>=20000 && ingreso<40000){
                System.out.println("Has de pagar " + ((ingreso/100)*10) + " en impuestos.");
            }else if (ingreso>=40000 && ingreso<80000){
                System.out.println("Has de pagar " + ((ingreso/100)*20) + " en impuestos.");
            }else if (ingreso>80000){
                System.out.println("Has de pagar " + ((ingreso/100)*30) + " en impuestos.");
            }
        }else{
            if (ingreso<20000){
                System.out.println("No has de pagar impuestos.");
            }else if (ingreso>=20000 && ingreso<40000){
                System.out.println("Has de pagar " + ((ingreso/100)*5) + " en impuestos.");
            }else if (ingreso>=40000 && ingreso<80000){
                System.out.println("Has de pagar " + ((ingreso/100)*15) + " en impuestos.");
            }else if (ingreso>80000){
                System.out.println("Has de pagar " + ((ingreso/100)*25) + " en impuestos.");
            }
        }
    }
}

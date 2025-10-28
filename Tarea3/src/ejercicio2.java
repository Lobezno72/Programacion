import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        String tipocliente;
        int precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tipo de cliente es usted? ");
        System.out.println("Cliente VIP (20%)");
        System.out.println("Cliente Premium (10%)");
        System.out.println("Cliente Regular (5%)");
        tipocliente = sc.nextLine();
        System.out.println("Introduzca el precio del producto. ");
        precio = sc.nextInt();
        if (tipocliente.equals("VIP") && precio >=500){
            System.out.println("Por ser cliente VIP y el precio ser mayor a 500 te hacemos un descuento del 25%, su total es: " + (precio-(precio*0.25)));
        }else if (tipocliente.equals("Regular")){
            System.out.println("Por ser cliente regular te hacemos un 5% de descuento" + (precio-(precio*0.5)));
        }else if (tipocliente.equals("Premium")){
            System.out.println("Por ser cliente premium te hacemos un 10% de descuento" + (precio-(precio*0.10)));
        }else if (tipocliente.equals("VIP")){
            System.out.println("Por ser cliente VIP te hacemos un 20% de descuento" + (precio-(precio*0.20)));
        }else
            System.out.println("No tienes ningun tipo de descuento por lo que tiene que pagar: " + precio);
    }
}

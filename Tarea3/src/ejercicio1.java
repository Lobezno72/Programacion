import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        String usuario;
        String contrasena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su Usuario: ");
        usuario = sc.nextLine();
        System.out.println("Introduzca su Contraseña: ");
        contrasena = sc.nextLine();
        if (usuario.equals("admin") && contrasena.equals("1234")){
            System.out.println("Bienvenido administrador.");
        }else if(usuario.equals("user") && contrasena.equals("abcd")){
            System.out.println("Bienvenido usuario normal.");
        }else if(usuario.equals("guest") && contrasena.equals("xyz")){
            System.out.println("Bienvenido invitado.");
        }else
            System.out.println("Acceso denegado.");
    }
}

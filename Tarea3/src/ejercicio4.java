import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una fecha dia/mes/año RESPECTIVAMENTE. ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        if ((ano%4==0) && (ano%100==0) && (ano%400==0)){
            switch (mes){
                case  1,3,5,7,8,10,12:
                    if (dia >=1 && dia<=31){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                case 4,6,9,11:
                    if (dia >=1 && dia<=30){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                case 2:
                    if (dia >=1 && dia<=29){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                default:
                    System.out.println("La fecha no es correcta.");
            }
        }else
            switch (mes){
                case  1,3,5,7,8,10,12:
                    if (dia >=1 && dia<=31){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                case 4,6,9,11:
                    if (dia >=1 && dia<=30){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                case 2:
                    if (dia >=1 && dia<=28){
                        System.out.println("La fecha es correcta.");
                    }else {
                        System.out.println("La fecha no es correcta.");
                    }
                    break;
                default:
                    System.out.println("La fecha no es correcta.");
        }
    }
}
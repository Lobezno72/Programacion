//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int eleccion;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a mi Gimnasio, ¿en que le podemos ayudar hoy? ");
        System.out.println("1. Alta de socio");
        System.out.println("2. Baja de socio");
        System.out.println("3. Listado de socios activos");
        System.out.println("4. Listado de socios inactivos");
        System.out.println("5. Borrar socio");
        System.out.println("6. Salir");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Introduce el nombre del nuevo socio: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Introduceme ahora el dni: ");
                String dni = sc.nextLine();
                System.out.println("Introduceme la edad: ");
                int edad = sc.nextInt();
                System.out.println("Introduceme la fecha de la inscripcion: ");
                sc.nextLine();
                String fechaInscripcion = sc.nextLine();
                ConfiguracionSocio.altaSocio(nombre, dni, edad, fechaInscripcion);
                break;
            case 2:
                System.out.println("Introduceme el dni del socio que deseas dar de baja: ");
                sc.nextLine();
                String dniBaja = sc.nextLine();
                ConfiguracionSocio.bajaSocio(dniBaja);
                break;
            case 3:
                ConfiguracionSocio.listadoSociosActivos();
                break;
            case 4:
                ConfiguracionSocio.listadoSociosInactivos();
                break;
            case 5:
                System.out.println("Introduceme el dni del socio que deseas eliminar: ");
                sc.nextLine();
                String dniEliminado = sc.nextLine();
                ConfiguracionSocio.borrarSocio(dniEliminado);
                break;
            case 6:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    } while (eleccion!=6);
    System.out.println("Hasta la proxima.");
}
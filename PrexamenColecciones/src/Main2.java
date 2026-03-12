void main() {
    int eleccion;
    String codigo;
    String nombre;
    double precio;
    int stock;
    String respuesta;
    boolean disponible;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a mi tienda online, ¿en que le podemos ayudar hoy? ");
        System.out.println("1. Alta de producto");
        System.out.println("2. Modificar stock");
        System.out.println("3. Listado de productos disponibles");
        System.out.println("4. Listado de productos sin stock");
        System.out.println("5. Borrar producto");
        System.out.println("6. Salir");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Introduce el codigo del producto: ");
                sc.nextLine();
                codigo = sc.nextLine();
                System.out.println("Introduceme nombre del producto: ");
                nombre = sc.nextLine();
                System.out.println("Introduceme su precio: ");
                precio = sc.nextDouble();
                System.out.println("Introduceme su stock: ");
                sc.nextLine();
                stock = sc.nextInt();
                ConfiguracionProducto.altaProducto(codigo,nombre,precio,stock);
                break;
            case 2:
                System.out.println("Introduceme el codigo del producto que deseas actualizar el stock: ");
                sc.nextLine();
                codigo = sc.nextLine();
                System.out.println("Introduceme el nuevo stock: ");
                sc.nextLine();
                stock = sc.nextInt();
                sc.nextLine();
                ConfiguracionProducto.modificarStock(codigo, stock);
                break;
            case 3:
                ConfiguracionProducto.productosDisponibles();
                break;
            case 4:
                ConfiguracionProducto.productosSinStock();
                break;
            case 5:
                System.out.println("Introduceme el codigo del producto que deseas eliminar: ");
                sc.nextLine();
                String productoEliminado = sc.nextLine();
                ConfiguracionProducto.borrarProducto(productoEliminado);
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
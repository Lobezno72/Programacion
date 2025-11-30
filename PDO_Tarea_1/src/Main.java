//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Tienda impresoraHP = new Tienda("Impresora HP",100,21,5);
    Tienda ratonLogitech = new Tienda("Raton Logitech");
    Tienda libroJava = new Tienda("Libro Java",20,4,15);
    impresoraHP.toString();
    ratonLogitech.toString();
    libroJava.toString();
    System.out.println("La cantidad de productos es de " + Tienda.getCantidad());
    //Black Friday
    System.out.println("Hay un 10% de descuento debido al Black Friday");
    Tienda.setDescuentoGlobal(10);
    ratonLogitech.setPrecio(12);
    impresoraHP.toString();
    ratonLogitech.toString();
    libroJava.toString();
    System.out.println("La cantidad de productos es de " + Tienda.getCantidad());
}

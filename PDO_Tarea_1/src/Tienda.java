public class Tienda {
    private String nombre;
    private double precio;
    private int iva;
    private int descuento;
    private static int cantidad=0;
    private static int descuentoGlobal=0;

    public Tienda(String nombre, double precio, int iva, int descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        cantidad++;
    }
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.precio = 10;
        this.iva = 21;
        this.descuento = 0;
        cantidad++;
    }
    public double calculaPrecio() {
        int descuentoAplicado;
        if (this.descuento<descuentoGlobal) {
            descuentoAplicado = descuentoGlobal;
        }else{
            descuentoAplicado = descuento;
        }
        double precioDescuento = this.precio-this.precio*descuentoAplicado/100;
        double precioFinal = precioDescuento+precioDescuento*this.iva/100;
        return precioFinal;
    }
    @Override
    public String toString(){
        String respuesta = "El precio final de " + this.nombre + " es de " + this.calculaPrecio();
        System.out.println(respuesta);
        return respuesta;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public static int getCantidad() {
        return cantidad;
    }
    public static int getDescuentoGlobal() {
        return descuentoGlobal;
    }
    public static void setDescuentoGlobal(int descuentoGlobal) {
        Tienda.descuentoGlobal = descuentoGlobal;
    }
}

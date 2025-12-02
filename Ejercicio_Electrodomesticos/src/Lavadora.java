public class Lavadora extends Electrodomestico{
    private int carga = 5;

    public Lavadora(int precioBase,  Colores color, String consumoEnergico, int peso, int carga) {
        super(precioBase, color.name(), consumoEnergico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    @Override
    public String toString(){
        String respuesta = "El precio base es de " + this.precioBase + ", el consumo energético es de " + this.consumoEnergico + ", el peso es de " + this.peso + " y la carga es de " + carga;
        System.out.println(respuesta);
        return respuesta;
    }
    @Override
    public double precioFinal(){
        double precioConCarga = super.precioFinal();
        if (carga>6){
            precioConCarga = precioConCarga + 50;
        }
        return precioConCarga;
    }
}

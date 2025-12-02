public class Electrodomestico {
    protected int precioBase;
    protected Colores color;
    protected String consumoEnergico;
    protected int peso;
    private int consumoFinal;
    private int pesoFinal;


    public Electrodomestico(int precioBase, String Colores, String consumoEnergico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergico = consumoEnergico;
        this.peso = peso;
    }
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = Colores.blanco;
        this.consumoEnergico = "A";
        this.peso = 10;
    }
    private int comprobarConsumoEnergtico(){
        if (consumoEnergico.equals("A+") || consumoEnergico.equals("a+")) {
            consumoFinal = 120;
        } else if (consumoEnergico.equals("A") || consumoEnergico.equals("a")) {
            consumoFinal = 100;
        } else if (consumoEnergico.equals("B") || consumoEnergico.equals("b")) {
            consumoFinal = 80;
        } else if (consumoEnergico.equals("C") || consumoEnergico.equals("c")) {
            consumoFinal = 60;
        } else if (consumoEnergico.equals("D") || consumoEnergico.equals("d")) {
            consumoFinal = 50;
        } else if (consumoEnergico.equals("E") || consumoEnergico.equals("e")) {
            consumoFinal = 30;
        } else if (consumoEnergico.equals("F") || consumoEnergico.equals("f")) {
            consumoFinal = 10;
        } else {
            consumoFinal = 100;
        }
        return consumoFinal;
    }
    private int comprobarPeso(){
        if (peso>=0 && peso<=19) {
            pesoFinal = 10;
        } else if (peso>=20 && peso<=49) {
            pesoFinal = 30;
        } else if (peso>=50 && peso<=79) {
            pesoFinal = 50;
        } else if (peso>=80) {
            pesoFinal = 100;
        } else {
            System.out.println("El peso no puede ser negativo");;
        }
        return pesoFinal;
    }

    @Override
    public String toString(){
        String respuesta = "El precio base es de " + this.precioBase + ", el consumo energético es de " + this.consumoEnergico + " y el peso es de " + this.peso;
        System.out.println(respuesta);
        return respuesta;
    }

    public double precioFinal(){
        return precioBase + comprobarConsumoEnergtico() + comprobarPeso();

    }
    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getConsumoEnergico() {
        return consumoEnergico;
    }

    public void setConsumoEnergico(String consumoEnergico) {
        this.consumoEnergico = consumoEnergico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

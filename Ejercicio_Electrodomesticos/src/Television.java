public class Television extends Electrodomestico{
    private int resolucion = 20;
    private Boolean netflix = false;

    public Television(int precioBase, Colores color, String consumoEnergico, int peso, int resolucion, Boolean netflix) {
        super(precioBase, color.name(), consumoEnergico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }
    public int getResolucion() {
        return resolucion;
    }
    public Boolean getNetflix() {
        return netflix;
    }
    @Override
    public String toString(){
        String respuesta = "El precio base es de " + this.precioBase + ", el consumo energético es de " + this.consumoEnergico + ", el peso es de " + this.peso + ", tiene " + resolucion + " pulgadas y " + netflix + " tiene netflix.";
        System.out.println(respuesta);
        return respuesta;
    }
    @Override
    public double precioFinal(){
        double precioConTodo = super.precioBase;
        if (resolucion>20){
            precioConTodo = precioConTodo * 1.3;
        }
        if (consumoEnergico.equals("A+") || consumoEnergico.equals("a+")) {
            precioConTodo =  precioConTodo + 120;
        } else if (consumoEnergico.equals("A") || consumoEnergico.equals("a")) {
            precioConTodo =  precioConTodo + 100;
        } else if (consumoEnergico.equals("B") || consumoEnergico.equals("b")) {
            precioConTodo =  precioConTodo + 80;
        } else if (consumoEnergico.equals("C") || consumoEnergico.equals("c")) {
            precioConTodo =  precioConTodo + 60;
        } else if (consumoEnergico.equals("D") || consumoEnergico.equals("d")) {
            precioConTodo =  precioConTodo + 50;
        } else if (consumoEnergico.equals("E") || consumoEnergico.equals("e")) {
            precioConTodo =  precioConTodo + 30;
        } else if (consumoEnergico.equals("F") || consumoEnergico.equals("f")) {
            precioConTodo =  precioConTodo + 10;
        } else {
            precioConTodo =  precioConTodo + 100;
        }
        if (peso>=0 && peso<=19) {
            precioConTodo =  precioConTodo + 10;
        } else if (peso>=20 && peso<=49) {
            precioConTodo =  precioConTodo + 30;
        } else if (peso>=50 && peso<=79) {
            precioConTodo =  precioConTodo + 50;
        } else if (peso>=80) {
            precioConTodo =  precioConTodo + 100;
        } else {
            System.out.println("El peso no puede ser negativo");;
        }
        if(netflix != false){
            precioConTodo = precioConTodo + 60;
        }
        return precioConTodo;
    }
}

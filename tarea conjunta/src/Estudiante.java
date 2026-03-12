public class Estudiante {
    private String nombre;
    private int edad;
    private String ciudad;
    private double calificacion;

    public Estudiante(String nombre, int edad, String ciudad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.calificacion = calificacion;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCiudad() { return ciudad; }
    public double getCalificacion() { return calificacion; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}

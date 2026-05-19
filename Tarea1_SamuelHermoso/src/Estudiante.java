public class Estudiante {

    private String nombre;
    private String edad;
    private String curso;

    public Estudiante(String nombre, String edad, String curso) {

        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public String obtenerInformacion() {

        return "===== ESTUDIANTE REGISTRADO =====\n\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Curso: " + curso;
    }
}
import java.util.ArrayList;
import java.util.HashSet;

public class ConfiguracionSocio {
    public static ArrayList<Socio> socitos = new ArrayList<>();
    public static void altaSocio(String nombre, String dni, int edad, String fechaInscripcion){
        for (Socio s : socitos){
            if(s.dni.equals(dni)){
                System.out.println("El dni está duplicado. ");
                return;
            }
        }
        Socio socio = new Socio(nombre, dni, edad, fechaInscripcion, true);
        socitos.add(socio);
    }
    public static void bajaSocio(String dniBaja){
        for (Socio n : socitos){
            if (n.dni.equals(dniBaja)){
                n.activo = false;
                return;
            }
        }
    }
    public static void listadoSociosActivos(){
        ArrayList<Socio> ordenNombre = ConfiguracionSocio.socitos;
        //Funcion lambda
        ordenNombre.sort((socio1,socio2)->socio1.nombre.compareTo(socio2.nombre));
        for (Socio s : ordenNombre){
            if (s.activo){
                System.out.println(s);
            }
        }
    }
    public static void listadoSociosInactivos(){
        ArrayList<Socio> ordenDni = ConfiguracionSocio.socitos;
        //Funcion lambda
        ordenDni.sort((socio1,socio2)->socio1.dni.compareTo(socio2.dni));
        for (Socio s : ordenDni){
            if (!s.activo){
                System.out.println(s);
            }
        }
    }
    public static void borrarSocio(String dniEliminado){
        for (Socio n : socitos){
            if (n.dni.equals(dniEliminado)){
                socitos.remove(n);
                System.out.println("Socio eliminado correctamente.");
                return;
            }
        }
    }
}

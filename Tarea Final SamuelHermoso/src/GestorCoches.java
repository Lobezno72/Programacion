import java.util.ArrayList;

public class GestorCoches {

    private static ArrayList<Coche> lista = new ArrayList<>();

    public static void agregar(Coche coche) {
        lista.add(coche);
    }

    public static ArrayList<Coche> obtenerLista() {
        return lista;
    }
}
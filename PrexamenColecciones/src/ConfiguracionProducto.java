import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class ConfiguracionProducto {
    public static HashMap<String,Producto> productito = new HashMap<>();
    public static void productosTiempoDiseno(){
        productito.put("11111", new Producto("11111", "Jose", 2.5,2,true));
        productito.put("22222", new Producto("22222", "piña", 2.5,2,true));
        productito.put("33333", new Producto("33333", "chocolate", 2.5,2,true));
        productito.put("44444", new Producto("44444", "manzana", 2.5,2,true));
        productito.put("55555", new Producto("55555", "peras", 2.5,2,true));
    }
    public static void altaProducto(String codigo, String nombre, double precio, int stock){
        for (String c : productito.keySet()){
            if(c.equals(codigo)){
                System.out.println("No se admiten codigos duplicados.");
                return;
            }
        }
        Producto producto = new Producto(codigo,nombre,precio,stock,true);
        productito.put(codigo,producto);
    }
    public static void modificarStock(String codigo, int stock){
        if (!productito.containsKey(codigo)){
            System.out.println("No hay ningun producto con ese codigo.");
            return;
        }
        Producto producto = productito.get(codigo);
        producto.setStock(stock);

    }
    public static void productosDisponibles(){
        ArrayList<Producto> productDispo = new ArrayList<>();
        for(Producto p : productito.values()){
            if (p.isDisponible()){
                productDispo.add(p);
            }
        }
        Collections.sort(productDispo, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });
        for (Producto f : productDispo){
            System.out.println(f);
        }
    }
    public static void productosSinStock(){
        for(Producto p : productito.values()){
            if (p.getStock()==0){
                System.out.println(p);
            }
        }
    }
    public static void borrarProducto(String productoEliminado){
        for (String c : productito.keySet()){
            if(c.equals(productoEliminado)){
                productito.remove(c);
                return;
            }
        }
    }
}

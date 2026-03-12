import java.util.*;

public class EjerciciosMap {

    // 1
    public static void ejercicio1() {
        HashMap<String, String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "Paris");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlin");
        paises.put("Portugal", "Lisboa");

        System.out.println(paises);
    }

    // 2
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> frecuencia = new HashMap<>();

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (String p : palabras) {
            frecuencia.put(p, frecuencia.getOrDefault(p, 0) + 1);
        }

        System.out.println(frecuencia);
    }

    // 3
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Ana", "1234");
        agenda.put("Luis", "5678");

        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();

        if (agenda.containsKey(nombre))
            System.out.println("Telefono: " + agenda.get(nombre));
        else
            System.out.println("Contacto no encontrado");

        System.out.println("Agenda: " + agenda);
    }

    // 4
    public static void ejercicio4() {
        List<String> nombres = Arrays.asList("Ana","Luis","Ana","Pedro","Luis");

        HashMap<String,Integer> mapa = new HashMap<>();

        for(String n : nombres){
            mapa.put(n, mapa.getOrDefault(n,0)+1);
        }

        System.out.println(mapa);
    }

    // 5
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> diccionario = new HashMap<>();
        diccionario.put("hola","hello");
        diccionario.put("perro","dog");
        diccionario.put("gato","cat");

        System.out.print("Palabra en español: ");
        String palabra = sc.nextLine();

        if(diccionario.containsKey(palabra))
            System.out.println(diccionario.get(palabra));
        else
            System.out.println("No está en el diccionario");
    }

    // 6
    public static void ejercicio6() {

        HashMap<String, ArrayList<Integer>> notas = new HashMap<>();

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(8);
        lista.add(6);

        notas.put("Juan", lista);

        for(String alumno : notas.keySet()){
            ArrayList<Integer> n = notas.get(alumno);

            int suma = 0;
            for(int nota : n)
                suma += nota;

            double promedio = (double)suma / n.size();
            System.out.println(alumno + " promedio: " + promedio);
        }
    }

    // 7
    public static void ejercicio7() {

        HashMap<String,Integer> inventario = new HashMap<>();

        inventario.put("Teclado",10);
        inventario.put("Ratón",5);

        inventario.put("Ratón",8); // actualizar
        inventario.remove("Teclado"); // eliminar

        System.out.println(inventario);
    }

    // 8
    public static void ejercicio8() {

        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> mapa = new HashMap<>();

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        for(char c : palabra.toCharArray()){
            mapa.put(c, mapa.getOrDefault(c,0)+1);
        }

        System.out.println(mapa);
    }

    // 9
    public static void ejercicio9() {

        TreeMap<Integer,String> empleados = new TreeMap<>();

        empleados.put(3,"Ana - 1500");
        empleados.put(1,"Luis - 1800");
        empleados.put(2,"Pedro - 1600");

        System.out.println(empleados);
    }

    // 10
    public static void ejercicio10() {

        HashMap<String,Integer> votos = new HashMap<>();

        votos.put("Ana",3);
        votos.put("Luis",5);
        votos.put("Pedro",2);

        String ganador = "";
        int max = 0;

        for(String candidato : votos.keySet()){
            if(votos.get(candidato) > max){
                max = votos.get(candidato);
                ganador = candidato;
            }
        }

        System.out.println("Votos: " + votos);
        System.out.println("Ganador: " + ganador);
    }

}
import java.util.*;

public class EjerciciosSet {

    // 1
    public static void ejercicio1() {
        Set<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        for (String n : nombres) {
            System.out.println(n);
        }
    }

    // 2
    public static void ejercicio2() {
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);
    }

    // 3
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> palabras = new LinkedHashSet<>();

        System.out.println("Introduce 3 palabras:");
        for (int i = 0; i < 3; i++) {
            palabras.add(sc.nextLine());
        }

        System.out.println(palabras);
    }

    // 4
    public static void ejercicio4() {
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");

        System.out.println(frutas.contains("Manzana"));
    }

    // 5
    public static void ejercicio5() {
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.remove("Pera");

        System.out.println(frutas);
    }

    // 6
    public static void ejercicio6() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        set1.addAll(set2);
        System.out.println(set1);
    }

    // 7
    public static void ejercicio7() {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(2,3,4));

        a.retainAll(b);
        System.out.println(a);
    }

    // 8
    public static void ejercicio8() {
        TreeSet<Integer> numeros = new TreeSet<>(Arrays.asList(1,2,3));
        numeros.clear();

        System.out.println(numeros.isEmpty());
    }

    // 9
    public static void ejercicio9() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luis");

        List<String> lista = new ArrayList<>(nombres);
        Collections.sort(lista);

        System.out.println(lista);
    }

    // 10
    public static void ejercicio10() {
        List<Integer> lista = Arrays.asList(1,2,2,3,3,4);
        HashSet<Integer> set = new HashSet<>(lista);

        System.out.println(set.size());
    }

    // 11
    public static void ejercicio11() {
        TreeSet<Integer> a = new TreeSet<>(Arrays.asList(1,2));
        TreeSet<Integer> b = new TreeSet<>(Arrays.asList(1,2,3));

        System.out.println(b.containsAll(a));
    }

    // 12
    public static void ejercicio12() {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Random r = new Random();

        while (numeros.size() < 5) {
            numeros.add(r.nextInt(10));
        }

        System.out.println(numeros);
    }

    // 13
    public static void ejercicio13() {
        String a = "roma";
        String b = "amor";

        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        for(char c : a.toCharArray()) s1.add(c);
        for(char c : b.toCharArray()) s2.add(c);

        System.out.println(s1.equals(s2));
    }

    // 14
    public static void ejercicio14() {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(a);

        System.out.println(b);
    }

    // 15
    public static void ejercicio15() {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> soloA = new HashSet<>(a);
        soloA.removeAll(b);

        HashSet<Integer> soloB = new HashSet<>(b);
        soloB.removeAll(a);

        System.out.println("Solo en A: " + soloA);
        System.out.println("Solo en B: " + soloB);
    }
}
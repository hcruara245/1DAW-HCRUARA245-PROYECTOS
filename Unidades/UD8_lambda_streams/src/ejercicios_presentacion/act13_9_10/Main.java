package ejercicios_presentacion.act13_9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            lista.add((int) (Math.random()*1000));
        }

        System.out.println("PRUEBA 1:");
        lista.stream()
                .filter(Main::esPrimo)
                .sorted()
                .forEach(System.out::println);
        System.out.println("PRUEBA 2:");
        lista.stream()
                .filter(Main::esPrimo)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("PRUEBA 3:");
        lista.stream()
                .filter(Main::esPrimo)
                .filter(integer -> integer >= 200 &&  integer <= 800)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("ACT 10:");
        List nuevaList = lista.stream()
                            .filter(Main::esPrimo)
                            .sorted()
                            .toList();
        System.out.println("CON LISTA");
        System.out.println(nuevaList);
        Integer[] arraynuevo = lista.stream()
                                .filter(Main::esPrimo)
                                .sorted()
                                .toArray(Integer[]::new);
        System.out.println("CON ARRAY");
        System.out.println(Arrays.toString(arraynuevo));
    }

    static boolean esPrimo(Integer n) {
        boolean prime = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

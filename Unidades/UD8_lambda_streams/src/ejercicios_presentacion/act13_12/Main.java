package ejercicios_presentacion.act13_12;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            // SIRVE PARA COGER NUMEROS ALEATORIOS ENTRE UN RANGO, DESDE JAVA 7, ES MÁS OPTIMO QUE MATH.RANDOM
            lista.add(ThreadLocalRandom.current().nextInt(-20, 20 + 1));
        }

        System.out.println("LISTA ORIGINAL");
        System.out.println(lista);

        Set<Integer> set = lista.stream()
                .filter(integer -> integer >= 0)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("SET POSITIVOS");
        System.out.println(set);
        Set<Integer> setnegativos = lista.stream()
                .filter(integer -> integer < 0)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("SET NEGATIVOS");
        System.out.println(setnegativos);
        Set<Integer> setcomprendidos = lista.stream()
                .filter(integer -> integer >= -10 && integer <= 10)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("SET ENTRE -10 Y 10");
        System.out.println(setcomprendidos);
    }
}

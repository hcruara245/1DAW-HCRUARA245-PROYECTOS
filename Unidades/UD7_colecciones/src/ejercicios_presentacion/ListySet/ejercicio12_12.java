package ejercicios_presentacion.ListySet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ejercicio12_12 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(100);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(1);
        Set<Integer> unionised = union(set1, set2);
        System.out.println(unionised);
        Set<Integer> interseccioned = interseccion(set1, set2);
        System.out.println(interseccioned);
    }

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new LinkedHashSet<>();
        union.addAll(conjunto1);
        union.addAll(conjunto2);
        return union;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> copyconjunto1_resultado = conjunto1;
        Set<E> copyconjunto2 = conjunto2;
        copyconjunto1_resultado.retainAll(copyconjunto2);
        return copyconjunto1_resultado;
    }
}
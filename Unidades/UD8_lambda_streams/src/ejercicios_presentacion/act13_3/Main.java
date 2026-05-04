package ejercicios_presentacion.act13_3;

import ejercicios_presentacion.act13_1.Cliente;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Ana", 25, "9999"),
                new Cliente("Pedro", 42, "9999"),
                new Cliente("Lucía", 31, "9999"),
                new Cliente("Zacarías", 19, "9999")
        };

        Cliente masAnciano = buscarMaximoStream(clientes, (c1, c2) -> c1.getEdad() - c2.getEdad());

        System.out.println("--- RESULTADOS ---");
        System.out.println("El cliente de más edad es: " + masAnciano);


        Cliente ultimoAlfabeticamente = buscarMaximoStream(clientes, (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));

        System.out.println("El último cliente por nombre es: " + ultimoAlfabeticamente);

        Cliente[] tablaVacia = {};
        Cliente resultadoVacio = buscarMaximoStream(tablaVacia, (c1, c2) -> 0);
        System.out.println("Resultado con tabla vacía: " + resultadoVacio);
    }

    public static <T> T buscarMaximoStream(T[] tabla, Comparator<T> comparador) {
        return Arrays.stream(tabla)
                .max(comparador)
                .orElse(null);
    }
}

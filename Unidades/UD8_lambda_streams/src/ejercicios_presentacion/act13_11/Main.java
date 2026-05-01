package ejercicios_presentacion.act13_11;

import ejercicios_presentacion.act13_1.Cliente;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente[] tClie = {
                new Cliente("Ana", 25, "9999"),
                new Cliente("Maria", 25, "9999"),
                new Cliente("Bezzecci", 25, "9999"),
                new Cliente("Carlos", 25, "9999"),
                new Cliente("Juan", 25, "9999"),
                new Cliente("Iniesta", 25, "9999"),
                new Cliente("Pedro", 42, "9999"),
                new Cliente("Lucía", 31, "9999"),
                new Cliente("Zacarías", 19, "9999")
        };

        List<Cliente> clientes = Arrays.asList(tClie);

        clientes.stream()
                .sorted((c,c2) -> c.getNombre().compareTo(c2.getNombre()))
                .forEach(System.out::println);
    }
}

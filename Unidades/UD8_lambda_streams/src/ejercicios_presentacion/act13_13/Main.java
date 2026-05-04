package ejercicios_presentacion.act13_13;

import ejercicios_presentacion.act13_1.Cliente;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente[] tClie = {
                new Cliente("Ana", 25, "9999"),
                new Cliente("Maria", 25, "1111"),
                new Cliente("Bezzecci", 25, "2222"),
                new Cliente("Carlos", 25, "3333"),
                new Cliente("Juan", 25, "4444"),
                new Cliente("Iniesta", 25, "5555"),
                new Cliente("Pedro", 42, "6666"),
                new Cliente("Lucía", 31, "99777799"),
                new Cliente("Zacarías", 19, "94499965")
        };

        // Opcional pero ordenarlos
        Map<String,DatosCliente> claves = Arrays.stream(tClie)
                .sorted(Comparator.comparing(Cliente::getNombre))
                .collect(Collectors.toMap(
                        Cliente::getDni,
                        DatosCliente::new,
                        ((datosCliente, datosCliente2) -> datosCliente),
                        LinkedHashMap::new
                )
        );

        claves.entrySet().forEach(System.out::println);
    }
}

package ejercicios_presentacion.act13_2;

import ejercicios_presentacion.act13_1.Cliente;
import ejercicios_presentacion.act13_1.Saludador;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente[] tablaClientes = {
                new Cliente("Juan",11, "9999"),
                new Cliente("Elena",12, "9999"),
                new Cliente("Pedro",14, "9999")
        };

        Saludador<Cliente> saludoFormato = c -> "Hola " + c.getNombre() + ", bienvenido al sistema.";

        List<String> resultados = procesarSaludosStream(tablaClientes, saludoFormato);

        System.out.println("--- Saludos Generados ---");

        for (String saludo : resultados) {
            System.out.println(saludo);
        }
    }

    public static <T> List<String> procesarSaludosStream(T[] grupo, Saludador<T> s) {
        return Arrays.stream(grupo)
                .map(s::saludar)
                .collect(Collectors.toList());
    }
}
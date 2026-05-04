package ejercicios_presentacion.act13_6;

import ejercicios_presentacion.act13_1.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // CON VECTOR NORMAL Y CORRIENTE
        System.out.println("\nCon array normal\n");
        Cliente[] clientes = {
                new Cliente("Ana", 25, "9999"),
                new Cliente("Pedro", 42, "9999"),
                new Cliente("Lucía", 31, "9999"),
                new Cliente("Zacarías", 19, "9999")
        };
        paraCada(clientes, System.out::println);

        // CON ARRAYLIST
        System.out.println("\nCon arraylist\n");
        List<Cliente> clienteslista = new ArrayList<>();
        clienteslista.add(clientes[0]);
        clienteslista.add(clientes[1]);
        clienteslista.add(clientes[2]);
        clienteslista.add(clientes[3]);

        clienteslista.stream()
                .forEach(System.out::println);

        // ARRAY LIST CON OBJETOS DE CUALQUIER OTRO TIPO
        System.out.println("\nobjetos de cualquier otro tipo\n");
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        lista.stream()
                .forEach(System.out::println);
    }

    static <T> void paraCada(T[] tabla, Consumer<T> c){
        for (int i = 0; i < tabla.length; i++) {
            c.accept(tabla[i]);
        }
    }
}

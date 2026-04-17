package ejercicios_presentacion.CollectionsYMap.ej12_14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static List<Registro> registros = new ArrayList<>();

    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        while (seguir) {
            mostrarmenu();
            System.out.println("DIME LA OPCION: 1-4");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    nuevoRegistro();
                }
            }
        }
    }

    public static void mostrarmenu(){
        System.out.println("OPCIONES:");
        System.out.println("1.NUEVO REGISTRO:");
        System.out.println("2.LISTAR REGISTROS:");
        System.out.println("3.MOSTRAR ESTADISTICAS:");
        System.out.println("4.SALIR:");
    }

    public static void nuevoRegistro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIME LA TEMPERATURA:");
        try {
            Double temp = sc.nextDouble();
            Registro reg = new Registro(temp, LocalDateTime.now());
            registros.add(reg);
            System.out.println("Registro añadido correctamente.");
        } catch (Exception e) {
            System.out.println("Error: Introduce un número válido (usa coma para decimales según tu región).");
        }
    }
}

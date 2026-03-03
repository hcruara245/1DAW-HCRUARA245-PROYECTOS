package UD5_Practica2_Electrodomesticos;

import java.util.Arrays;

public class MainElectro{
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Television(100, Color.blanco, ConsumoEnergetico.C, 20,30,true);
        electrodomesticos[1] = new Television(300, Color.gris, ConsumoEnergetico.A, 40,30,true);
        electrodomesticos[2] = new Lavadora(50, Color.negro, ConsumoEnergetico.E, 10,20);

        electrodomesticos[3] = new Lavadora(150, Color.blanco, ConsumoEnergetico.A, 50, 7);
        electrodomesticos[4] = new Lavadora(200, Color.azul, ConsumoEnergetico.B, 60, 9);
        electrodomesticos[5] = new Lavadora(400, Color.gris, ConsumoEnergetico.A, 70, 10);

        electrodomesticos[6] = new Television(250, Color.negro, ConsumoEnergetico.C, 15, 40, true);
        electrodomesticos[7] = new Television(500, Color.negro, ConsumoEnergetico.A, 20, 55, true);
        electrodomesticos[8] = new Television(100, Color.blanco, ConsumoEnergetico.F, 10, 24, false);

        electrodomesticos[9] = new Television(80, Color.rojo, ConsumoEnergetico.B, 15,30,true);

        System.out.println("--- LISTADO DE ELECTRODOMÉSTICOS Y PRECIOS FINALES ---");
        double sumaTotal = 0;

        for (Electrodomestico e : electrodomesticos) {
            if (e != null) {
                double precioFinal = e.getPrecioFinal();
                sumaTotal += precioFinal;

                System.out.println(e.getClass().getSimpleName() + " -> " +
                        "Precio Base: " + e.getPrecio_base() + " | " +
                        "Precio Final: " + precioFinal);
            }
        }
        System.out.println("Suma total de todos los electrodomésticos: " + sumaTotal);

        System.out.println("\n--- ORDENACIÓN DE LAVADORAS ---");

        Lavadora[] listaLavadoras = new Lavadora[3];
        listaLavadoras[0] = new Lavadora(300, Color.blanco, ConsumoEnergetico.C, 40, 8);
        listaLavadoras[1] = new Lavadora(150, Color.azul, ConsumoEnergetico.F, 30, 5);
        listaLavadoras[2] = new Lavadora(500, Color.gris, ConsumoEnergetico.A, 50, 10);

        Arrays.sort(listaLavadoras);

        for (Lavadora lav : listaLavadoras) {
            System.out.println("Lavadora - Precio: " + lav.getPrecio_base() + " - Carga: " + lav.getCarga());
        }
        Lavadora lavadoras[] = new Lavadora[5];
        lavadoras[0] = new Lavadora(300, Color.blanco, ConsumoEnergetico.C, 40, 8);
        lavadoras[1] = new Lavadora(150, Color.azul, ConsumoEnergetico.F, 30, 5);
        lavadoras[2] = new Lavadora(250, Color.gris, ConsumoEnergetico.A, 50, 20);
        lavadoras[3] = new Lavadora(150, Color.azul, ConsumoEnergetico.F, 300, 5);
        lavadoras[4] = new Lavadora(400, Color.gris, ConsumoEnergetico.A, 12, 15);

        Arrays.sort(lavadoras);
        System.out.println(Arrays.toString(lavadoras));

        ComparaPrecioFinal comp = new ComparaPrecioFinal();
        Arrays.sort(lavadoras,comp);
        System.out.println(Arrays.toString(lavadoras));
    }
}
package UD5_PracticaComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Mercedes","AMG C63S");
        Coche coche3 = new Coche("Ferrari","296 GTB","4134 JGE");
        Coche coche4 = new Coche("Volkswagen","Golf GTI","2984 PLZ");
        Coche coche5 = new Coche("BMW","M3 E46","9921 JUE");

        Coche[] coches = new Coche[5];
        coches[0] = coche1;
        coches[1] = coche2;
        coches[2] = coche3;
        coches[3] = coche4;
        coches[4] = coche5;

        System.out.println("******** PRE-ORDENACIÓN ********");
        System.out.println(Arrays.toString(coches));
        System.out.println("******** POST-ORDENACIÓN ********");
        Arrays.sort(coches);
        System.out.println(Arrays.toString(coches));

        Moto moto1 = new Moto();
        Moto moto2 = new Moto("Yamaha","R1M");
        Moto moto3 = new Moto("BMW","R1250GS");
        Moto moto4 = new Moto("Ducati", "Panigale V2 Sport");

        Moto[] motos = new Moto[4];
        motos[0] = moto1;
        motos[1] = moto2;
        motos[2] = moto3;
        motos[3] = moto4;

        System.out.println("******** PRE-ORDENACIÓN ********");
        System.out.println(Arrays.toString(motos));
        System.out.println("******** POST-ORDENACIÓN ********");
        Arrays.sort(motos);
        System.out.println(Arrays.toString(motos));

        Vehiculo[] vehiculos = new Vehiculo[9];
        vehiculos[0] = coche1;
        vehiculos[1] = coche2;
        vehiculos[2] = coche3;
        vehiculos[3] = coche4;
        vehiculos[4] = coche5;
        vehiculos[5] = moto1;
        vehiculos[6] = moto2;
        vehiculos[7] = moto3;
        vehiculos[8] = moto4;

        System.out.println("******** PRE-ORDENACIÓN ********");
        System.out.println(Arrays.toString(vehiculos));
        System.out.println("******** POST-ORDENACIÓN ********");
        Arrays.sort(vehiculos);
        System.out.println(Arrays.toString(vehiculos));
        /* PARA CORREGIR LA ORDENACIÓN DE LOS VEHÍCULOS, MATRICULA DEBERÍA SER UN ATRIBUTO DE VEHÍCULO
        * Y NO SOLO DE COCHE*/
    }
}

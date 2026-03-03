package UD5_Practica1_COAC;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        COAC gestionCoac = new COAC();

        Chirigota chirigota = new Chirigota("A","chir","chir","chir","chir",33);
        Coro coro = new Coro("B","coro","coro","coro","coro",33,33,3);
        Cuarteto cuarteto = new Cuarteto("C","cuarteto","cuarteto","cuarteto","cuarteto",33,33);
        Comparsa comparsa = new Comparsa("D","comparsa","comparsa","comparsa","comparsa","comparsa",33);
        Romancero romancero = new Romancero("romancero","romancero","romancero","romancero","romancero","romancero");
        Integrante integrante = new Integrante(33,"Jesus",33,"SEVILLA");

        System.out.println("***");
        System.out.println(chirigota.toString());
        System.out.println("***");
        System.out.println(coro.toString());
        System.out.println("***");
        System.out.println(comparsa.toString());
        System.out.println("***");
        System.out.println(cuarteto.toString());
        System.out.println("***");
        System.out.println(romancero.toString());
        System.out.println("***");
        System.out.println(integrante.toString());
        System.out.println("***");

        chirigota.insertar_integrante(integrante);
        chirigota.cantar_la_presentacion();
        System.out.println("***");
        chirigota.hacer_tipo();
        System.out.println("***");
        chirigota.caminito_del_falla();
        System.out.println("***");
        System.out.println(chirigota.toString());
        System.out.println("***");

        coro.insertar_integrante(integrante);
        coro.cantar_la_presentacion();
        System.out.println("***");
        coro.hacer_tipo();
        System.out.println("***");
        coro.caminito_del_falla();
        System.out.println("***");
        System.out.println(coro.toString());
        System.out.println("***");

        gestionCoac.inscribir_agrupacion(chirigota);
        gestionCoac.inscribir_agrupacion(coro);
        gestionCoac.inscribir_agrupacion(comparsa);
        gestionCoac.inscribir_agrupacion(cuarteto);

        System.out.println(gestionCoac.toString());

        Chirigota chirigota2 = new Chirigota("ohir","ochir","achir","achir","achir",33);
        int num = chirigota.compareTo(chirigota2);
        System.out.println(num);

        System.out.println("**************************");
        gestionCoac.ordenar_por_autor();
        System.out.println(Arrays.toString(gestionCoac.agrupacionOficiales));
        System.out.println("**************************");

        chirigota.incrementarPuntos(100);
        chirigota2.incrementarPuntos(200);
        coro.incrementarPuntos(20);
        comparsa.incrementarPuntos(125);
        cuarteto.incrementarPuntos(75);

        System.out.println("**************************");
        gestionCoac.ordenar_por_puntos();
        System.out.println(Arrays.toString(gestionCoac.agrupacionOficiales));
        System.out.println("**************************");

        System.out.println("**************************");
        gestionCoac.ordenar_por_nombre();
        System.out.println(Arrays.toString(gestionCoac.agrupacionOficiales));
        System.out.println("**************************");
    }
}

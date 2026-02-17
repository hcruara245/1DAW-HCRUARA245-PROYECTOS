package UD5_Practica1_COAC;

public class Main {
    public static void main(String[] args) {
        COAC gestionCoac = new COAC();

        Chirigota chirigota = new Chirigota("chir","chir","chir","chir","chir",33);
        Coro coro = new Coro("coro","coro","coro","coro","coro",33,33,3);
        Cuarteto cuarteto = new Cuarteto("cuarteto","cuarteto","cuarteto","cuarteto","cuarteto",33,33);
        Comparsa comparsa = new Comparsa("comparsa","comparsa","comparsa","comparsa","comparsa","comparsa",33);
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
    }
}

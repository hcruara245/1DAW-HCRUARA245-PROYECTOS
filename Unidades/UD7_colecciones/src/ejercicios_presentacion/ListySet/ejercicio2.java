package ejercicios_presentacion.ListySet;

import java.util.*;

public class ejercicio2 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 10) + 1;
            lista.add(num);
        }
        System.out.println("LISTA CON REPETIDOS");
        System.out.println(lista);

        Set set = new LinkedHashSet(lista);
        List listaSinDuplicados = new ArrayList(set);

        System.out.println("LISTA SIN REPETIDOS");
        System.out.println(listaSinDuplicados);
    }
}

package ejercicios_presentacion.ListySet;

import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10) + 1;
            lista.add(num);
        }
        System.out.println("LISTA CON REPETIDOS");
        System.out.println(lista);

        Set set = new HashSet();
        set.add(5);
        lista.removeAll(set);

        /*for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Integer) {
                int num = (Integer) lista.get(i);
                if (num == 5){
                    lista.remove(i);
                    i--;
                }
            }
        }*/

        System.out.println("LISTA SIN REPETIDOS");
        System.out.println(lista);
    }
}

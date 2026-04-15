package ejercicios_presentacion.ListySet;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 100 + 1);
            lista.add(numero);
        }

        System.out.println(lista);

        Object[] nums = lista.toArray();

        Arrays.sort(nums);

        ArrayList listaordenada = new ArrayList();
        listaordenada.addAll(Arrays.asList(nums));

        System.out.println(listaordenada);
    }
}

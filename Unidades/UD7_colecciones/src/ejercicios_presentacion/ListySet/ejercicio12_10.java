package ejercicios_presentacion.ListySet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejercicio12_10 {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 1; i <= 20; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(list);

        Set todosSinRepeticiones = new HashSet(list);

        System.out.println(todosSinRepeticiones);

        Set setUnico = new HashSet();
        Set duplicados = new HashSet();

        for (Object elemento : list) {
            if (!setUnico.add(elemento)) {
                duplicados.add(elemento);
            }
        }

        for (Object elemento : duplicados) {
            setUnico.remove(elemento);
        }

        System.out.println(setUnico);
        System.out.println(duplicados);
    }
}

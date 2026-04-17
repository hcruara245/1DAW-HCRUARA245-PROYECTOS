package ejercicios_presentacion.CollectionsYMap.ej12_13;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        sorteo.add(1);
        sorteo.add(33);
        sorteo.add(67);
        sorteo.add(68);
        sorteo.add(670);
        sorteo.add(9112001);

        System.out.println(sorteo);

        Set<Integer> premiados = sorteo.premiados(3);
        System.out.println(premiados);
    }
}

package ejercicios_presentacion.CollectionsYMap.ej12_13;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sorteo<T> {
    Set<T> conjunto;

    public Sorteo() {
        conjunto = new LinkedHashSet<>();
    }

    boolean add(T elemento) {
        boolean existe = conjunto.contains(elemento);
        boolean resultado = false;
        if (!existe) {
            conjunto.add(elemento);
            resultado = true;
        }
        return resultado;
    }
}
package ejercicios_presentacion.CollectionsYMap.ej12_13;

import java.util.*;

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

    Set<T> premiados(int numPremiados){
        List<T> copia = new ArrayList<>(conjunto);
        Collections.shuffle(copia);
        Set<T> premiados = new LinkedHashSet<>();
        Iterator<T> iterator = copia.iterator();
        if (conjunto.isEmpty() || conjunto.size() < numPremiados){
            System.out.println("AÑADE MÁS NUMEROS");
        }
        else {
            for (int i=0; i<numPremiados; i++){
                T elemento = iterator.next();
                premiados.add(elemento);
                conjunto.remove(elemento);
            }
        }

        return premiados;
    }

    @Override
    public String toString() {
        return "Sorteo{" +
                "conjunto=" + conjunto +
                '}';
    }
}
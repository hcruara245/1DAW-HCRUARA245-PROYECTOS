package UD5_Practica1_COAC;

import Ejemplos.ComparableYComparator.Coche;

import java.util.Comparator;

public class ComparadorAutor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Agrupacion)o1).getAutor().compareTo(((Agrupacion) o2).getAutor());
    }
}

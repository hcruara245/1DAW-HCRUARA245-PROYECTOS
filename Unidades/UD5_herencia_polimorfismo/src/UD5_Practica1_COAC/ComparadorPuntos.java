package UD5_Practica1_COAC;

import java.util.Comparator;

public class ComparadorPuntos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((AgrupacionOficial)o1).getPuntos() - (((AgrupacionOficial) o2).getPuntos());
    }
}

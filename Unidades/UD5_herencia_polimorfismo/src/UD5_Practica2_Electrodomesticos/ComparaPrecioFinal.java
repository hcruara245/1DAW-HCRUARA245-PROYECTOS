package UD5_Practica2_Electrodomesticos;

import UD5_Practica1_COAC.Agrupacion;

import java.util.Comparator;

public class ComparaPrecioFinal implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (int) (((Lavadora)o1).getPrecioFinal() - (((Lavadora) o2).getPrecioFinal()));
    }
}

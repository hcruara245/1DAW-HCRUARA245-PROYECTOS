package UD5_Practica_Ordenar_Alumnos;

import java.util.Comparator;

public class CompararPorNota implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        int res = 0;

        res = ((int) (a2.getNota() - a1.getNota()));

        return res;
    }
}

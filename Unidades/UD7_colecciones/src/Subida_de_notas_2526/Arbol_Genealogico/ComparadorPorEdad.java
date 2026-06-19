package Subida_de_notas_2526.Arbol_Genealogico;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int res = 0;

        if (o1.getEdad() > o2.getEdad()){
            res = -1;
        }
        else if (o1.getEdad() < o2.getEdad()){
            res = 1;
        }

        return res;
    }
}

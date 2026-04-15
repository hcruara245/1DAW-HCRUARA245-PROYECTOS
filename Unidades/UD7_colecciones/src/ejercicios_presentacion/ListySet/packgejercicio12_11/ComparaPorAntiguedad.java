package ejercicios_presentacion.ListySet.packgejercicio12_11;

import java.util.Comparator;

public class ComparaPorAntiguedad implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;

        return s1.getFecha_alta() - s2.getFecha_alta();
    }
}

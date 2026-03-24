package Examen25_26_ej1;

import java.util.Comparator;

public class ComparadorEquipos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Corredor corredor1 = (Corredor) o1;
        Corredor corredor2 = (Corredor) o2;
        int res = 0;

        if (corredor1 instanceof Profesional && corredor2 instanceof Profesional) {
            Profesional p1 = (Profesional) corredor1;
            Profesional p2 = (Profesional) corredor2;
            res = p1.getNombreEquipo().compareTo(p2.getNombreEquipo());
        } else if (corredor1 instanceof Profesional && !(corredor2 instanceof Profesional)) {
            res = -1;
        } else if (!(corredor1 instanceof Profesional) && corredor2 instanceof Profesional) {
            res = 1;
        } else if (res == 0) {
            res = corredor2.getDorsal() - corredor1.getDorsal();
        }

        return res;
    }
}

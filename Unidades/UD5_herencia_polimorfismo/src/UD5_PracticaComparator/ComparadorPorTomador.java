package UD5_PracticaComparator;

import java.util.Comparator;

public class ComparadorPorTomador implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Coche c1 = (Coche) o1;
        Coche c2 = (Coche) o2;
        int res = 0;

        res = c1.getTomador().compareTo(c2.getTomador());

        if (res == 0){
            res = c1.compareTo(c2);
        }

        return res;
    }
}

package UD5_Practica3_Minecraft;

import java.util.Comparator;

public class ComparaPorCapQuemarse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Material m1 = (Material) o1;
        Material m2 = (Material) o2;
        int res = m1.capQuemarse - m2.capQuemarse;

        return res;
    }
}

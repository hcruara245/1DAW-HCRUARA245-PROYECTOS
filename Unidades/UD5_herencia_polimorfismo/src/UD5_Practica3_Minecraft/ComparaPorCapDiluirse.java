package UD5_Practica3_Minecraft;

import java.lang.management.MemoryType;
import java.util.Comparator;

public class ComparaPorCapDiluirse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Material m1 = (Material) o1;
        Material m2 = (Material) o2;
        int res = m1.capDiluirse - m2.capDiluirse;

        return res;
    }
}

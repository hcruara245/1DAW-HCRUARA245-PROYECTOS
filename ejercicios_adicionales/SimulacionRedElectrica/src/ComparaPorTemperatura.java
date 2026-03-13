import java.util.Comparator;

public class ComparaPorTemperatura implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        ComponenteDeRed c1 = (ComponenteDeRed) o1;
        ComponenteDeRed c2 = (ComponenteDeRed) o2;
        int res = 0;

        res = c1.tempTrabajo - c2.tempTrabajo;

        return res;
    }
}

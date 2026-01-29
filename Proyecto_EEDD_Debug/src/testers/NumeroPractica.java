package testers;

public class NumeroPractica {
    public static void main(String[] parametros) {
        final int MAX = 10;
        int i, j, lim;
        System.out.println("INICIO");
        i = 0;
        lim = MAX;

        do {
            for (j = 0; j < lim; j += 1) {
                if (i % 2 == 0) {
                    i++;
                } else {
                    i += 3;
                }
            }

            lim -= 2;
        } while (lim > 0);
        System.out.println("i:" + i + " j: " + j + " lim: " + lim);
    }
}
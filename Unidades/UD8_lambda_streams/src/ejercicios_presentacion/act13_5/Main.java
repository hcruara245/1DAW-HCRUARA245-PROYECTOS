package ejercicios_presentacion.act13_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Double[] numeros = {4.0, 9.0, 16.0, 25.0};
        Double[] resultados = new Double[numeros.length];

        resultados = transformar(numeros,resultados,Math::sqrt);

        System.out.println(Arrays.toString(resultados));
    }

    static <T, V> V[] transformar(T[] original,V[] transf, Function<T,V> f) {
        List<V> listaTransformada = Arrays.stream(original)
                .map(f)
                .toList();

        return listaTransformada.toArray(transf);
    }
}

package ejercicios_presentacion.act13_4;

import java.util.Arrays;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        Integer[] nums = new Integer[50];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 50 + 1);
        }

        System.out.println(Arrays.toString(nums));

        Integer[] numsfiltrados = filtrar(nums, num -> num % 3 == 0);

        System.out.println(Arrays.toString(numsfiltrados));
    }

    public static <T> T[] filtrar(T[] tabla, Predicate<T> predicado) {
        Object[] temp = Arrays.stream(tabla)
                .filter(predicado)
                .toArray();

        return (T[]) Arrays.copyOf(temp, temp.length, tabla.getClass());
    }
}
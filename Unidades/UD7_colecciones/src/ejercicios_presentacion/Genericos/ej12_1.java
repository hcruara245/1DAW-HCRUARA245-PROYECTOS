package ejercicios_presentacion.Genericos;

import java.util.Arrays;

public class ej12_1 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Juan"};
        String[] masNombres = insercion(nombres, "Pedro");

        System.out.println(Arrays.toString(masNombres));

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] numeros2 = insercion(numeros, 10);

        System.out.println(Arrays.toString(numeros2));
    }

    static <T> T[] insercion(T[] tabla, T element){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = element;
        return tabla;
    }
}
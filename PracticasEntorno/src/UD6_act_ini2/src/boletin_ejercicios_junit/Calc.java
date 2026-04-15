package boletin_ejercicios_junit;


import java.util.Random;

/**
 * Clase para manejar y realizaciones operaciones de cálculo.
 *
 * @version 1.0
 * @author Alejandro Cardo Grau
 */
public class Calc {

    /**
     * Devuelve el valor absoluto de un número entero
     *
     * @param n Número a obtener su valor absoluto
     * @return Devuelve el valor absoluto de un número entero
     */
    public static int absoluto(int n) {
        return Math.abs(n);
    }

    /**
     * Devuelve el número máximo de dos números.
     *
     * @param x Número a calcular su máximo
     * @param y Número a calcular su máximo
     * @return Devuelve el número máximo entre dos numeros x e y
     */
    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Devuelve el número mínimo de dos números.
     *
     * @param x Número a calcular su mínimo
     * @param y Número a calcular su mínimo
     * @return Devuelve el número mínimo entre dos numeros x e y
     */
    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    /**
     * Devuelve la potencia de un número expresado en base y exponente.
     *
     * @param base Base de un número entero
     * @param exponente Exponente de un número entero
     * @return Devuelve la potencia de un número expresado en base y exponente
     */
    public static int potencia(int base, int exponente) {
        return (int) Math.pow((int) base, (int) exponente);
    }

    /**
     * Devuelve un número entero aleatorio entre un rango comprendido dos
     * números (ambos inclusives).
     *
     * @param min Mínimo valor del rango comprendido
     * @param max Máximo valor del rango comprendido
     * @return Devuelve un número comprendido entre min y max, siendo min &lt;= max
     */
    public static int aleatorio(int min, int max) {
        return min + new Random().nextInt(max - min + 1); // Entre min y max: [min, max];
    }
    
    
}

package boletin_ejercicios_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CadenaTest {

    @ParameterizedTest
    @CsvSource({
        "a , 1",
        "ab , 1",
        "abc , 1",
        "bci , 1",
        "abe , 2",
        "bcd , 0",
        "bciod , 2",
        "acdefgioru , 5"
    })
    void testVocales(String nombre, int resultado) {
        assertEquals(Cadena.numeroVocales(nombre), resultado);
    }

    @ParameterizedTest
    @CsvSource({
            "'', 'a',  'a'",
            "'a',     'a',  'aa'",
            "'ab',    'a',  'aba'",
            "'abcd',  'a',  'abcda'",
            "'abcd',  'ab', 'abcdab'"
    })
    void testConcatena(String s1, String s2, String esperado) {
        assertEquals(esperado, Cadena.concatenar(s1, s2));
    }

    @ParameterizedTest
    @CsvSource({
            "'abcd',   'a',   true",
            "'abcd',   'ab',  true",
            "'abcd',   'bc',  true",
            "'abcd',   'cd',  true",
            "'abcd',   'abc', true",
            "'abcd',   'bcd', true",
            "'abcd',   'bd',  false",
            "'abcd#e', 'd#',  true"
    })
    void testSubcadena(String c1, String c2, boolean esperado) {
        assertEquals(esperado, Cadena.esContenida(c1, c2));
    }

    @ParameterizedTest
    @CsvSource({
            "'a',     true",
            "'aba',   true",
            "'abba',  true",
            "'abcba', true",
            "'abc',   false"
    })
    void testPalindromo(String cad, boolean esperado) {
        assertEquals(esperado, Cadena.esPalindromo(cad));
    }

    @ParameterizedTest
    @CsvSource({
            "'',    '',    ''",
            "a,     e,     a",
            "ab,    fe,    ab",
            "abc,   gfe,   abc"
    })
    void testCifradoYDescifrado(String cad, String encriptado, String original) {
        assertEquals(encriptado, Cadena.encriptar(cad));
        assertEquals(original, Cadena.desencriptar(encriptado));
    }
}

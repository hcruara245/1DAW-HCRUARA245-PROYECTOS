package boletin_ejercicios_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTest {

    @ParameterizedTest
    @CsvSource({
        "1,1,1,-1,0,0"
    })
    void testAbsoluto(int esperado,int entrada) {
        assertEquals(esperado, entrada);
    }

    @ParameterizedTest(name = "El máximo entre {0} y {1} debe ser {2}")
    @CsvSource({
            "0,  1,  1",
            "1,  0,  1",
            "1, -1,  1",
            "-1, 1,  1",
            "1,  4,  4",
            "5,  2,  5",
            "-1, 3,  3",
            "-1,-2, -1"
    })
    void testMaximo(int a, int b, int esperado) {
        assertEquals(esperado, Calc.max(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            " 0,  1,  0",
            " 1,  0,  0",
            " 1, -1, -1",
            "-1,  1, -1",
            " 1,  4,  1",
            " 5,  2,  2",
            "-1,  3, -1",
            "-1, -2, -2"
    })
    void testMinimo(int a, int b, int esperado) {
        assertEquals(esperado, Calc.min(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            " 0, 1,  0",
            " 1, 0,  1",
            " 1, 1,  1",
            " 2, 2,  4",
            "-1, 1, -1",
            "-1, 2,  1"
    })
    void testPotenciaPositiva(int base, int exponente, int esperado) {
        assertEquals(esperado, Calc.potencia(base, exponente));
    }

    @ParameterizedTest
    @CsvSource({
            "0,  1",
            "1,  1",
            "2,  2",
            "-1,  1",
            "-1,  2",
            "-3, -1"
    })
    void testAleatorios(int min, int max) {
        int resultado = Calc.aleatorio(min, max);
        assertTrue(resultado >= min && resultado <= max);
    }
}

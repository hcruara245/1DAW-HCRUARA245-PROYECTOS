package exam;

import static org.junit.jupiter.api.Assertions.*;

import boletin_ejercicios_junit.Cola;
import examen.CuentaCorriente;
import examen.Fecha;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CuentaCorrienteTest {
    private CuentaCorriente cuentaCorriente;

    @BeforeEach
    void setUp() {
        cuentaCorriente = new CuentaCorriente();
    }

    @ParameterizedTest
    @CsvSource({
            "500 , 1500",
            "0 , 1000",
            "-500 , 1000",
            "10.50 , 1010.50"
    })
    void testDepositar(double cantidad, double resultado) {
        cuentaCorriente.depositar(1000);
        cuentaCorriente.depositar(cantidad);
        assertEquals(resultado, cuentaCorriente.getSaldo());
    }

    @ParameterizedTest
    @CsvSource({
            "500 , 500",
            "0 , 1000",
            "-500 , 1000",
            "10.50 , 989.50",
            "1500 , 1000"
    })
    void testRetirar(double cantidad, double resultado) {
        cuentaCorriente.depositar(1000);
        cuentaCorriente.retirar(cantidad);
        assertEquals(resultado, cuentaCorriente.getSaldo());
    }

    @Test
    void testCantidadInsuficiente() {
        double cantidadDepositar = 1000;
        cuentaCorriente.depositar(cantidadDepositar);
        cuentaCorriente.retirar(1001);
        assertTrue(cuentaCorriente.getSaldo() == cantidadDepositar);
    }

    @Test
    void testAnadirTitular(){
        cuentaCorriente.anadirTitular("Titular 1");

        assertTrue(cuentaCorriente.anadirTitular("Titular 2") && cuentaCorriente.getNumTitulares() == 2);
    }

    @Test
    void testCuartoTitular(){
        cuentaCorriente.anadirTitular("Titular 1");
        cuentaCorriente.anadirTitular("Titular 2");
        cuentaCorriente.anadirTitular("Titular 3");

        assertFalse((cuentaCorriente.anadirTitular("Titular 4")) && cuentaCorriente.getNumTitulares() == 3);
    }

    @ParameterizedTest
    @CsvSource({
            "Víctor , true",
            "VíCtOr , true",
            "VÍCTOR , true",
            "Juan , false"
    })
    void testConsultarTitular(String titular, boolean resultado) {
        cuentaCorriente.anadirTitular("Víctor");

        assertEquals(cuentaCorriente.consultarTitular(titular), resultado);
    }
}
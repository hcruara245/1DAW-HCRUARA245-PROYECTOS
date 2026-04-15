package paquete;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorDescuentosTest {
    @Test
    public void validarDescuento() {
        ValidadorDescuentos validador = new ValidadorDescuentos();
        assertEquals(0,validador.obtenerPorcentajeDescuento(15));
    }

    @Test
    public void DescuentoInvalido() {
        ValidadorDescuentos validador = new ValidadorDescuentos();
        assertEquals(0,validador.obtenerPorcentajeDescuento(150));
    }

    @Test
    public void mayorDescuento() {
        ValidadorDescuentos validador = new ValidadorDescuentos();
        assertEquals(0,validador.obtenerPorcentajeDescuento(5));
    }

    @Test
    public void menorDescuento() {
        ValidadorDescuentos validador = new ValidadorDescuentos();
        assertEquals(0,validador.obtenerPorcentajeDescuento(67));
    }

    @ParameterizedTest
    @CsvSource({
            "-30, -1",
            "3, 100"
    })
    public void descuentosPrueba(int valor1, int valor2) {
        ValidadorDescuentos validador = new ValidadorDescuentos();
    }
}
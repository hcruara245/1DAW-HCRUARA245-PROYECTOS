package boletin_ejercicios_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
    private Pila pila;

    @BeforeEach
    void setUp() {
        pila = new Pila();
    }

    @Test
    void testPush() {
        String elemento = "A";

        pila.push(elemento);

        assertFalse(pila.isEmpty(), "La pila no debería estar vacía");
        assertEquals(1, pila.size(), "La pila debería tener 1 elemento");
        assertEquals(elemento, pila.peek(), "El elemento debe ser el primero de la pila");
    }

    @Test
    void testPush2(){
        String elemento1 = "A";
        String elemento2 = "B";

        pila.push(elemento1);
        pila.push(elemento2);

        // debe de dar error por problemas en la clase pila cuando empieza estando vacía
        // para corregir hay que ponerle un igual al for de la clase pila en el método push
        assertFalse(pila.isEmpty(), "La pila no debería estar vacía");
        assertEquals(2, pila.size(), "La pila debería tener 2 elementos");
        assertEquals(elemento2, pila.pop());
        assertEquals(elemento1, pila.pop());
    }

    @Test
    void testPush3() {
        // LA PILA YA TIENE DOS ELEMENTOS
        pila.push("A");
        pila.push("B");

        // METO OTROS DOS
        String nuevo1 = "C";
        String nuevo2 = "D";
        pila.push(nuevo1);
        pila.push(nuevo2);

        assertAll(
                () -> assertFalse(pila.isEmpty(), "La pila no debería estar vacía"),
                () -> assertEquals(4, pila.size(), "La pila debería tener 4 elementos"),
                () -> assertEquals(nuevo2, pila.peek(), "El último elemento insertado debería estar en la cima")
        );

    }


    @Test
    void testPop() {
        pila.push("A");
        pila.push("B");
        int tamanoInicial = pila.size();

        Object desapilado = pila.pop();

        assertEquals("B", desapilado, "Debe haber salido el último elemento que entró");
        assertEquals(tamanoInicial - 1, pila.size(), "La pila debe tener un elemento menos");
    }
}

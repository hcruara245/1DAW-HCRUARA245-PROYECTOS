package boletin_ejercicios_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColaTest {
    private Cola cola;

    @BeforeEach
    void setUp() {
        cola = new Cola();
    }

    @Test
    void testAdd() {
        String elemento = "Primero";

        cola.add(elemento);

        assertFalse(cola.isEmpty(), "La cola no debería estar vacía");
        assertEquals(1, cola.size(), "Tamaño no correcto");
        assertEquals(elemento, cola.peek(), "El elemento debe ser el último de la cola");
    }

    @Test
    void testDelete() {
        cola.add("A");
        cola.add("B");
        int tamanoInicial = cola.size();

        Object eliminado = cola.delete();

        assertEquals(tamanoInicial - 1, cola.size(), "La cola debe tener un elemento menos");
        assertEquals("A", eliminado, "El elemento eliminado debe ser el que se insertó primero");
        assertEquals("B", cola.peek(), "El segundo elemento tiene ahora una nueva posición");
    }
}

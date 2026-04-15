package boletin_ejercicios_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ListaOrdenadaTest {
    private ListaOrdenada lista;

    @BeforeEach
    void setUp() {
        lista = new ListaOrdenada();
    }

    @Test
    void testDelete() {
        lista.insertar(10);
        lista.insertar(20);
        int tamanoInicial = lista.size();

        int eliminado = lista.borrar(20);

        assertEquals(20, eliminado, "El elemento devuelto debe ser el que buscábamos borrar");

        assertEquals(tamanoInicial - 1, lista.size(), "La lista debe tener un elemento menos");
    }


    @Test
    void testRepeat() {
        lista.insertar(5);
        int tamanoAntes = lista.size();

        lista.insertar(5);

        assertEquals(tamanoAntes, lista.size(), "El tamaño no debería haber cambiado");
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 4, 6, 0, 1, 2",
            "-1, 6, 4, 0, 2, 1",
            "4, -1, 6, 1, 0, 2",
            "6, -1, 4, 2, 0, 1",
            "6, 4, -1, 2, 1, 0"
    })
    void testSort(int e1, int e2, int e3, int pos1, int pos2, int pos3) {
        lista.insertar(e1);
        lista.insertar(e2);
        lista.insertar(e3);

        assertFalse(lista.isEmpty());
        assertEquals(3, lista.size());

        assertEquals(pos1, lista.getIndex(e1), "Posición incorrecta para e1");
        assertEquals(pos2, lista.getIndex(e2), "Posición incorrecta para e2");
        assertEquals(pos3, lista.getIndex(e3), "Posición incorrecta para e3");
    }
}

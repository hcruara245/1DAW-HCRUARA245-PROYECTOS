package exam;

import static org.junit.jupiter.api.Assertions.*;

import examen.GestorNotas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GestorNotasTest {
    private GestorNotas gestorNotas;

    @BeforeEach
    void setUp() {
        gestorNotas = new GestorNotas();
    }

    @ParameterizedTest
    // NO DEBE DE PERMITIR MENORES A 0 NI MAYORES A 10, POR ESO NO HE PROBADO CON TODOS LOS VALORES LIMITES
    @CsvSource({
        "-55", // VALOR NEGATIVO ALEATORIO
        "-1 ", // VALOR LIMITE NEGATIVO
        "0 ", // VALOR LIMITE POSITIVO
        "10 ", // VALOR LIMITE POSITIVO
        "11 ", // VALOR LIMITE POSITIVO
        "55 " // VALOR POSITIVO ALEATORIO
    })
    void testAnadirNota(double nota) {
        // CONDICIÓN PARA PROBAR QUE SÍ META LOS DOS VALORES LIMITES INCLUIDOS
        if (nota == 0 || nota == 10) {
            assertTrue(gestorNotas.anadirNota(nota));
        }
        else {
            assertFalse(gestorNotas.anadirNota(nota));
        }
    }

    @Test
    void testLimiteArray(){
        for (int i = 0; i < 10; i++) {
            gestorNotas.anadirNota(i);
        }

        // PRUEBO QUE HAYA 10 DE TAMAÑO EN EL ARRAY ANTES DE INSERTAR OTRO
        assertEquals(10,gestorNotas.getNumNotas());

        gestorNotas.anadirNota(99);

        // AL INSERTAR EL SIGUIENTE, DEBE DE DAR 10 PORQUE EL MÁXIMO DE NOTAS QUE PUEDE TENER SON 10
        // ADEMÁS ME ASEGURO QUE POR ACCIDENTE NO SE HAYA GUARDADO LA NOTA NUEVA QUE ES 99
        assertTrue(gestorNotas.getNumNotas() == 10 && gestorNotas.obtenerNotaMaxima() != 99);

        /*DA VERDADERO PORQUE NO DEBE DE DEJAR METER MAS DE 10 NOTAS DENTRO DEL ARRAY DEL GESTOR DE NOTAS*/
    }

    @Test
    void testCalcularMedia() {
        gestorNotas.anadirNota(4);
        gestorNotas.anadirNota(5);
        gestorNotas.anadirNota(6);
        assertEquals(5,gestorNotas.calcularMedia());
        // APROVECHO PARA PROBAR QUE EL NUMERO DE APROBADOS ES 2 Y QUE NO SE HAYA INTRODUCIDO NINGÚN VALOR EXTRAÑO
        assertEquals(2,gestorNotas.contarAprobados());
    }

    @ParameterizedTest
    @CsvSource({
            "-1, -1, 3"
    })
    // COMPROBAR QUE NO DEJA METER NOTAS NEGATIVAS NI QUE DEJE CALCULAR LA MEDIA CON LAS NEGATIVAS
    void testCalcularMedia(int nota1, int nota2, int nota3) {
        gestorNotas.anadirNota(nota1);
        gestorNotas.anadirNota(nota2);
        gestorNotas.anadirNota(nota3);
        assertEquals(3,gestorNotas.calcularMedia());
        assertEquals(1, gestorNotas.getNumNotas());
    }

    @Test
    void testNotaMaxima() {
        // COJO LA NOTA MÁXIMA CUANDO NO HAY NINGUNA NOTA YA QUE SUPUESTAMENTE NO DEBEMOS SABER
        // EL FUNCIONAMIENTO INTERNO DEL CÓDIGO, AUNQUE YO YA HAYA VISTO QUE DEVUELVE -1
        // COMPRUEBO QUE LA NOTA MÁXIMA SEA LA MISMA QUE LA VARIABLE, PARA COMPROBAR QUE NO HACE COSAS EXTRAÑAS
        double notaMaximaSinNingunaNota = gestorNotas.obtenerNotaMaxima();
        assertEquals(notaMaximaSinNingunaNota, gestorNotas.obtenerNotaMaxima());
        // COMPRUEBO UQE NO DEVUELVA NINGÚN NUMERO POSITIVO
        assertFalse(gestorNotas.obtenerNotaMaxima() >= 0);
    }

    /*CUMPLE CON TODOS LOS TEST REALIZADOS PORQUE EN PRINCIPIO SE HAN COMPROBADO VALORES LIMITES Y PRUEBAS DELICADAS
    * Y NO HAN DADO ERRORES NINGUNA*/
}

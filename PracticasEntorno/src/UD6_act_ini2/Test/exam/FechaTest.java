package exam;

import static org.junit.jupiter.api.Assertions.*;

import examen.Fecha;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FechaTest {

    @BeforeEach
    public void setUp() {
        Fecha f = new Fecha();
    }

    @ParameterizedTest
    @CsvSource({
            "30 , 4 , 2024 , true",
            "31 , 8 , 2024 , true",
            "29 , 2 , 2024 , true",
            "28 , 2 , 2023 , true"
    })
    void testFechaValida(int dia,int mes,int anyo,boolean resultado) {
        assertEquals(Fecha.esFechaValida(dia, mes, anyo), resultado);
    }

    @ParameterizedTest
    @CsvSource({
            "29 , 2 , 2023 , false",
            "40 , 5 , 2024 , false",
            "4 , 13 , 2024 , false",
            "4 , 4 , -1 , false"
    })
    void testFechaInvalida(int dia,int mes,int anyo,boolean resultado) {
        assertEquals(Fecha.esFechaValida(anyo, dia, mes), resultado);
    }

    /*FALLÓ EL TEST DE AÑO BISIESTO CORRECTO DEL TEST FECHA VALIDA, ESTÁ CORREGIDO EN LA CLASE FECHA, ERA POR EL
    * INDICE DEL ARRAY, QUE DEBERÍA DE SER 1 EN VEZ DE 2*/
}
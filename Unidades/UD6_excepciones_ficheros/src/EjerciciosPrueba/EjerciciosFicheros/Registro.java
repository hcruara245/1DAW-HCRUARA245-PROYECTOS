package EjerciciosPrueba.EjerciciosFicheros;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Registro implements Serializable {
    double temp;
    LocalDateTime fecha;

    public Registro(double temp, LocalDateTime fecha){
        this.temp = temp;
        this.fecha = fecha;
    }
}
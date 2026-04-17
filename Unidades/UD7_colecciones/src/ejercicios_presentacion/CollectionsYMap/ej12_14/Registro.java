package ejercicios_presentacion.CollectionsYMap.ej12_14;

import java.time.LocalDateTime;
import java.util.Map;

public class Registro {
    Map<Double, LocalDateTime> estadisticas;

    public Registro(Double temp, LocalDateTime fecha) {
        this.estadisticas = Map.of(temp, fecha);
    }
}

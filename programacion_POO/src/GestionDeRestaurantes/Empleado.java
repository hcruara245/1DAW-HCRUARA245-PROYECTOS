package GestionDeRestaurantes;

import java.time.LocalDate;

public class Empleado {
    private String nombreCompleto;
    private static int contadorEmpleados = 1;
    private int idEmpleado;
    private int tlf;
    private LocalDate contratacion;
    private tipoEmpleado tipoEmpleado;

    public Empleado(String nombreCompleto, int tlf, LocalDate contratacion, GestionDeRestaurantes.tipoEmpleado tipoEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.tlf = tlf;
        this.contratacion = contratacion;
        this.tipoEmpleado = tipoEmpleado;
        this.idEmpleado = contadorEmpleados;
        contadorEmpleados++;
    }
}

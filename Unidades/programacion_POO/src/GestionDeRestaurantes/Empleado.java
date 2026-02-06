package GestionDeRestaurantes;

import java.time.LocalDate;

public class Empleado {
    private String nombreCompleto;
    private static int contadorEmpleados = 1;
    private int idEmpleado;
    private int tlf;
    private LocalDate contratacion;
    private tipoEmpleado tipoEmpleado;

    public Empleado(String nombreCompleto, int tlf, LocalDate contratacion,tipoEmpleado tipoEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.tlf = tlf;
        this.contratacion = contratacion;
        this.tipoEmpleado = tipoEmpleado;
        this.idEmpleado = contadorEmpleados;
        contadorEmpleados++;
    }
    public Empleado(String nombreCompleto, int tlf, LocalDate contratacion){
        this(nombreCompleto, tlf, contratacion, GestionDeRestaurantes.tipoEmpleado.camarero);
    }

    void mostrarDatosEmpleado(){
        System.out.println("ID del empleado: " + this.idEmpleado);
        System.out.println("Nombre del Empleado: " + this.nombreCompleto);
        System.out.println("Tlf del Empleado: " + this.tlf);
        System.out.println("Contratacion del Empleado: " + this.contratacion);
        System.out.println("Tipo del Empleado: " + this.tipoEmpleado);
    }

    void mostrarCantidadEmpleados(){
        System.out.println("Cantidad de empleados: " + contadorEmpleados);
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getTlf() {
        return tlf;
    }

    public LocalDate getContratacion() {
        return contratacion;
    }

    public tipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int contadorEmpleados) {
        Empleado.contadorEmpleados = contadorEmpleados;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public void setContratacion(LocalDate contratacion) {
        this.contratacion = contratacion;
    }

    public void setTipoEmpleado(GestionDeRestaurantes.tipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}

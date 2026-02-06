package Ejercicio9_y_10.Personal;

import java.time.LocalDate;

public class Jefe_de_estacion {
    private String nombre;
    private String DNI;
    private LocalDate nombramiento_jefe_estacion;

    public Jefe_de_estacion(String nombre, String DNI, LocalDate nombramiento_jefe_estacion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.nombramiento_jefe_estacion = nombramiento_jefe_estacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getNombramiento_jefe_estacion() {
        return nombramiento_jefe_estacion;
    }

    public void setNombramiento_jefe_estacion(LocalDate nombramiento_jefe_estacion) {
        this.nombramiento_jefe_estacion = nombramiento_jefe_estacion;
    }
}

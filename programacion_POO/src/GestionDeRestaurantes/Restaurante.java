package GestionDeRestaurantes;

public class Restaurante {
    private String nombre;
    private Empleado empleados[];
    private Plato platos[];
    private static String cadena = "MCDonald's";

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[0];
        this.platos = new Plato[0];
    }
}
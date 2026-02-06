package Ejercicio4;

public class Gestor {
    public String nombre;
    public final int tlf;
    int importe_maximo;

    public Gestor(String nombre, int tlf, int importe_maximo){
        this.nombre = nombre;
        this.tlf = tlf;
        this.importe_maximo = importe_maximo;
    }

    public Gestor(String nombre, int tlf){
        this(nombre, tlf, 10000);
    }
}
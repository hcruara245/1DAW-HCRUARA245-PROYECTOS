package UD5_Practica1_COAC;

public class Integrante {
    private int numero_participante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numero_participante, String nombre, int edad, String localidad) {
        this.numero_participante = numero_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numero_participante=" + numero_participante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}

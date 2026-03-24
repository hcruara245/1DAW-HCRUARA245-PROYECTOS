package Examen25_26_ej1;

public abstract class Participante {
    protected  String nombre;
    protected String NIF;
    protected int edad;
    protected String nacionalidad;

    public Participante(String nombre, String NIF, int edad, String nacionalidad) {
        if (nombre == null) {
            this.nombre = "";
        }
        else {
            this.nombre = nombre;
        }
        if (NIF == null) {
            this.NIF = "";
        }
        else {
            this.NIF = NIF;
        }
        if (edad < 0) {
            this.edad = 0;
        }
        else {
            this.edad = edad;
        }
        if (nacionalidad == null) {
            this.nacionalidad = "";
        }
        else {
            this.nacionalidad = nacionalidad;
        }
    }

    public String getNIF() {
        return NIF;
    }

    public abstract void mostrarDetalles();
}

package Examen25_26_ej1;

public class Voluntario extends Participante{
    private int kilometro;
    private String descFuncion;

    public Voluntario(String nombre, String NIF, int edad, String nacionalidad, int kilometro, String descFuncion) {
        super(nombre, NIF, edad, nacionalidad);
        if (kilometro < 0) {
            this.kilometro = 0;
        }
        else {
            this.kilometro = kilometro;
        }
        if (descFuncion == null) {
            this.descFuncion = "";
        }
        else {
            this.descFuncion = descFuncion;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "descFuncion='" + descFuncion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", NIF='" + NIF + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", kilometro=" + kilometro +
                '}';
    }
}

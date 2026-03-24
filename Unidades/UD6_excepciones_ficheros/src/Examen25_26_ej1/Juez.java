package Examen25_26_ej1;

public class Juez extends Participante{
    private int numJuez;

    public Juez(String nombre, String NIF, int edad, String nacionalidad, int numJuez) {
        super(nombre, NIF, edad, nacionalidad);
        if (numJuez < 0) {
            this.numJuez = 0;
        }
        else {
            this.numJuez = numJuez;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Juez{" +
                "numJuez=" + numJuez +
                ", nombre='" + nombre + '\'' +
                ", NIF='" + NIF + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}

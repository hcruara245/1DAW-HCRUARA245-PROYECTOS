package EjerciciosPrueba.EjerciciosFicheros;

import java.io.Serializable;

public class Socio implements Serializable {
    private String nombre;
    private int num;

    public Socio(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", num=" + num +
                '}';
    }
}

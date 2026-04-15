package ejercicios_presentacion.ListySet.packgejercicio12_11;

import java.io.Serializable;

public class Socio implements Comparable, Serializable {
    private String nombre;
    private String dni;
    private int fecha_alta;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFecha_alta(int fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getDni() {
        return dni;
    }

    public Socio(String nombre, String dni, int fecha_alta) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_alta = fecha_alta;
    }

    public int getFecha_alta() {
        return fecha_alta;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fecha_alta=" + fecha_alta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if (o != null) {
            Socio socio = (Socio) o;
            int resultado = socio.compareTo(this);
            if (resultado == 0) {
                res = true;
            }
        }
        return res;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;

        if (o != null) {
            Socio socio = (Socio) o;
            res = this.dni.compareTo(socio.dni);
        }

        return res;
    }

    public void antiguedad(){
        System.out.println("Antiguedad: " + fecha_alta);
    }
}

package Subida_de_notas_2526.CajasSolidarias;

import java.util.Objects;

public class Producto {
    private String nombre;
    private double peso;

    public Producto(String nombre, double peso) {
        if (nombre != null){
            this.nombre = nombre;
        }
        else {
            this.nombre = "";
        }
        if (peso > 0){
            this.peso = peso;
        }
        else {
            this.peso = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}

package UD5_PracticaComparator;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public Moto() {
    }

    @Override
    public String toString() {
        return "Moto (" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ')';
    }
}

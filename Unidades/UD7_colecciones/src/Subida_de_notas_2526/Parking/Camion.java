package Subida_de_notas_2526.Parking;

public class Camion extends Vehiculo{
    private int capacidadCarga;

    public Camion(String marca, String modelo, int anyo, String matricula, int capacidadCarga) {
        super(marca, modelo, anyo, matricula);
        if (capacidadCarga <= 0) {
            this.capacidadCarga = 1000;
        }
        else {
            this.capacidadCarga = capacidadCarga;
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "marca=" + super.getMarca() +
                ", modelo=" + super.getModelo() +
                ", anyo=" + super.getAnyo() +
                ", matricula=" + super.getMatricula() +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }

    // En realidad no haría falta porque lo tiene la clase padre y funcionaria igual pero lo pide el enunciado.
    public void mostrarDetalles(){
        System.out.println(this);
    }
}
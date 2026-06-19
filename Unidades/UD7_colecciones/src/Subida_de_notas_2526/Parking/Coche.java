package Subida_de_notas_2526.Parking;

public class Coche extends Vehiculo implements Aparcable{
    private int numeroPuertas;
    private boolean aparcado;

    public Coche(String marca, String modelo, int anyo, String matricula, int numeroPuertas, boolean aparcado) {
        super(marca, modelo, anyo, matricula);
        if (numeroPuertas > 0){
            this.numeroPuertas = numeroPuertas;
        }
        else {
            this.numeroPuertas = 5;
        }
        this.aparcado = aparcado;
    }

    public void aparcar(){
        this.aparcado = true;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca=" + super.getMarca() +
                "modelo=" + super.getModelo() +
                "año=" + super.getAnyo() +
                "matricula=" + super.getMatricula() +
                "numeroPuertas=" + numeroPuertas +
                ", aparcado=" + aparcado + // Lo pongo por si acaso, en el enunciado no lo pone.
                '}';
    }

    // En realidad no haría falta porque lo tiene la clase padre y funcionaria igual pero lo pide el enunciado.
    public void mostrarDetalles(){
        System.out.println(this);
    }
}

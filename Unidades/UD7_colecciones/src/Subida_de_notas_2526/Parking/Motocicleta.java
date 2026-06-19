package Subida_de_notas_2526.Parking;

public class Motocicleta extends Vehiculo implements Aparcable{
    private boolean tieneSidecar;
    private boolean aparcado;

    public Motocicleta(String marca, String modelo, int anyo, String matricula, boolean tieneSidecar, boolean aparcado) {
        super(marca, modelo, anyo, matricula);
        this.tieneSidecar = tieneSidecar;
        this.aparcado = aparcado;
    }

    @Override
    public String toString() {
        String sidecar = "";
        if (tieneSidecar) {
            sidecar = "si";
        }
        else{
            sidecar = "no";
        }
        return "Motocicleta{" +
                "marca=" + super.getMarca() +
                ", modelo=" + super.getModelo() +
                ", anyo=" + super.getAnyo() +
                ", matricula=" + super.getMatricula() +
                ", tieneSidecar=" + sidecar +
                ", aparcado=" + aparcado +
                '}';
    }

    // En realidad no haría falta porque lo tiene la clase padre y funcionaria igual pero lo pide el enunciado.
    public void mostrarDetalles(){
        System.out.println(this);
    }

    public void aparcar(){
        this.aparcado = true;
    }
}

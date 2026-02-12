package Boletin.Ejercicio6_7;

class Caja {
    private double ancho;
    private double alto;
    private double fondo;
    private Unidades unidad;

    public Caja(double ancho, double alto, double fondo, Unidades u) {
        if (alto <= 0 || ancho <= 0 || fondo <= 0){
            System.out.println("Algún parametro no es correcto");
        }
        else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
            this.unidad = u;
        }
    }

    double getVolumen(){
        double resultado = 0;

        resultado = this.alto * this.fondo * this.ancho;

        return resultado;
    }

    @Override
    public String toString() {
        return "Caja{" + "ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + '}';
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
}

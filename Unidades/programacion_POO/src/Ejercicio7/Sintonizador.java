package Ejercicio7;

public class Sintonizador {
    private double frecuencia;

    public Sintonizador(double frecuencia) {
        if (frecuencia < 80.0 || frecuencia > 108.0){
            this.frecuencia = 80;
        }
        else {
            this.frecuencia = frecuencia;
        }
    }

    private void modificarFrecuencia(double frecuencia){
        if (this.frecuencia + frecuencia < 80.0){
            this.frecuencia = 108;
        }
        else if (this.frecuencia + frecuencia > 108.0){
            this.frecuencia = 80;
        }
        else {
            this.frecuencia += frecuencia;
        }
    }

    void subirFrecuencia(){
        modificarFrecuencia(0.5);
    }

    void bajarFrecuencia(){
        modificarFrecuencia(-0.5);
    }

    double getFrecuencia() {
        return frecuencia;
    }

    void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    void displayFrecuencia(){
        System.out.println("La frecuencia actual es: " + frecuencia);
    }
}

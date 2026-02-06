package Ejercicio9_y_10.Maquinaria;

public class Vagon {
    private int identificador;
    private double carga_maxima;
    private double carga_actual;
    private String tipo_mercancia;

    public Vagon(int identificador, double carga_maxima, double carga_actual, String tipo_mercancia) {
        if (carga_actual > carga_maxima){
            System.out.println("ERROR: El vagón no puede superar la Masa Máxima Autorizada");
        }
        else {
            this.identificador = identificador;
            this.carga_maxima = carga_maxima;
            this.carga_actual = carga_actual;
            this.tipo_mercancia = tipo_mercancia;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public double getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(double carga_actual) {
        this.carga_actual = carga_actual;
    }

    public String getTipo_mercancia() {
        return tipo_mercancia;
    }

    public void setTipo_mercancia(String tipo_mercancia) {
        this.tipo_mercancia = tipo_mercancia;
    }
}

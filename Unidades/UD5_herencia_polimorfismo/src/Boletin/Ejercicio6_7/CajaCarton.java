package Boletin.Ejercicio6_7;

public class CajaCarton extends Caja{
    private int etiqueta;
    private static double superficieCartonUsada;
    private double superficieCartonCaja;

    public CajaCarton(double ancho, double alto, double fondo,int etiqueta) {
        super(ancho, alto, fondo, Unidades.cm);
        this.etiqueta = etiqueta;
        this.superficieCartonCaja = 6 * (super.getAncho() * super.getAlto());
        superficieCartonUsada += this.superficieCartonCaja;
    }

    double getVolumen(){
        double resultado = 0;

        resultado = super.getVolumen() * 0.8;

        return resultado;
    }
}

package UD5_Practica2_Electrodomesticos;

import java.util.Comparator;

public class Lavadora extends Electrodomestico implements Comparable, Comparator {
    private double carga;

    public Lavadora(double precio_base, Color color, ConsumoEnergetico consumo_energetico, double peso, double carga) {
        super(precio_base, color, consumo_energetico, peso);
        if (carga >= 5){
            this.carga = carga;
        }
        else {
            this.carga = 5;
        }
    }

    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = 5;
    }

    @Override
    public double getPrecioFinal(){
        double resultado = super.getPrecioFinal();

        if (this.carga > 30){
            resultado += 50;
        }

        return resultado;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                ", precioFinal=" +getPrecioFinal() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Lavadora other = (Lavadora) o;
        return ((int) (this.carga - other.carga));
    }

    @Override
    public int compare(Object o1, Object o2) {
        Lavadora lav1 = (Lavadora) o1;
        Lavadora lav2 = (Lavadora) o2;

        return lav1.compareTo(lav2);
    }
}

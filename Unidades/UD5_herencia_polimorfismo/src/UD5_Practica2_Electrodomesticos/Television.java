package UD5_Practica2_Electrodomesticos;

public class Television  extends Electrodomestico{
    private double pulgadas;
    private boolean sintonizadorTDT;

    public Television(double precio_base, Color color, ConsumoEnergetico consumo_energetico, double peso, double pulgadas, boolean sintonizadorTDT) {
        super(precio_base, color, consumo_energetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television() {
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
        this.sintonizadorTDT = false;
        this.pulgadas = 20;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double getPrecioFinal(){
        double resultado = super.getPrecioFinal();

        if (this.pulgadas > 40){
            resultado += resultado * 0.3;
        }

        if (sintonizadorTDT){
            resultado += 50;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Television{" +
                "pulgadas=" + pulgadas +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                ", precioFinal=" +this.getPrecioFinal() +
                '}';
    }
}
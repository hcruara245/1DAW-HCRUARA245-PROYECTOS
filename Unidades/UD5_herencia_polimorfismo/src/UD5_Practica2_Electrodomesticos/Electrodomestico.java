package UD5_Practica2_Electrodomesticos;

public abstract class Electrodomestico {
    protected double precio_base;
    protected Color color;
    protected ConsumoEnergetico consumo_energetico;
    protected double peso;

    public Electrodomestico(double precio_base, Color color, ConsumoEnergetico consumo_energetico, double peso) {
        if (precio_base < 100){
            this.precio_base = 100;
        }
        else {
            this.precio_base = precio_base;
        }
        if (color == null){
            this.color = Color.blanco;
        }
        else {
            this.color = color;
        }
        if (consumo_energetico == null){
            this.consumo_energetico = ConsumoEnergetico.F;
        }
        else {
            this.consumo_energetico = consumo_energetico;
        }
        if (peso < 5){
            this.peso = 5;
        }
        else {
            this.peso = peso;
        }
    }

    public Electrodomestico(double precio_base, double peso) {
        this(precio_base,Color.blanco,ConsumoEnergetico.F,peso);
    }

    public Electrodomestico() {
        this(100,Color.blanco,ConsumoEnergetico.F,5);
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal(){
        double precioFinal = 0;

        switch (this.consumo_energetico){
            case A ->
                precioFinal += 100;
            case B ->
                precioFinal += 80;
            case C ->
                precioFinal += 60;
            case D ->
                precioFinal += 50;
            case E ->
                precioFinal += 30;
            case F ->
                precioFinal += 10;
        }

        if (this.peso >= 0 && this.peso <= 29){
            precioFinal += 10;
        } else if (this.peso >= 30 && this.peso <= 49) {
            precioFinal += 60;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }

        precioFinal += this.precio_base;

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso + '}';
    }
}
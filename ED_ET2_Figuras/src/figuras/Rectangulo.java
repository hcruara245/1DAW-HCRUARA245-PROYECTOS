package figuras;

public abstract class Rectangulo extends Figura {
    private int largo;
    private int ancho;
    
    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public float calcularPerimetro() {
            return (largo*2) + (ancho*2);
    }
    public float calcularArea() {
            return largo*ancho;
    }
}

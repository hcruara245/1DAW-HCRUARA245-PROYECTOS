package figuras;

import java.awt.Graphics;

public abstract class Rectangulo extends Figura {
    private int largo;
    private int ancho;
    
    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public float calcularPerimetro() {
            return (largo*2) + (ancho*2);
    }
    
    @Override
    public float calcularArea() {
            return largo*ancho;
    }
    
    @Override
    public void paint(Graphics g, int width, int height) {
        g.drawRect((width - ancho) / 2, (height - largo) / 2, ancho, largo);
    }
}

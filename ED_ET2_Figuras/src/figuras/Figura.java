package figuras;

import java.awt.Graphics;

public abstract class Figura {
    private int X;
    private int Y;
    
    public abstract float calcularPerimetro();
    public abstract float calcularArea();
    public abstract void paint(Graphics g, int width, int height);
    
    public void moverA(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
}

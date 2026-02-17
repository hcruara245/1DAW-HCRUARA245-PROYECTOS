package ED_ET2_Figuras.src.figuras;

import java.awt.Graphics;

public abstract class Circulo extends Figura{
    private int radio;
    public Circulo(int radio){
        this.radio = radio;
    }
    
    @Override
    public float calcularPerimetro(){
        return 2 * (float) Math.PI * radio;
    }
    
    @Override
    public float calcularArea(){
        return (float) Math.PI * radio * radio;
    }
    
    @Override
    public void paint(Graphics g, int width, int height) {
        g.drawOval((width - radio) / 2, (height - radio) / 2, radio, radio);
    }
}

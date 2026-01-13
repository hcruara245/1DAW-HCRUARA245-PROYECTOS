package figuras;

import java.awt.Graphics;

public abstract class Circulo extends Figura{
    private int radio;
    public Circulo(int radio){
        this.radio = radio;
    }
    
    public float calcularPerimetro(){
        return 2 * (float) Math.PI * radio;
    }
    
    public float calcularArea(){
        return (float) Math.PI * radio * radio;
    }
}

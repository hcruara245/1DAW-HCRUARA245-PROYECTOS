package UD5_Practica3_Minecraft;

public class Sierra extends Herramienta{
    private double diametro;

    public Sierra(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible, double diametro) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Sierra{" +
                "diametro=" + diametro +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                '}';
    }
}

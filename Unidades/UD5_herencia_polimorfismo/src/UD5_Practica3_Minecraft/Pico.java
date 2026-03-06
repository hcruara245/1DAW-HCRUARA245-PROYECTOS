package UD5_Practica3_Minecraft;

public class Pico extends Herramienta implements Minar {
    private double grosor;

    public Pico(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible, double grosor) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Pico{" +
                "grosor=" + grosor +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                '}';
    }

    @Override
    public void hacer(Material material) {
        material.masa += 100;
    }

    @Override
    public void deshacer(Material material) {
        material.masa -= 100;
    }
}

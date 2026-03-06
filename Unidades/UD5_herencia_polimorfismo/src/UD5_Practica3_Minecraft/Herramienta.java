package UD5_Practica3_Minecraft;

public abstract class Herramienta extends Material{
    public Herramienta(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
    }
}

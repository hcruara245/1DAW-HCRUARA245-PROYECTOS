package UD5_Practica3_Minecraft;

import java.util.Timer;

public class Cristal extends Material implements Mezclar {

    enum TipoCristal{
        TRANSPARENTE, TRANSLUCIDO
    }

    private TipoCristal TipoCristal;

    public Cristal(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible, Cristal.TipoCristal tipoCristal) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
        TipoCristal = tipoCristal;
    }

    @Override
    public String toString() {
        return "Cristal{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                ", TipoCristal=" + TipoCristal +
                '}';
    }

    @Override
    public void MezclarConMaterial(Material material) {
        System.out.println("CRISTAL DE " + material.nombre);
    }
}

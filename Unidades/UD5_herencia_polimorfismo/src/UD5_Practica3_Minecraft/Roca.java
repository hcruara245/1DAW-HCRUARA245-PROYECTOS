package UD5_Practica3_Minecraft;

public class Roca extends Material implements Mezclar {
    private int dureza;

    public Roca(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible, int dureza) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "Roca{" +
                "dureza=" + dureza +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                '}';
    }

    @Override
    public void MezclarConMaterial(Material material) {
        System.out.println("ROCA DE " + material.nombre);
    }
}

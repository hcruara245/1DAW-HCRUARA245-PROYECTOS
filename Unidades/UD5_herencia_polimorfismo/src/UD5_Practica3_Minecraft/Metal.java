package UD5_Practica3_Minecraft;

public class Metal extends Material implements Mezclar {
    private boolean imantable;

    public Metal(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible, boolean imantable) {
        super(nombre, masa, capQuemarse, capDiluirse, movible);
        this.imantable = imantable;
    }

    @Override
    public String toString() {
        return "Metal{" +
                "imantable=" + imantable +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                '}';
    }

    @Override
    public void MezclarConMaterial(Material material) {
        System.out.println("METAL DE " + material.nombre);
    }
}

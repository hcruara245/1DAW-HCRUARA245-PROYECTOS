package UD5_Practica3_Minecraft;

public abstract class Material implements Comparable{
    protected String nombre;
    protected int masa;
    protected int capQuemarse;
    protected int capDiluirse;
    protected boolean movible;

    public Material(String nombre, int masa, int capQuemarse, int capDiluirse, boolean movible) {
        this.nombre = nombre;
        if (masa < 0 || masa > 1000){
            this.masa = 1;
        }
        else {
            this.masa = masa;
        }
        if (capQuemarse < 0 || capQuemarse > 100){
            this.capQuemarse = 1;
        }
        else {
            this.capQuemarse = capQuemarse;
        }
        if (capDiluirse < 0 || capDiluirse > 100){
            this.capDiluirse = 1;
        }
        else {
            this.capDiluirse = capQuemarse;
        }
        this.movible = movible;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capQuemarse=" + capQuemarse +
                ", capDiluirse=" + capDiluirse +
                ", movible=" + movible +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Material other = (Material) o;
        int res = 0;

        res = this.masa - other.masa;

        return res;
    }
}

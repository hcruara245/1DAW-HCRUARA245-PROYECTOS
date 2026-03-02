package UD5_Practica3_Minecraft;

import UD5_Practica2_Electrodomesticos.Electrodomestico;

public class Material implements Comparable{
    private String nombre;
    private int masa;
    private int capacidadQuemarse;
    private int capacidadDiluirse;
    private boolean movible;

    public Material(String nombre, int masa, int capacidadQuemarse, boolean movible, int capacidadDiluirse) {
        this.nombre = nombre;
        if (masa <= 0 || masa > 1000){
            this.masa = 1;
        }
        else {
            this.masa = masa;
        }
        if (capacidadQuemarse <= 0 || capacidadQuemarse > 100){
            this.capacidadQuemarse = 1;
        }
        else {
            this.capacidadQuemarse = capacidadQuemarse;
        }
        if (capacidadDiluirse <= 0 || capacidadDiluirse > 100){
            this.capacidadDiluirse = 1;
        }
        else {
            this.capacidadDiluirse = capacidadDiluirse;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getMasa() {
        return masa;
    }

    public int getCapacidadQuemarse() {
        return capacidadQuemarse;
    }

    public int getCapacidadDiluirse() {
        return capacidadDiluirse;
    }

    public boolean isMovible() {
        return movible;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", capacidadQuemarse=" + capacidadQuemarse +
                ", capacidadDiluirse=" + capacidadDiluirse +
                ", movible=" + movible +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Material material = (Material) o;

        if (material != null && this.masa < material.masa) {
            return -1;
        } else if (material != null && this.masa > material.masa) {
            return 1;
        }
        return 0;
    }
}
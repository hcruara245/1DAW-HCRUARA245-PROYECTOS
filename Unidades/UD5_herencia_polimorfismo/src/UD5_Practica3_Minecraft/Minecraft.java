package UD5_Practica3_Minecraft;

import UD5_Practica2_Electrodomesticos.Electrodomestico;

public class Minecraft{
    private Material[] materiales = new Material[10];

    public void anadirMaterial(Material material){
        for (int i = 0; i < this.materiales.length; i++){
            if (this.materiales[i] == null){
                this.materiales[i] = material;
                i = this.materiales.length - 1;
            }
        }
    }

    public void borrarMaterialSinMasa(){
        for (int i = 0; i < this.materiales.length;i++){
            if (this.materiales[i].getMasa() <= 0){
                this.materiales[i] = null;
            }
        }
    }

    public void mostrarEstado(){
        for (int i = 0; i < this.materiales.length; i++){
            if (this.materiales[i] != null){
                System.out.println(this.materiales[i].toString());
            }
            else {
                System.out.println("VACIO");
            }
        }
    }

    public Material[] getMateriales() {
        return materiales;
    }
}

package UD5_Practica3_Minecraft;

import java.util.Arrays;

public class MainMaMaMaMaincraaa {
    public static void main(String[] args) {
        Material material = new Material("Piedra",280,10,true,20);
        Material material2 = new Material("Bedrock",80,99,false,25);
        Material material3 = new Material("Losa",120,40,true,27);
        Material material4 = new Material("Tronco",50,76,false,9);
        Material material5 = new Material("Cristal",999,1,true,8);
        Material material6 = new Material("Marmol",25,9,false,44);
        Minecraft minecraft = new Minecraft();
        minecraft.anadirMaterial(material);
        minecraft.anadirMaterial(material2);
        minecraft.anadirMaterial(material3);
        minecraft.anadirMaterial(material4);
        minecraft.anadirMaterial(material5);
        minecraft.anadirMaterial(material6);
        minecraft.mostrarEstado();

        Arrays.sort(minecraft.getMateriales());
    }
}
package UD5_Practica3_Minecraft;

public class Minecraft {
    Material[] materials = new Material[10];

    public void anadirMaterial(Material material){
        boolean anadido = false;
        for (int i = 0; i < this.materials.length && !anadido; i++){
            if (this.materials[i] == null){
                this.materials[i] = material;
                anadido = true;
            }
        }

        if (!anadido){
            System.out.println("No se ha podido añadir");
        }
    }

    public void borrarMaterialSinMasa(){
        for (int i = 0; i < this.materials.length; i++){
            if (this.materials[i].masa <= 0){
                this.materials[i] = null;
            }
        }
    }

    public void mostrarEstado(){
        for (int i = 0; i < this.materials.length; i++){
            if (this.materials[i] != null){
                System.out.println(this.materials[i].toString());
            }
            else {
                System.out.println("POSICIÓN " + (i + 1) + " VACIA");
            }
        }
    }

    public void ultimoMaterialSinMasa(){
        boolean encontrado = false;
        for (int i = 0; i < this.materials.length || !encontrado; i++){
            if (this.materials[i].masa <= 0){
                System.out.println(this.materials[i].toString());
                encontrado = true;
            }
        }
    }
}

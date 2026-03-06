package UD5_Practica3_Minecraft;

public class Main {
    public static void main(String[] args) {
        Minecraft maincra = new Minecraft();
        System.out.println("*** MINECRAFT VACIO ***");
        maincra.mostrarEstado();

        Cristal cr1 = new Cristal("Cristal normal",200,300,600,false, Cristal.TipoCristal.TRANSLUCIDO);
        Sierra sierra1 = new Sierra("SIERRA MECANICA",400,100,400,true,33.44);
        Roca rock1 = new Roca("Roca de magna",900,125,1000,false,900);
        Pico pico1 = new Pico("Pico de diamante",1000,500,433,true,90.55);
        Metal metal1 = new Metal("Hierro",2000,1000,300,false,true);
        Cristal cr2 = new Cristal("Cristal especial",999,1200,3000,true, Cristal.TipoCristal.TRANSPARENTE);
        Roca rock2 = new Roca("Roca de piedra", 12000,3999,29898,true, 2999);
        Pico pico2 = new Pico("Pico de oro",2999,2000,499,true,22.45);
        Metal metal2 = new Metal("Cobre",1500,1200,500,false,false);
        Cristal cr3 = new Cristal("Cristal morado",499,120,500,false, Cristal.TipoCristal.TRANSLUCIDO);

        System.out.println("*** AÑADIR 1 MATERIAL ***");
        maincra.anadirMaterial(cr1);
        maincra.mostrarEstado();

        System.out.println("*** AÑADIR TODOS LOS MATERIALES ***");
        maincra.anadirMaterial(sierra1);
        maincra.anadirMaterial(rock1);
        maincra.anadirMaterial(pico1);
        maincra.anadirMaterial(metal1);
        maincra.anadirMaterial(cr2);
        maincra.anadirMaterial(rock2);
        maincra.anadirMaterial(pico2);
        maincra.anadirMaterial(metal2);
        maincra.anadirMaterial(cr3);
        maincra.mostrarEstado();

        System.out.println("*** MEZCLAS DE MATERIALES ***");
        System.out.println("MEZCLA CRISTAL 2 CON PICO 1 (POR EJEMPLO)");
        cr2.MezclarConMaterial(pico1);
        System.out.println("METAL 2 CON METAL 1");
        metal2.MezclarConMaterial(metal1);
        System.out.println("MEZCLAR ROCA 2 CON SI MISMA");
        rock2.MezclarConMaterial(rock2);

        System.out.println("11 PROCESOS DE HACER Y DESHACER (6 hacer y 5 deshacer)");
        pico1.hacer(cr1);
        pico1.hacer(cr2);
        pico1.hacer(cr3);
        pico1.hacer(metal1);
        pico1.hacer(metal2);
        pico1.hacer(rock1);
        pico2.deshacer(rock2);
        pico2.deshacer(cr1);
        pico2.deshacer(cr1);
        pico2.deshacer(cr3);
        pico2.deshacer(sierra1);

        System.out.println("====================");
        System.out.println("ULTIMO SIN MASA");
        maincra.ultimoMaterialSinMasa();
        System.out.println("====================");

        System.out.println("QUITAR SIN MASAS");
        maincra.borrarMaterialSinMasa();
        maincra.mostrarEstado();
    }
}

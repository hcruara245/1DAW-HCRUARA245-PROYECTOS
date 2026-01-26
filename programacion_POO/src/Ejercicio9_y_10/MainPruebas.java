package Ejercicio9_y_10;

import Ejercicio9_y_10.Maquinaria.Locomotora;
import Ejercicio9_y_10.Maquinaria.Tren;
import Ejercicio9_y_10.Maquinaria.Vagon;
import Ejercicio9_y_10.Personal.Maquinista;
import Ejercicio9_y_10.Personal.Mecanico;

public class MainPruebas {
    public static void main(String[] args) {

        /*Primero he creado mediante los constructores un mecanico una locomotora, 3 vagones y un maquinista
        * Los vagones los he metido dentro de un array de vagones
        * Al tren le he asignado un array de vagones, un maquinista y la locomotora.*/
        Mecanico mecanico1 = new Mecanico("Hugo",5125125,"motor");
        Locomotora l1 = new Locomotora("2834AZJ",3000,2025,mecanico1);
        Vagon v1 = new Vagon(000001,18391,0,"carbón");
        Vagon v2 = new Vagon(000001,18391,0,"carbón");
        Vagon v3 = new Vagon(000001,18391,0,"carbón");
        Vagon[] vagones = new Vagon[3];
        vagones[0] = v1;
        vagones[1] = v2;
        vagones[2] = v3;
        Maquinista m1 = new Maquinista("Luismi","28983245W", 2800,"Junior");
        Tren tren1 = new Tren(l1,m1,vagones);
    }
}

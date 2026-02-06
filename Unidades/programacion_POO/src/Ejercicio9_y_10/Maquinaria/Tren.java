package Ejercicio9_y_10.Maquinaria;

import Ejercicio9_y_10.Personal.Maquinista;

public class Tren {
    private Locomotora locomotoraTren;
    private Maquinista maquinistaTren;
    private Vagon vagones[];

    public Tren(Locomotora locomotoraTren, Maquinista maquinistaTren, Vagon vagones[]) {
        if(vagones.length > 5){
            System.out.println("ERROR: no se puede crear con mas de 5 vagones");
        }
        else {
            this.locomotoraTren = locomotoraTren;
            this.maquinistaTren = maquinistaTren;
            this.vagones = vagones;
        }
    }
}

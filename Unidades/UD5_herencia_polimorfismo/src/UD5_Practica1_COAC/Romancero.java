package UD5_Practica1_COAC;

import java.util.Arrays;

public class Romancero extends Agrupacion{
    private String tematicaCartelon;

    public Romancero(String tematicaCartelon,String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.tematicaCartelon = tematicaCartelon;
    }


    @Override
    protected void cantar_la_presentacion() {
        System.out.println("CANTANDO LA PRESENTACIÓN DEL ROMANCERO CON NOMBRE " + this.nombre);
    }

    @Override
    protected  void hacer_tipo() {
        System.out.println("EL ROMANCERO " + this.nombre + " HACE TIPO " + this.tipoDisfraz);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                '}';
    }
}

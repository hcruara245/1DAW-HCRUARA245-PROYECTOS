package UD5_Practica1_COAC;

import java.util.Arrays;

public class Romancero extends Agrupacion implements Callejera{
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

    @Override
    public void amo_a_escucha() {
        System.out.println("AMO A ESCUCHA LA CHIRIGOTA " + super.nombre);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Romancero c1 = (Romancero) o1;
        Romancero c2 = (Romancero) o2;

        return c1.compareTo(c2);
    }
}

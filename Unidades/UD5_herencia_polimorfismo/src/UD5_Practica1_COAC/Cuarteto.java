package UD5_Practica1_COAC;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial implements Callejera {
    private int numMiembros;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numMiembros, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.numMiembros = numMiembros;
    }

    @Override
    protected void cantar_la_presentacion() {
        System.out.println("CANTANDO LA PRESENTACIÓN DEL CUARTETO CON NOMBRE " + super.nombre);
    }

    @Override
    protected  void hacer_tipo() {
        System.out.println("EL CUARTETO " + super.nombre + " HACE TIPO " + super.tipoDisfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("EL CUARTETO " + super.nombre + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numMiembros=" + numMiembros +
                ", puntosObtenidos=" + puntos +
                ", integrantes=" + Arrays.toString(integrantes) +
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
        Cuarteto c1 = (Cuarteto) o1;
        Cuarteto c2 = (Cuarteto) o2;

        return c1.compareTo(c2);
    }
}

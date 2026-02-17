package UD5_Practica1_COAC;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial {
    private int numMiembros;
    private int puntosObtenidos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numMiembros, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.numMiembros = numMiembros;
        this.puntosObtenidos = puntosObtenidos;
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
                ", puntosObtenidos=" + puntosObtenidos +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                '}';
    }
}

package UD5_Practica1_COAC;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {
    private String empresaAtrezzo;
    private int puntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String empresaAtrezzo, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.empresaAtrezzo = empresaAtrezzo;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    protected void cantar_la_presentacion() {
        System.out.println("CANTANDO LA PRESENTACIÓN DE LA COMPARSA CON NOMBRE " + super.nombre);
    }

    @Override
    protected  void hacer_tipo() {
        System.out.println("LA COMPARSA " + super.nombre + " HACE TIPO " + super.tipoDisfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("LA COMPARSA " + super.nombre + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empresaAtrezzo='" + empresaAtrezzo + '\'' +
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

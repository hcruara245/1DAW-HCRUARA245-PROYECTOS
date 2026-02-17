package UD5_Practica1_COAC;

import java.util.Arrays;

public abstract class Agrupacion {
    protected String nombre;
    protected String autor;
    protected String autorMusica;
    protected String autorLetra;
    protected String tipoDisfraz;
    private static int agrupCreadas = 0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        agrupCreadas++;
    }

    protected abstract void cantar_la_presentacion();
    protected abstract void hacer_tipo();

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                '}';
    }

    public static int getAgrupCreadas() {
        return agrupCreadas;
    }
}
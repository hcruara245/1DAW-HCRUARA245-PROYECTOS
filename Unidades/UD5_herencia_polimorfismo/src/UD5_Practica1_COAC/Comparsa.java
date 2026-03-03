package UD5_Practica1_COAC;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {
    private String empresaAtrezzo;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String empresaAtrezzo, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.empresaAtrezzo = empresaAtrezzo;
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
    public int compare(Object o1, Object o2) {
        Comparsa c1 = (Comparsa) o1;
        Comparsa c2 = (Comparsa) o2;

        return c1.compareTo(c2);
    }
}

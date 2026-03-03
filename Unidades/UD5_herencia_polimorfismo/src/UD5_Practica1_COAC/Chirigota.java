package UD5_Practica1_COAC;

import Ejemplos.ComparableYComparator.Coche;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera {
    private int numCuples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numCuples) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.numCuples = numCuples;
    }

    @Override
    protected void cantar_la_presentacion() {
        System.out.println("CANTANDO LA PRESENTACIÓN DE LA CHIRIGOTA CON NOMBRE " + super.nombre);
    }

    @Override
    protected  void hacer_tipo() {
        System.out.println("LA CHIRIGOTA " + super.nombre + " HACE TIPO " + super.tipoDisfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("LA CHIRIGOTA " + super.nombre + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "numCuples=" + numCuples +
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
        Chirigota c1 = (Chirigota) o1;
        Chirigota c2 = (Chirigota) o2;

        return c1.compareTo(c2);
    }
}

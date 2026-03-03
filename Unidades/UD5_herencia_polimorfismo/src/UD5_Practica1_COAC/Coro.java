package UD5_Practica1_COAC;

import java.util.Arrays;

public class Coro extends AgrupacionOficial {
    private int numBandurrias;
    private int numGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int numBandurrias, int numGuitarras, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    @Override
    protected void cantar_la_presentacion() {
        System.out.println("CANTANDO LA PRESENTACIÓN DEL CORO CON NOMBRE " + super.nombre);
    }

    @Override
    protected  void hacer_tipo() {
        System.out.println("EL CORO " + super.nombre + " HACE TIPO " + super.tipoDisfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("EL CORO " + super.nombre + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
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
        Coro c1 = (Coro) o1;
        Coro c2 = (Coro) o2;

        return c1.compareTo(c2);
    }
}

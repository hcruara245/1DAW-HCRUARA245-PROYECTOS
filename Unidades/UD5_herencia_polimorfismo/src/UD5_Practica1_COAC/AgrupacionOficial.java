package UD5_Practica1_COAC;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
    protected Integrante[] integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.integrantes = new Integrante[0];
    }

    protected abstract void cantar_la_presentacion();
    protected abstract void hacer_tipo();
    protected abstract void caminito_del_falla();

    void insertar_integrante(Integrante i){
        this.integrantes = Arrays.copyOf(integrantes, integrantes.length+1);
        this.integrantes[integrantes.length - 1] = i;
    }

    boolean eliminar_integrante(Integrante i){
        boolean eliminado = false;

        for (int j = 0; j < this.integrantes.length; j++){
            if (this.integrantes[j].equals(i)){
                this.integrantes[j] = null;
                eliminado = true;
            }
        }
        return eliminado;
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrantes=" + Arrays.toString(integrantes) +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                '}';
    }
}

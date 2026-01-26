package Examen_2425.CatalogoDePeliculas;

import java.util.Arrays;

public class Catalogo {
    Pelicula[] peliculas;


    public Catalogo() { // Constructor
        this.peliculas = new Pelicula[0];
    }

    boolean agregarPelicula(Pelicula p){
        boolean agreadada = false;
        if (p != null && !peliculaExiste(p)){
            this.peliculas = Arrays.copyOf(this.peliculas, this.peliculas.length + 1);
            this.peliculas[this.peliculas.length - 1] = p;
            agreadada = true;
        }
        else{
            System.out.println("ERROR: No se puede añadir esa película");

        }
        return agreadada;
    }

    public boolean peliculaExiste(Pelicula p){
        boolean existe = false;
        for (int i = 0; i < peliculas.length && !existe; i++) {
            if (peliculas[i].equals(p)) {
                existe = true;
            }
        }
        return existe;
    }

    void listarPeliculas(){
        for (int i = 0; i < this.peliculas.length; i++) {
            System.out.println("Pelicula #" + (i + 1));
            System.out.println("Titulo: " + this.peliculas[i].getTitulo());
            System.out.println("Director: " + this.peliculas[i].getDirector());
            System.out.println("Año de Lanzamiento: " +this.peliculas[i].getAnyoLanzamiento());
            System.out.println("Genero: " + this.peliculas[i].getGenero());
            System.out.println();
        }
    }

    Pelicula [] buscarPeliculas(String cadenaABuscar, String campo){
        campo = campo.toUpperCase();
        Pelicula[] peliculasEncontradas = new Pelicula[0];
        switch (campo){
            case "DIR":
                peliculasEncontradas = buscarPorDirector(cadenaABuscar);
                break;
            case "TIT":
                peliculasEncontradas = buscarPorTitulo(cadenaABuscar);
                break;
            case "GEN":
                peliculasEncontradas = buscarPorGenero(cadenaABuscar);
                break;
            case "AÑO":
                peliculasEncontradas = buscarPorAnyo(cadenaABuscar);
                break;
        }
        return peliculasEncontradas;
    }

    private Pelicula[] buscarPorDirector(String director){
        Pelicula[] peliculasEncontradas = new Pelicula[0];
        for(int i = 0; i < this.peliculas.length; i++){
            if (peliculas[i].getDirector().trim().toUpperCase().contains(director.trim().toUpperCase())) {
                peliculasEncontradas = Arrays.copyOf(peliculasEncontradas, peliculasEncontradas.length + 1);
                peliculasEncontradas[peliculasEncontradas.length - 1] = peliculas[i];
            }
        }
        return peliculasEncontradas;
    }

    private Pelicula[] buscarPorTitulo(String titulo){
        Pelicula[] peliculasEncontradas = new Pelicula[0];
        for(int i = 0; i < this.peliculas.length; i++){
            if (peliculas[i].getTitulo().trim().toUpperCase().contains(titulo.trim().toUpperCase())) {
                peliculasEncontradas = Arrays.copyOf(peliculasEncontradas, peliculasEncontradas.length + 1);
                peliculasEncontradas[peliculasEncontradas.length - 1] = peliculas[i];
            }
        }
        return peliculasEncontradas;
    }

    private Pelicula[] buscarPorGenero(String genero){
        Pelicula[] peliculasEncontradas = new Pelicula[0];

        for (int i = 0; i < this.peliculas.length; i++) {
            if (this.peliculas[i].existeGenero(this.peliculas[i].getGenero(), genero)) {
                peliculasEncontradas = Arrays.copyOf(peliculasEncontradas, peliculasEncontradas.length + 1);
                peliculasEncontradas[peliculasEncontradas.length - 1] = peliculas[i];
            }
        }

        return peliculasEncontradas;
    }

    private Pelicula[] buscarPorAnyo(String anyo){
        Pelicula[] peliculasEncontradas = new Pelicula[0];
        int anyoBuscado = Integer.parseInt(anyo);
        for(int i = 0; i < this.peliculas.length; i++){
            if (this.peliculas[i].getAnyoLanzamiento() == anyoBuscado){
                peliculasEncontradas = Arrays.copyOf(peliculasEncontradas, peliculasEncontradas.length + 1);
                peliculasEncontradas[peliculasEncontradas.length - 1] = peliculas[i];
            }
        }
        return peliculasEncontradas;
    }
}

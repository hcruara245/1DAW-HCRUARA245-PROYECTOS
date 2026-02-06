package Futbolistas;

public class Futbolista {
    private int dorsal;
    private Futbolista futbolistaFavorito;
    private Posicion posicion;
    private int goles;
    private double salario;
    private String nombre;
    private String pais;
    private static String deporte = "Futbol";

    public Futbolista(int dorsal,  String nombre, String pais, Futbolista futbolistaFavorito, Posicion posicion, int goles, double salario) {
        if (dorsal > 99){
            System.out.println("El limite del dorsal es 99");
        }
        else {
            this.dorsal = dorsal;
            this.futbolistaFavorito = futbolistaFavorito;
            this.posicion = posicion;
            this.goles = goles;
            this.salario = salario;
            this.nombre = nombre;
            this.pais = pais;
        }

        if (this.futbolistaFavorito == null){
            this.futbolistaFavorito = this;
        }
    }

    public Futbolista(int dorsal,String nombre,String pais,Posicion posicion){
        this(dorsal,nombre,pais,null,posicion,0,0);
    }

    public Futbolista(int dorsal,String nombre, Posicion posicion){
        this(dorsal,nombre,"",posicion);
    }

    public void mostrarInfoFutbolista(){
        System.out.println("Nombre: " + this.nombre + "     | Dorsal: " + this.dorsal + " | País: " + this.pais
                            + " | Futbolista Favorito: " + this.futbolistaFavorito.getNombre()
                            +  " | Goles: " + this.goles + " | Posicion: " + this.posicion + " | Salario: " + this.salario);
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }
}

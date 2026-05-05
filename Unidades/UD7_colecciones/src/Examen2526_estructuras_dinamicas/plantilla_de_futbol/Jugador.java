package Examen2526_estructuras_dinamicas.plantilla_de_futbol;

enum Posicion{
    portero,defensa,medio,delantero
}

public class Jugador implements  Comparable<Jugador>{
    private String DNI;
    private String nombre;
    private Posicion posicion;

    public Jugador(String DNI, String nombre, Posicion posicion) {
        if (DNI != null) {
            this.DNI = DNI;
        }
        if (nombre != null) {
            this.nombre = nombre;
        }
        if (posicion != null) {
            this.posicion = posicion;
        }
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.DNI.compareTo(o.DNI);
    }
}

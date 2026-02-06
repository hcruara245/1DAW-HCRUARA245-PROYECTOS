package Futbolistas;

import java.time.LocalDate;
import java.util.Arrays;

public class Equipo {
    private String nombre;
    private LocalDate fechaFundacion;
    private Futbolista[] jugadores;

    public Equipo(String nombre, LocalDate fechaFundacion) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.jugadores = new Futbolista[0];
    }

    public void anyadirJugador(Futbolista jugador){
        boolean existe = existeJugador(this.jugadores, jugador);
        if (this.jugadores.length > 11){
            System.out.println("El limite son 11 jugadores");
        }
        else {
            if (existe){
                System.out.println("Ya existe este jugador");
            }
            else {
                this.jugadores = Arrays.copyOf(this.jugadores, this.jugadores.length + 1);
                this.jugadores[this.jugadores.length - 1] = jugador;
            }
        }
    }

    private boolean existeJugador(Futbolista[] jugadores, Futbolista jugador){
        boolean existe = false;

        for (int i = 0;i < jugadores.length;i++){
            if (jugadores[i].getNombre().equals(jugador.getNombre()) && jugadores[i].getPosicion().equals(jugador.getPosicion())){
                existe = true;
                i = jugadores.length - 1;
            }
        }

        return existe;
    }

    public void mostrarEquipo(){
        for (int i = 0; i < jugadores.length;i++){
            jugadores[i].mostrarInfoFutbolista();
        }
    }
}

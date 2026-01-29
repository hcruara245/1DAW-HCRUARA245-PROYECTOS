package Futbolistas;

import java.time.LocalDate;

public class MainPruebas {
    public static void main(String[] args) {
        Futbolista futbolista1 = new Futbolista(7,"Cristiano Ronaldo","Portugal",null,Posicion.delantero,960,40000000);
        futbolista1.mostrarInfoFutbolista();
        Equipo eq1 = new Equipo("Real Betis Balompie", LocalDate.of(1907,9,14));
        eq1.anyadirJugador(futbolista1);
    }
}

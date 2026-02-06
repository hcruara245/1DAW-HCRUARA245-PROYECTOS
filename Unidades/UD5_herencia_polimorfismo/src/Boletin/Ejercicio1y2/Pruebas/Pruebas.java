package Boletin.Ejercicio1y2.Pruebas;

import Boletin.Ejercicio1y2.HoraExacta;

public class Pruebas {
    public static void main(String[] args) {
        HoraExacta horaExacta1 = new HoraExacta(23,55,59);
        horaExacta1.inc();
        horaExacta1.comprobarHoras(23,56,0);
        String hora = horaExacta1.toString();
        System.out.println(hora);
    }
}

package Ejercicio9_y_10.Personal;

import java.time.LocalDate;

public class MainPruebas {
    public static void main(String[] args) {
        Maquinista Luismi = new Maquinista("Luis Miguel Cruz Aranda", "38981234Z", 4500.50, "Principiante");
        Mecanico Antonio = new Mecanico("Antonio López Ruiz",635561893, "motor");
        LocalDate nombramientoPepeAlfonso = LocalDate.of(2015,2,12);

        Jefe_de_estacion Atocha = new Jefe_de_estacion("Pepe Alfonso López", "28983245W",nombramientoPepeAlfonso);

        System.out.println(Luismi.getNombre());
        System.out.println("llama a ");
        System.out.println(Atocha.getNombre());
        System.out.println("para contactar con ");
        System.out.println(Antonio.getNombre());
        System.out.println("para que repare el motor del tren");
    }
}

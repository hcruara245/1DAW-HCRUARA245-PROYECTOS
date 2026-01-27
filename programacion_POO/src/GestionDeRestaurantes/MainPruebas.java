package GestionDeRestaurantes;

import java.time.LocalDate;

public class MainPruebas {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("adawd");
        Plato tortilla = new Plato("Tortilla",2.0,Categoría.tapa,20);
        r1.anyadirPlato(tortilla);
        Empleado Jesus = new Empleado("Jesus Lozano",621002074,LocalDate.now(),tipoEmpleado.responsable);
        Plato bravas = new Plato("Papas Bravas",3.5,Categoría.tapa,20);
        Plato boquerones = new Plato("Boque en Vinagre", 2.5,Categoría.tapa,20);
        r1.anyadirPlato(boquerones);
        r1.anyadirPlato(tortilla);
        r1.anyadirPlato(bravas);
        r1.mostrarPlatos();
        r1.mostrarUnidades();
        r1.anyadirEmpleado(Jesus);

        r1.mostrarEmpleados();
    }
}
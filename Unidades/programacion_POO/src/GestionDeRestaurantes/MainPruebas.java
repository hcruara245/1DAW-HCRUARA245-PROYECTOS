package GestionDeRestaurantes;

import java.time.LocalDate;

public class MainPruebas {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("Los 100 montaitos");

        Empleado emp1 = new Empleado("Manuel",5898324,LocalDate.now());
        Empleado emp2 = new Empleado("Jose",91749871,LocalDate.now());
        Empleado emp3 = new Empleado("Victor",9140917,LocalDate.now());

        Plato plato1 = new Plato("Papas Bravas",3.99,Categoría.tapa,30);
        Plato plato2 = new Plato("Pulpo a la Gallega",9.99,Categoría.media_racion,20);
        Plato plato3 = new Plato("Surtido de pescados",12.99,Categoría.racion,40);

        r1.anyadirEmpleado(emp1);
        r1.anyadirEmpleado(emp2);
        r1.anyadirEmpleado(emp3);

        r1.anyadirPlato(plato1);
        r1.anyadirPlato(plato2);
        r1.anyadirPlato(plato3);

        r1.mostrarPlatos();
        r1.mostrarEmpleados();
    }
}
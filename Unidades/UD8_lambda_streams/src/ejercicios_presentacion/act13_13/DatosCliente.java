package ejercicios_presentacion.act13_13;

import ejercicios_presentacion.act13_1.Cliente;

import java.time.LocalDate;

public class DatosCliente {
    private String nombre;
    private int fechaNacimiento;

    public DatosCliente(Cliente c) {
        this.nombre = c.getNombre();
        this.fechaNacimiento = LocalDate.now().getYear() - c.getEdad();
    }

    public int edad(){
        return LocalDate.now().getYear() - this.fechaNacimiento;
    }

    @Override
    public String toString() {
        return "DatosCliente{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

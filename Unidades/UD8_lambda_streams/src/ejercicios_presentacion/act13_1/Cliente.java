package ejercicios_presentacion.act13_1;

public class Cliente {
    private String nombre;
    private int edad;
    private String dni;

    public Cliente(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
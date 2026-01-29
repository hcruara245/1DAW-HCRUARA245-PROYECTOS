package GestionDeRestaurantes;

import java.util.Arrays;

public class Restaurante {
    private String nombre;
    private Empleado empleados[];
    private Plato platos[];
    private static String cadena = "MCDonald's";

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[0];
        this.platos = new Plato[0];
    }

    public void anyadirPlato(Plato plato) {
        boolean existe = comprobarSiExistePlato(plato);
        if (existe) {
            System.out.println("El plato ya existe");
        }
        else {
            this.platos = Arrays.copyOf(this.platos, this.platos.length + 1);
            this.platos[this.platos.length - 1] = plato;
        }
    }

    private boolean comprobarSiExistePlato(Plato plato){
        boolean existe = false;
        for (int i = 0; i < this.platos.length; i++) {
            if (plato == this.platos[i]) {
                existe = true;
            }
        }
        return existe;
    }

    public void anyadirEmpleado(Empleado empleado) {
        boolean existe = comprobarSiExisteEmpleado(empleado);

        if (existe) {
            System.out.println("El empleado ya existe");
        }
        else {
            this.empleados = Arrays.copyOf(this.empleados, this.empleados.length + 1);
            this.empleados[this.empleados.length - 1] = empleado;
        }
    }

    private boolean comprobarSiExisteEmpleado(Empleado empleado){
        boolean existe = false;

        for (int i = 0; i < this.empleados.length; i++) {
            if (empleado == this.empleados[i]) {
                existe = true;
            }
        }
        return existe;
    }

    private boolean eliminarEmpleado(int idEmpleado) {
        boolean eliminado = false;

        for (int i = 0; i < this.empleados.length; i++) {
            if(empleados[i].getIdEmpleado() == idEmpleado) {
                empleados[i] = null;
                eliminado = true;
            }
            else  {
                System.out.println("El empleado no existe");
            }
        }

        return eliminado;
    }

    void mostrarPlatos(){
        System.out.println("PLATOS:");
        for (int i = 0; i < this.platos.length; i++) {
            System.out.println("***********");
            System.out.println(this.platos[i].getNombrePlato());
        }
    }

    void mostrarUnidades(){
        System.out.println("UNIDADES:");
        for (int i = 0; i < this.platos.length; i++) {
            System.out.println("***********");
            System.out.println(this.platos[i].getNombrePlato() + " | " + this.platos[i].getUnidad() + "uds.");
        }
    }

    void mostrarEmpleados(){
        System.out.println("EMPLEADOS:");
        for (int i = 0; i < this.empleados.length; i++) {
            System.out.println("***********");
            this.empleados[i].mostrarDatosEmpleado();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public static String getCadena() {
        return cadena;
    }

    public static void setCadena(String cadena) {
        Restaurante.cadena = cadena;
    }
}
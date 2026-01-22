package Ejercicio9_y_10.Personal;

public class Mecanico {
    private String nombre;
    private int tlf;
    private String especialidad;

    public Mecanico(String nombre, int tlf, String especialidad) {
        if  (especialidad.equals("motor")
            || especialidad.equals("frenos")
            || especialidad.equals("hidráulica")
            || especialidad.equals("electricidad")){
            this.nombre = nombre;
            this.tlf = tlf;
            this.especialidad = especialidad;
        }
        else {
            System.out.println("ERROR: Especialidad incorrecta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

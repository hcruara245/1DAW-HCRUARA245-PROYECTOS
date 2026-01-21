package Ejercicio9;

public class Mecanicos {
    private String nombre;
    private int tlf;
    private String especialidad;

    public Mecanicos(String nombre, int tlf, String especialidad) {
        if (!this.especialidad.equals("frenos") || !this.especialidad.equals("hidráulica")
                || !this.especialidad.equals("motor") || !this.especialidad.equals("electricidad")){
            System.out.println("ERROR: Especialidad incorrecta");
        }
        else {
            this.nombre = nombre;
            this.tlf = tlf;
            this.especialidad = especialidad;
        }
    }
}

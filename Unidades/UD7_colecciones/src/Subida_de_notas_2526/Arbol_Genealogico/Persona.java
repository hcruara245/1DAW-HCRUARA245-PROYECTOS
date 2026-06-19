package Subida_de_notas_2526.Arbol_Genealogico;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Comparable<Persona>, Serializable {
    private String nombre;
    private String apellidos;
    private int edad;
    private Persona padre;
    private Persona madre;

    public Persona(String nombre, String apellidos, int edad, Persona padre, Persona madre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "nombre desconocido";
        }
        if (apellidos != null) {
            this.apellidos = apellidos;
        }
        else {
            this.apellidos = "apellidos desconocidos";
        }
        if (edad > 0) {
            this.edad = edad;
        }
        else {
            this.edad = 0;
        }

        // pueden ser null
        this.padre = padre;
        this.madre = madre;
    }

    public Persona() {
        this(null,null,0,null,null);
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public int obtenerEdadAbuelos(){
        int totalEdad = 0;

        if (padre != null) {
            if (padre.madre != null) {
                totalEdad += padre.madre.getEdad();
            }
            if (padre.padre != null) {
                totalEdad += padre.padre.getEdad();
            }
        }

        if (madre != null) {
            if (madre.padre != null) {
                totalEdad += madre.padre.getEdad();
            }
            if (madre.madre != null) {
                totalEdad += madre.madre.getEdad();
            }
        }

        return totalEdad;
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;

        if (o instanceof Persona) {
            Persona p = (Persona) o;
            if (p.getApellidos().equalsIgnoreCase(this.apellidos) && p.getNombre().equalsIgnoreCase(this.nombre)) {
                if (p.getPadre() != null && this.getPadre() != null){
                    Persona p2 = (Persona) p.getPadre();
                    Persona p3 = (Persona) this.getPadre();
                    boolean padresIguales = p2.equals(p3);
                    if (padresIguales) {
                        if (p.getMadre() != null && this.getMadre() != null) {
                            Persona m2 =  (Persona) p.getMadre();
                            Persona m3 = (Persona) this.getMadre();
                            boolean madresIguales = m2.equals(m3);
                            if (madresIguales) {
                                res = true;
                            }
                        }
                    }
                }
            }
        }

        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, padre, madre);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String nombrePadre = "nadie";
        String nombreMadre = "nadie";

        if (padre != null) {
            nombrePadre = padre.getNombre() + " " + padre.getApellidos();
        }
        if (madre != null) {
            nombreMadre = madre.getNombre() + " " +  madre.getApellidos();
        }

        return "Yo soy " + this.nombre + " " + this.apellidos + " hijo de " + nombrePadre + " y " + nombreMadre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int compareTo(Persona o) {
        int res = 0;

        res = this.getApellidos().compareTo(o.getApellidos());

        if (res == 0){
            res = this.getNombre().compareTo(o.getNombre());
        }

        return res;
    }
}
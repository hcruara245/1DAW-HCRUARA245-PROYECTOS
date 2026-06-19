package adivina_el_numero.EJ1;

import java.util.Arrays;

public class Modulo {
    private Alumno[] alumnos;
    private String nombre;

    public Modulo(String nombre, int num_alumnos) {
        this.nombre = nombre;
        if (num_alumnos <= 0){
            System.out.println("El numero de alumnos no puede ser menor o igual a 0");
        }
        else {
            this.alumnos = new Alumno[num_alumnos];
        }
    }

    public void generarInforme(){
        System.out.println("*** INFORME FINAL DE CALIFICACIONES - MÓDULO: " + nombre + " ***");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].getNombre() + " : "  + alumnos[i].obtenerCalificacion());
        }
    }

    public double obtenerMediaGrupo(){
        double media = 0;

        for (int i = 0; i < alumnos.length; i++) {
            media += alumnos[i].obtenerMedia();
        }

        media /= alumnos.length;

        return media;
    }

    public Alumno obtenerAlumnoDestacado(){
        Alumno alumnoDestacado = new Alumno("AUX");

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].obtenerMedia() > alumnoDestacado.obtenerMedia()) {
                alumnoDestacado = alumnos[i];
            }
        }

        return alumnoDestacado;
    }

    public void obtenerNotaMasAlta(){
        double notaMasAlta = 0;
        String nombreAlumno = "";
        int examen = 0;

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].getNotas().length; j++) {
                if (alumnos[i].getNotas()[j] > notaMasAlta) {
                    notaMasAlta = alumnos[i].getNotas()[j];
                    nombreAlumno = alumnos[i].getNombre();
                    examen = j + 1;
                }
            }
        }

        System.out.println("El alumno/alumna " + nombreAlumno + " ha obtenido un " + notaMasAlta + " en el examen " + examen);
    }

    public int calcularExamenesAprobados(){
        int numExamenesAprobados = 0;

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].getNotas().length; j++) {
                if (alumnos[i].getNota(j) >= 5) {
                    numExamenesAprobados++;
                }
            }
        }

        return numExamenesAprobados;
    }

    public Alumno[] obtenerAlumnosSuspensos(){
        Alumno[] alumnosSuspensos = new Alumno[0];

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].obtenerMedia() < 5) {
                alumnosSuspensos = Arrays.copyOf(alumnosSuspensos, alumnosSuspensos.length + 1);
                alumnosSuspensos[alumnosSuspensos.length - 1] = alumnos[i];
            }
        }

        return alumnosSuspensos;
    }

    public void registrarAlumno (Alumno alumno){
        boolean para = false;
        for (int i = 0; i < alumnos.length && !para; i++) {
            if (alumnos[i] == null){
                alumnos[i] = alumno;
                para = true;
            }
        }
    }
}
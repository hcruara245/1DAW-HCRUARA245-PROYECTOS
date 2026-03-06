package UD5_Practica_Ordenar_Alumnos;

import java.util.Comparator;

public class Alumno implements Comparable {
    private Ciclo ciclo;
    private Curso curso;
    private String nombre;
    private String id;
    private int edad;
    private double nota;

    public Alumno(Ciclo ciclo, Curso curso, String nombre, String id, int edad, double nota) {
        if (ciclo != null){
            this.ciclo = ciclo;
        }
        else {
            this.ciclo = Ciclo.NA;
        }
        if (curso != null) {
            this.curso = curso;
        }
        else {
            this.curso = Curso.NA;
        }
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "N/A";
        }
        if (id != null) {
            this.id = id;
        }
        else {
            this.id = "N/A";
        }
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        Alumno other = (Alumno) o;

        if (this.ciclo == Ciclo.DAW ||this.ciclo == Ciclo.DAM || other.ciclo == Ciclo.DAM || other.ciclo == Ciclo.DAW ){
            CompararPorNota comp = new CompararPorNota();
            res = comp.compare(this, other);
            // HE ASUMIDO QUE SIEMPRE LOS DAW/DAM SE ORDENAN POR NOTA
        }
        // EN LOS DEMÁS CASOS SERÁ POR NOMBRE, O SI ES DAW o DAM TIENE PREFERENCIA ANTES QUE SMR O NA (NINGÚN ASIG.)
        else if (this.ciclo == Ciclo.NA || this.ciclo == Ciclo.SMR && other.ciclo == Ciclo.DAW || other.ciclo == Ciclo.DAM){
            res = -1;
        }
        else if (other.ciclo == Ciclo.NA || other.ciclo == Ciclo.SMR && this.ciclo == Ciclo.DAW || this.ciclo == Ciclo.DAW){
            res = 1;
        }
        else{
            res = this.nombre.compareTo(other.nombre);
        }

        return res;
    }

    public double getNota() {
        return nota;
    }
}

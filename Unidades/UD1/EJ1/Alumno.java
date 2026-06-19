package adivina_el_numero.EJ1;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private double[] notas;

    public Alumno(String nombre, int num_notas) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "NOMBRE NO IDENTIFICADO";
        }
        this.notas = new double[num_notas];
    }

    public Alumno(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "NOMBRE NO IDENTIFICADO";
        }
        this.notas = new double[2];
    }

    public double getNota(int indice) {
        double nota_resultado = 0;

        if (indice > notas.length || indice < 0) {
            System.out.println("Indice invalido");
        }
        else {
            nota_resultado = notas[indice];
        }

        return nota_resultado;
    }

    public boolean setNota(int indice, double nota) {
        boolean resultado = false;

        if (indice > notas.length || indice < 0) {
            System.out.println("Indice invalido");
        }
        else {
            if (nota > 10 || nota < 0) {
                System.out.println("Nota invalida");
            }
            else {
                notas[indice] = nota;
                resultado = true;
            }
        }

        return resultado;
    }

    public int getCantidadNotas(){
        return notas.length;
    }

    public double obtenerMedia(){
        double resultado = 0;

        for (int i = 0; i < notas.length; i++) {
            resultado += notas[i];
        }

        resultado /= notas.length;

        return resultado;
    }

    public double[] getNotas() {
        return notas;
    }

    public String obtenerCalificacion(){
        double media =  obtenerMedia();
        String resultado = "";

        if (media < 5){
            resultado = "INSUFICIENTE";
        } else if (media >= 5 && media < 6.5) {
            resultado = "SUFICIENTE";
        } else if (media >= 6.5 && media < 8.5) {
            resultado = "NOTABLE";
        } else {
            resultado = "SOBRESALIENTE";
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "[" + this.obtenerCalificacion() + "] Alumno: " + this.nombre + " - Media: " + this.obtenerMedia();
    }

    public void introducirNotas(double notas[]){
        if (notas != null) {
            this.notas = notas;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

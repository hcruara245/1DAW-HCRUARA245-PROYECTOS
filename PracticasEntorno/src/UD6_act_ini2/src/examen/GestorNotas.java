package examen;

public class GestorNotas {
    
    private double[] notas;
    private int numNotas;

    public GestorNotas() {
        this.notas = new double[10];
        this.numNotas = 0;
    }

    public boolean anadirNota(double nota) {
        if (nota < 0 || nota > 10 || numNotas >= notas.length) {
            return false;
        }
        notas[numNotas] = nota;
        numNotas++;
        return true;
    }

    public double calcularMedia() {
        if (numNotas == 0) return 0.0;
        double suma = 0;
        for (int i = 0; i < numNotas; i++) {
            suma += notas[i];
        }
        return suma / numNotas;
    }

    public int contarAprobados() {
        int aprobados = 0;
        for (int i = 0; i < numNotas; i++) {
            if (notas[i] >= 5.0) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public double obtenerNotaMaxima() {
        if (numNotas == 0) return -1.0;
        double max = notas[0];
        for (int i = 1; i < numNotas; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public int getNumNotas() {
        return numNotas;
    }
}
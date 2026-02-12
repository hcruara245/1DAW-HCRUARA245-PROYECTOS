package Boletin.Ejercicio4_5;

import java.util.Arrays;

public abstract class Instrumento {
    protected Notas notasMusicales[] = new Notas[0];

    protected void add(Notas nota){
        this.notasMusicales = Arrays.copyOf(this.notasMusicales, this.notasMusicales.length + 1);
        this.notasMusicales[this.notasMusicales.length - 1] = nota;
    }

    protected abstract void interpretar();
}
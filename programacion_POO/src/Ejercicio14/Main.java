package Ejercicio14;

import java.util.Arrays;

public class Main {
    int tablaEnteros[];

        public Main(){
            this.tablaEnteros = new int[0];
        }

    public static void main(String[] args) {
        Main tabla1 = new Main();
        tabla1.insertarFinal(3);
    }

    void insertarFinal(int nuevo){
        this.tablaEnteros = Arrays.copyOf(this.tablaEnteros, this.tablaEnteros.length + 1);
        this.tablaEnteros[tablaEnteros.length - 1] = nuevo;
    }
}
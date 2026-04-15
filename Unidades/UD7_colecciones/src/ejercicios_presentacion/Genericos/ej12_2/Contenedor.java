package ejercicios_presentacion.Genericos.ej12_2;

import java.util.Arrays;

public class Contenedor<T> {
    private T[] tabla;

    public Contenedor() {
        this.tabla = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }

    void insertarAlPrincipio(T nuevo){
        T[] aux = (T[]) new Object[1];
        aux[0] = nuevo;
        T[] newtabla = (T[]) new Object[tabla.length + 1];
        newtabla[0] = nuevo;
        for (int i = 1; i < newtabla.length; i++) {
            newtabla[i] = this.tabla[i - 1];
        }
        tabla = newtabla;
    }

    void insertarAlFinal(T nuevo){
        T[] nueva =  Arrays.copyOf(tabla, tabla.length + 1);
        nueva[nueva.length - 1] = nuevo;
        tabla = nueva;
    }

    T extraerDelPrincipio(){
        T element = tabla[0];

        tabla = Arrays.copyOfRange(tabla, 1, tabla.length);

        return element;
    }

    T extraerDelFinal(){
        T element = tabla[tabla.length - 1];

        tabla = Arrays.copyOfRange(tabla, 0, tabla.length - 1);

        return element;
    }

    void ordenarTabla(){
        try {
            Arrays.sort(tabla);
        } catch (ClassCastException e) {
            System.out.println("NO SE PUEDE ORDENAR CORRECTAMENTE");
        }
    }
}

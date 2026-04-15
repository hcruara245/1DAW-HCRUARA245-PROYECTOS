package boletin_ejercicios_junit;

/**
 * Clase de propósito para manejar una estructura de dato tipo Pila
 *
 * @version 1.0
 * @author Alejandro Cardo Grau
 */
public class Pila {

    private Object pila[];
    private int size; // Cantidad de elementos que están en la pila

    /**
     * Inicializar la pila dinámica
     */
    public Pila() {
        this.pila = null;
        size = 0;
    }

    /**
     * Devolver la cantidad de elementos que están en la pila.
     *
     * @return Devuelve la cantidad de elementos existentes.
     */
    public int size() {
        return size;
    }

    /**
     * Comprueba si la pila está vacía
     *
     * @return Devuelve <code>true</code> si la pila no posee ningún elemento,
     * falso en caso contrario.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Agrega un nuevo valor en la pila (justo detrás).
     *
     * @param element El valor de elemento que pone en la pila
     */
    public void push(Object element) {
        Object pila[];

        if (this.pila != null && size > 0) {
            int i;
            pila = new Object[size + 1];
            /*
            * PONER UN <= antes del size
            * quedaría así: i <= size
            */
            for (i = 1; i < size; i++) {
                pila[i] = this.pila[i - 1];
            }
        } else {
            pila = new Object[1];
        }

        pila[0] = element; // Agrega al principio de la pila
        this.pila = pila;
        size++;
    }

    /**
     * Elimina un valor del principio de la pila (el valor último almacenado).
     *
     * @return Devuelve el valor del elemento si en la pila ha sido borrado un
     * elemento, <code>null</code> en caso contrario.
     */
    public Object pop() {
        Object deleted = null;

        if (this.pila != null && size > 0) {
            // 1. Recuperar objeto a eliminar
            deleted = peek();

            // 2. Generar nuevo array sin el valor del primero
            Object pila[] = new Object[size - 1];
            System.arraycopy(this.pila, 1, pila, 0, pila.length);
            this.pila = pila;
            size--;
        }

        return deleted;
    }

    /**
     * Devuelve el valor que está principio de la pila, sin eliminarlo.
     *
     * @return Devuelve el valor del elemento en el índice del principio,
     * <code>null</code> en caso contrario.
     */
    public Object peek() {
        return (this.pila != null && size() > 0) ? pila[0] : null;
    }

    /**
     * Devolver el valor del elemento que está en un índice concreto de la pila.
     *
     * @param index El indice del elemento que desea devolver en el .
     *
     * @return Devuelve el valor del elemento en el índice existente,
     * <code>null</code> en caso contrario.
     */
    private Object getIndex(int index) {
        return (pila != null && index >= 0 && index < pila.length) ? pila[index] : null;
    }
}

package boletin_ejercicios_junit;

/**
 * Clase de propósito para manejar una estructura de dato tipo Cola
 *
 * @version 1.0
 * @author Alejandro Cardo Grau
 */
public class Cola {

    private Object cola[];
    private int size; // Cantidad de elementos que están en la cola

    /**
     * Inicializar la cola dinámica
     */
    public Cola() {
        this.cola = null;
        size = 0;
    }

    /**
     * Devolver la cantidad de elementos que están en la cola.
     *
     * @return Devuelve la cantidad de elementos existentes.
     */
    public int size() {
        return size;
    }
    
    /**
     * Comprueba si la cola está vacía
     *
     * @return Devuelve <code>true</code> si la cola no posee ningún elemento,
     * falso en caso contrario.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Agrega un nuevo valor en la cola (justo detrás).
     *
     * @param element El valor de elemento que pone
     */
    public void add(Object element) {
        Object cola[];

        if (this.cola != null && size > 0) {
            int i;
            cola = new Object[size + 1];
            for (i = 0; i < size; i++) {
                cola[i] = this.cola[i];
            }
            cola[i] = element;
        } else {
            cola = new Object[1];
            cola[0] = element;
        }

        this.cola = cola;
        size++;
    }

    /**
     * Elimina un valor del principio de la cola.
     *
     * @return Devuelve el valor del elemento si en la cola ha sido borrado un
     * elemento, <code>null</code> en caso contrario.
     */
    public Object delete() {
        Object deleted = null;

        if (this.cola != null && size > 0) {
            // 1. Recuperar objeto a eliminar
            deleted = peek();

            // 2. Generar nuevo array sin el valor del primero
            Object cola[] = new Object[size - 1];
            System.arraycopy(this.cola, 1, cola, 0, cola.length);
            this.cola = cola;
            size--;
        }

        return deleted;
    }

    /**
     * Devuelve el valor que está principio de la cola, sin eliminarlo.
     *
     * @return Devuelve el valor del elemento en el índice del principio,
     * <code>null</code> en caso contrario.
     */
    public Object peek() {
        return (this.cola != null && size() > 0) ? cola[0] : null;
    }

    /**
     * Devolver el valor del elemento que está en un índice concreto de la cola.
     *
     * @param index El indice del elemento que desea devolver en el .
     *
     * @return Devuelve el valor del elemento en el índice existente,
     * <code>null</code> en caso contrario.
     */
    public Object getIndex(int index) {
        return (cola != null && index >= 0 && index < cola.length) ? cola[index] : null;
    }
}

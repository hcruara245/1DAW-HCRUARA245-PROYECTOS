package boletin_ejercicios_junit;


/**
 * Clase de propósito para manejar una estructura de dato tipo lista ordenada
 * sin valores repetidos
 *
 * @version 1.0
 * @author Alejandro Cardo Grau
 */
public class ListaOrdenada {

    private Integer lista[];
    private int size; // Cantidad de elementos que están en la lista

    /**
     * Inicializar la lista dinámica
     */
    public ListaOrdenada() {
        this.lista = null;
        size = 0;
    }

    /**
     * Devolver la cantidad de elementos que están en la lista.
     *
     * @return Devuelve la cantidad de elementos existentes.
     */
    public int size() {
        return size;
    }
    
    /**
     * Comprueba si la lista está vacía
     *
     * @return Devuelve <code>true</code> si la lista no posee ningún elemento,
     * falso en caso contrario.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Agrega un nuevo valor no repetido en la lista pero de forma ordenada
     *
     * @param element El valor de elemento que pone (no se admiten elementos
     * repetidos)
     * @return Devuelve <code>true</code>si en la lista ha sido insertado el
     * elemento, <code>false</code> en caso contrario.
     */
    public boolean insertar(int element) {
        Integer aux[];
        boolean insertado = false;

        // Comprobar si existe el elemento
        if (getIndex(element) == -1) {
            if (this.lista != null && size > 0) {
                int pos = 0;
                aux = new Integer[size + 1];

                while (pos < size && this.lista[pos] < element) {
                    aux[pos] = this.lista[pos];
                    pos++;
                }
                
                aux[pos] = element;

                // Copiamos el resto del array
                for (int i = pos + 1; i < size + 1; i++) {
                    aux[i] = this.lista[i - 1];
                }

            } else {
                aux = new Integer[1];
                aux[0] = element;
            }

            this.lista = aux;
            size++;
            insertado = true;
        }

        return insertado;
    }

    /**
     * Elimina el valor encontrado manteniendo la lista de forma ordenada
     * 
     * @param element Elemento a eliminar.
     * 
     * @return Devuelve el valor del elemento si en la lista ha sido borrado un
     * elemento, <code>null</code> en caso contrario.
     */
    public int borrar(int element) {
        Integer aux[];
        Integer deleted = null;

        // Comprobar si existe el elemento
        if (getIndex(element) >= 0) {
            if (this.lista != null && size > 1) {
                int pos = 0;
                aux = new Integer[size - 1];

                while (pos < size && this.lista[pos] < element) {
                    aux[pos] = this.lista[pos];
                    pos++;
                }
                
                deleted = this.lista[pos];

                // Copiamos el resto del array
                for (int i = pos + 1; i < size; i++) {
                    aux[i - 1] = this.lista[i];
                }

            } else {
                deleted = this.lista[0];
                aux = null;
            }

            this.lista = aux;
            size--;
        }

        return deleted;
    }

    /**
     * Devolver el valor del elemento que está en un índice concreto de la
     * lista.
     *
     * @param index El indice del elemento que desea devolver en el .
     *
     * @return Devuelve el valor del elemento en el índice existente,
     * <code>null</code> en caso contrario.
     */
    public int getElement(int index) {
        return (lista != null && index >= 0 && index < lista.length) ? lista[index] : null;
    }

    /**
     * Devolver el valor del índice que está un valor concreto de la lista.
     *
     * @param element Elemento a buscar.
     *
     * @return Devuelve el índice entero existente donde se encuentra el valor
     * almacenado, <code>-1</code> en caso contrario.
     */
    public int getIndex(int element) {
        int pos = 0;
        boolean encontrado = false;

        if (lista != null) {
            while (!encontrado && pos < lista.length) {
                if (lista[pos] == element) {
                    encontrado = true;
                } else {
                    pos++;
                }
            }
        }

        return (encontrado) ? pos : -1;
    }
}
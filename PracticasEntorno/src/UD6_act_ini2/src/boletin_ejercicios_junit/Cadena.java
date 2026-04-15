package boletin_ejercicios_junit;

/**
 * Clase de propósito para manejar cadenas de texto.
 *
 * @version 1.0
 * @author Alejandro Cardo Grau
 */
public class Cadena {

    // Número de carácteres que se rota, según codificación César básico
    private static final int NUM_CARACTERES_ROTAR = 4;

    /**
     * Determina la longitud de una cadena
     *
     * @param cad Cadena a obtener su longitud
     * @return Devuelve la longitud de caracteres de una cadena
     */
    private static int longitud(String cad) {
        return cad.length();
    }

    /**
     * Determina el caracter del centro de una cadena, según su longitud
     *
     * @param cad Cadena a obtener su caracter de posición central
     * @return Devuelve el caracter central de una cadena
     */
    private static char caracterCentral(String cad) {
        return cad.charAt(longitud(cad) / 2);
    }

    /**
     * Obtiene la mitad derecha de una cadena, según su longitud
     *
     * @param cad Cadena a obtener su mitad derecha, según su longitud
     * @return Devuelve la mitad derecha de una cadena
     */
    private static String mitadDerecha(String cad) {
        return cad.substring(longitud(cad) / 2);
    }

    /**
     * Obtiene la mitad izquierda de una cadena, según su longitud
     *
     * @param d Cadena a obtener su mitad izquierda, según su longitud
     * @return Devuelve la mitad izquierda de una cadena
     */
    private static String mitadIzquierda(String cad) {
        return (cad.substring(0, longitud(cad) / 2));
    }

    /**
     * Obtiene la cadena concatenada entre cad1 y cad2
     *
     * @param cad1 Cadena inicial
     * @param cad2 Cadena final
     * @return Devuelve la cadena concatenada entre cad1
     */
    public static String concatenar(String cad1, String cad2) {
        return cad1.concat(cad2);
    }

    /**
     * Localiza si cad2 está contenida en cad1 como subcadena.
     *
     * @param cad1 Cadena principal
     * @param cad2 Subcadena a buscar en cad1
     * @return Devuelve <code>true</code>, si cad2 está contenida en cad1,
     * <code>false</code> en caso contrario
     */
    public static boolean esContenida(String cad1, String cad2) {
        return cad1.contains(cad2);
    }

    /**
     * Dada una cadena contabiliza el número de vocales existentes en la misma
     *
     * @param cad Cadena a tratar
     * @return Devuelve el número de vocales, mayúsculas o minúsculas,
     * existentes en cad.
     */
    public static int numeroVocales(String cad) {
        int num = 0;
        char c = '\0';

        for (int pos = 0; pos < longitud(cad); pos++) {
            c = Character.toUpperCase(cad.charAt(pos)); // Extrae cada posición de la cadena y lo almacena en un char

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                num++;
            }
        }

        return num;
    }

    /**
     * Dada una cadena determina si es palíndroma o no
     *
     * @param cad Cadena a tratar para determinar si es palíndroma
     * @return Devuelve <code>true</code>, si cad es palíndroma,
     * <code>false</code> en caso contrario
     */
    public static boolean esPalindromo(String cad) {
        boolean esPalindromo = true;
        int i = 0, j = longitud(cad) - 1;

        while (i <= longitud(cad) / 2 && esPalindromo) {
            if (Character.toUpperCase(cad.charAt(i)) != Character.toUpperCase(cad.charAt(j))) {
                esPalindromo = false;
            } else {
                i++;
                j--;
            }
        }

        return esPalindromo;
    }

    /**
     * Permite cifrar una cadena mediante método César básico a partir de una
     * rotación de caracteres.
     *
     * @param cad Cadena a cifrar
     * @return Cadena cifrada según la codificación César
     */
    public static String encriptar(String cad) {
        String cadena_encriptada = "";

        StringBuffer str = new StringBuffer(cad);
        cad = str.reverse().toString();

        for (int i = 0; i < (longitud(cad)); i++) {
            cadena_encriptada += (char) ((int) cad.charAt(i) + Cadena.NUM_CARACTERES_ROTAR);
        }

        return cadena_encriptada;
    }

    /**
     * Permite descifrar una cadena codificada mediante método Cesar básico a
     * partir de una rotación de caracteres.
     *
     * @param cad Cadena a descifrar
     * @return Cadena descifrada según la codificación César
     */
    public static String desencriptar(String cad) {
        String cadena_desencriptada = "";

        StringBuffer str = new StringBuffer(cad);
        cad = str.reverse().toString();

        for (int i = 0; i < (longitud(cad)); i++) {
            cadena_desencriptada += (char) ((int) cad.charAt(i) - Cadena.NUM_CARACTERES_ROTAR);
        }

        return cadena_desencriptada;
    }
}

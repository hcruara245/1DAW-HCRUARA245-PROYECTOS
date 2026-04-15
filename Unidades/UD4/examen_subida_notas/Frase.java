package ejercicios_presentacion.examen_subida_notas;

import java.util.Arrays;

public class Frase {
    private String[] palabras;
    private int tamanyo;
    private static String diccionario = "RAE";
    private int id_frase;
    private static int contadorfrases = 1;
    // PARA QUE EMPIECE LA PRIMERA FRASE EN 1

    public int getId_frase() {
        return id_frase;
    }

    private int palabrasOcupadas;

    public Frase(int tamanyo) {
        this.tamanyo = tamanyo;
        this.palabras = new String[this.tamanyo];
        this.id_frase = this.contadorfrases;
        this.contadorfrases++;
    }

    public Frase() {
        this(10);
    }

    public boolean insertarPalabra(String pal) {
        boolean resultado = false;

        if (pal != null && !pal.equals("")) {
            if (this.palabrasOcupadas > this.tamanyo) {
                System.out.println("ERROR: NO SE PUEDE INSERTAR " + pal + " PORQUÉ EL TAMAÑO DE LA FRASE ESTÁ COMPLETA");
            }
            else {
                for (int i = 0; i < palabras.length && !resultado; i++) {
                    if (this.palabras[i] == null) {
                        this.palabras[i] = pal;
                        this.palabrasOcupadas++;
                        resultado = true;
                    }
                }
            }
        }
        else {
            System.out.println("ERROR: NO SE PUEDE INSERTAR UNA PALABRA NULA O LA CADENA VACÍA");
        }

        return resultado;
    }

    public boolean eliminarPalabra(String pal) {
        boolean resultado = false;

        for (int i =  0; i < this.palabras.length && !resultado; i++) {
            if (this.palabras[i] != null && this.palabras[i].equals(pal)) {
                this.palabras[i] = null;
                this.palabrasOcupadas--;
                resultado = true;
            }
        }

        reorganizarArray(this.palabras);

        return resultado;
    }

    private void reorganizarArray(String[] palabras){
        String[] primeramitad = new String[0];
        String[] segundamitad = new String[0];
        String[] resultado = new  String[this.tamanyo];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == null) {
                primeramitad = Arrays.copyOfRange(palabras, 0, --i);
                segundamitad = Arrays.copyOfRange(palabras, ++i, palabras.length);
            }
        }

        for (int i = 0; i < primeramitad.length; i++) {
            resultado[i] = primeramitad[i];
        }

        for (int i = 0; i < segundamitad.length; i++) {
            resultado[i] = segundamitad[i];
        }
    }

    public String obtenerPalabraMasLarga(){
        String palabraMasLarga = "";
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i] != null &&  this.palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = this.palabras[i];
            }
        }
        if (palabraMasLarga.equals("")) {
            System.out.println("LA FRASE ESTÁ VACÍA CON LO QUE NO SE PUEDE MOSTRAR LA PALABRA MÁS LARGA/CORTA");
        }
        else {
            System.out.println(palabraMasLarga);
        }

        return palabraMasLarga;
    }

    public String obtenerPalabraMasCorta(){
        /* LA PALABRA MÁS CORTA LA GUARDO PRINCIPALMENTE COMO LA PALABRA MÁS LARGA PARA QUE SIEMPRE SE GUARDE LA MÁS CORTA*/
        String palabraMasCorta = this.obtenerPalabraMasLarga();
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i] != null &&  this.palabras[i].length() < palabraMasCorta.length()) {
                palabraMasCorta = this.palabras[i];
            }
        }
        if (palabraMasCorta.equals("")) {
            System.out.println("LA FRASE ESTÁ VACÍA CON LO QUE NO SE PUEDE MOSTRAR LA PALABRA MÁS LARGA/CORTA");
            palabraMasCorta = "";
        }
        else {
            System.out.println(palabraMasCorta);
        }

        return palabraMasCorta;
    }

    public void estadoFrase(){
        int res = this.palabras.length - this.palabrasOcupadas;
        System.out.println("ESTADO FRASE: " + res);
    }

    public void imprimirFrase(){
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i] != null) {
                System.out.print(this.palabras[i] + " ");
            }
        }
    }

    public void imprimirFraseInvertida(){
        for (int i = this.palabras.length - 1 ; i >= 0; i--) {
            if (this.palabras[i] != null){
                System.out.print(this.palabras[i] + " ");
            }
        }
    }
}
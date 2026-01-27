package Examen_2425.BufferCircular;

public class BufferCircular {
    private Integer[] numerosBuffer;
    private int posicion;
    private int masAntiguo;

    public BufferCircular(){
        this.numerosBuffer = new Integer[10];
        this.posicion = 0;
    }

    boolean insertarNumero(Integer numero){
        boolean insertado = false;

        if (numero != null) {
            if (posicion < numerosBuffer.length) {
                numerosBuffer[posicion] = numero;
                insertado = true;
                posicion++;
                this.masAntiguo = posicion;
            } else if (posicion == numerosBuffer.length) { // Buffer lleno, se sobrescribe el más antiguo
                posicion = 0;
                numerosBuffer[posicion] = numero;
                insertado = true;
                posicion++;
                this.masAntiguo = posicion;
            }
        }
        return insertado;
    }

    Integer leer(){
        if (masAntiguo == numerosBuffer.length){
            this.masAntiguo = 0;
        }
        Integer masAntiguo;
        masAntiguo = this.numerosBuffer[this.masAntiguo];
        this.numerosBuffer[this.masAntiguo] = null;
        this.masAntiguo++;

        return masAntiguo;
    }

    void mostrarBuffer(){
        System.out.println("______________________________");
        System.out.print("| ");
        for (int i = 0; i < this.numerosBuffer.length;i++){
            System.out.print(this.numerosBuffer[i] +" ");
        }
        System.out.println(" |");
    }

    int estadoBuffer(){
        int estadoBuffer = 0;

        for (int i = 0; i < this.numerosBuffer.length; i++){
            if(this.numerosBuffer[i] != null){
                estadoBuffer += 10;
            }
        }

        return estadoBuffer;
    }
}
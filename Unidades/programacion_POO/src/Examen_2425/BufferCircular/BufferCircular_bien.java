package Examen_2425.BufferCircular;

public class BufferCircular_bien {
    private Integer[] numerosBuffer;
    private int escritura;
    private int lectura;

    public BufferCircular_bien(){
        this.numerosBuffer = new Integer[10];
        this.escritura = 0;
        this.lectura = 0;
    }

    boolean insertarNumero(Integer numero){
        boolean insertado = false;

        if (numero != null && numerosBuffer[escritura] == null) {
            if(escritura < numerosBuffer.length){
                numerosBuffer[escritura] = numero;
                insertado = true;
                escritura++;
            }
            else{
                escritura = 0;
                numerosBuffer[escritura] = numero;
                insertado = true;
                escritura++;
            }
        }
        else {
            System.out.println("No se puede insertar el numero");
        }

        return insertado;
    }

    Integer leer(){
        if (escritura == numerosBuffer.length){
            this.escritura = 0;
        }
        Integer resultado;
        resultado = this.numerosBuffer[this.lectura];
        this.numerosBuffer[this.lectura] = null;
        this.lectura++;

        return resultado;
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

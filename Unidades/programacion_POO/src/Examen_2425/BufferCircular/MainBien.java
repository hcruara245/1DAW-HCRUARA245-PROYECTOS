package Examen_2425.BufferCircular;

public class MainBien {
    public static void main(String[] args) {
        BufferCircular_bien bufferCircular = new BufferCircular_bien();

        bufferCircular.mostrarBuffer();
        int estado1 = bufferCircular.estadoBuffer();

        System.out.println(estado1);

        for (int i = 0; i<5; i++){
            bufferCircular.insertarNumero(i);
        }

        bufferCircular.mostrarBuffer();

        bufferCircular.leer();
        bufferCircular.mostrarBuffer();

        for (int i = 0; i<5; i++){
            bufferCircular.insertarNumero(i);
        }

        bufferCircular.mostrarBuffer();

        for (int i = 0; i<5; i++){
            bufferCircular.leer();
        }

        bufferCircular.mostrarBuffer();

        bufferCircular.leer();
        bufferCircular.mostrarBuffer();
        bufferCircular.insertarNumero(33);
        bufferCircular.mostrarBuffer();
        bufferCircular.leer();
        bufferCircular.mostrarBuffer();

        bufferCircular.insertarNumero(44);
        bufferCircular.insertarNumero(15);
        bufferCircular.insertarNumero(5);
        bufferCircular.insertarNumero(67);
        bufferCircular.insertarNumero(99);
        bufferCircular.insertarNumero(80);
        bufferCircular.insertarNumero(14);
        bufferCircular.mostrarBuffer();
        bufferCircular.insertarNumero(5);
        bufferCircular.insertarNumero(7);
    }
}

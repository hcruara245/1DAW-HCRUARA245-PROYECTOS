package Examen_2425.BufferCircular;

public class MainPruebas {
    public static void main(String[] args) {
        BufferCircular buffer = new BufferCircular();
        /*Testeo para ver que se crea correctamente*/
        buffer.insertarNumero(5);
        buffer.insertarNumero(10);
        buffer.insertarNumero(15);
        buffer.insertarNumero(20);
        buffer.insertarNumero(25);
        buffer.insertarNumero(30);
        buffer.insertarNumero(35);
        buffer.insertarNumero(40);
        buffer.insertarNumero(45);
        buffer.insertarNumero(50);
        Integer numeroMasAntiguo = buffer.leer();
        System.out.println("El número más antiguo es: " + numeroMasAntiguo);
        buffer.insertarNumero(33);
        buffer.mostrarBuffer();
        buffer.insertarNumero(154);
        buffer.insertarNumero(14);
        buffer.mostrarBuffer();
        buffer.leer();
        buffer.mostrarBuffer();
        int estadoBuffer = buffer.estadoBuffer();
        System.out.println(estadoBuffer);
        buffer.leer();
        buffer.leer();
        estadoBuffer = buffer.estadoBuffer();
        System.out.println(estadoBuffer);
        buffer.insertarNumero(3);
        buffer.mostrarBuffer();
        buffer.insertarNumero(67);
        buffer.mostrarBuffer();
    }
}

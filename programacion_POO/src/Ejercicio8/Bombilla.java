package Ejercicio8;

public class Bombilla {
    private boolean encendida;
    static boolean interruptorGeneralEncendido = true;

    public Bombilla() {
        this.encendida = false;
    }

    public static boolean isInterruptorGeneralEncendido() {
        return interruptorGeneralEncendido;
    }

    public static void setInterruptorGeneralEncendido(boolean interruptorGeneralEncendido) {
        Bombilla.interruptorGeneralEncendido = interruptorGeneralEncendido;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public boolean estaEncendida() {
        return this.encendida && interruptorGeneralEncendido;
    }

}

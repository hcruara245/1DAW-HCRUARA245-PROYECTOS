package Ejercicio8;

public class Bombilla {
    private boolean bombillaEncendida;
    static boolean interruptorGeneralEncendido;

    public Bombilla() {
        this.bombillaEncendida = false;
    }

    public static boolean isInterruptorGeneralEncendido() {
        return interruptorGeneralEncendido;
    }

    public static void setInterruptorGeneralEncendido() {
        Bombilla.interruptorGeneralEncendido = true;
    }

    public void encender() {
        this.bombillaEncendida = true;
    }

    public void apagar() {
        this.bombillaEncendida = false;
    }

    public boolean isbombillaEncendida() {
        return this.bombillaEncendida && interruptorGeneralEncendido;
    }

}

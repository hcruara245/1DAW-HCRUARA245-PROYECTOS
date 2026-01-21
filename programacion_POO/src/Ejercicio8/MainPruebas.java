package Ejercicio8;

public class MainPruebas {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();
        b1.encender();
        b2.encender();
        b3.encender();
        System.out.println(b1.estaEncendida());
        System.out.println(b2.estaEncendida());
        System.out.println(b3.estaEncendida());
        Bombilla.setInterruptorGeneralEncendido(false);
        System.out.println(b1.estaEncendida());
        Bombilla.setInterruptorGeneralEncendido(true);
        System.out.println(b1.estaEncendida());
        System.out.println(b2.estaEncendida());
        System.out.println(b3.estaEncendida());
        b1.apagar();
        System.out.println(b1.estaEncendida());
        System.out.println(b2.estaEncendida());
    }
}

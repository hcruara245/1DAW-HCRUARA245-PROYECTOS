package Ejercicio7;

public class MainPruebas {
    public static void main(String[] args) {
        Sintonizador s1 = new Sintonizador(80.35);
        s1.displayFrecuencia();
        s1.subirFrecuencia();
        s1.subirFrecuencia();
        s1.bajarFrecuencia();
        s1.displayFrecuencia();

        System.out.println("=== PRUEBA 2 ===");
        Sintonizador s2 = new Sintonizador(108);
        s2.displayFrecuencia();
        s2.subirFrecuencia();
        s2.displayFrecuencia();
        s2.bajarFrecuencia();
        s2.displayFrecuencia();
    }
}

package paquete;

import examen.eedd.puntos.Punto;

public class PruebaPunto {
    public static void main(String[] args) {
        Punto p = new Punto();
        System.out.println("Llamada externa");
        p.imprimirPunto(8, 8, 8);
    }
}

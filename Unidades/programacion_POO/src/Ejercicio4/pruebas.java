package Ejercicio4;

public class pruebas {
    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente("Hugo","12345678A",1000);
        Gestor g1 = new Gestor("Juan de la palmilla",621002075,100);

        cc1.setGestor(g1);
        cc1.mostrar_info();
    }
}

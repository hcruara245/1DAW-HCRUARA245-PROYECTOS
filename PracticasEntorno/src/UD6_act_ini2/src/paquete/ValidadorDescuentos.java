package paquete;

public class ValidadorDescuentos {
    public int obtenerPorcentajeDescuento(int edad) {
        if (edad < 0 || edad > 120) {
            return -1;
        }
        if (edad < 5) {
            return 100;
        } else if (edad <= 12) {
            return 50;
        } else if (edad <= 64) {
            return 0;
        } else {
            return 30;
        }
    }
}
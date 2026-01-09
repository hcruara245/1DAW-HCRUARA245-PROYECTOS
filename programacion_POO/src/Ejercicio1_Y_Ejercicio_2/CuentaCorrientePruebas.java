package Ejercicio1_Y_Ejercicio_2;

public class CuentaCorrientePruebas {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan de la Palmilla", "12345678A");
        cuenta1.ingresar_dinero(3000);
        cuenta1.sacar_dinero(2000);
        cuenta1.mostrar_info();

        CuentaCorriente cuenta2 = new CuentaCorriente("Franklin de la palmilla", "28983245W");
        cuenta2.ingresar_dinero(99999999);
        cuenta2.sacar_dinero(1000000000);
        cuenta2.mostrar_info();

        CuentaCorriente cuenta3 = new CuentaCorriente("Michael Trevor Philips Franklin eventualmente defiende su casa mientras mete genuinamente las manos en la comida", "67693361E");
        cuenta3.mostrar_info();
    }
}

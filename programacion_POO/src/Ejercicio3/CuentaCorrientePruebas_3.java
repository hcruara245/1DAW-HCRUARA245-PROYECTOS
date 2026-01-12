package Ejercicio3;

public class CuentaCorrientePruebas_3 {
    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente("hugo","28983245W",300);
        cc1.ingresar_dinero(200);

        String banco = cc1.getNombre_banco();
        System.out.println(banco);

        cc1.setNombre_banco("CaixaBank");
        banco = cc1.getNombre_banco();
        System.out.println(banco);

        CuentaCorriente cc2 = new CuentaCorriente("Antony","55667788P",36000);
        cc2.setNombre_banco("Banco Antony");
        String banco2 = cc2.getNombre_banco();
        cc1.setNombre_banco(cc2.getNombre_banco());
        banco = cc1.getNombre_banco();
        banco2 = cc2.getNombre_banco();
        System.out.println(banco);
        System.out.println(banco2);

        cc1.mostrar_info();
        cc2.mostrar_info();
    }
}

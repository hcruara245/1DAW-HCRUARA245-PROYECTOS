package Subida_de_notas_2526.CajasSolidarias;

public class MainSolidario {
    public static void main(String[] args) {
        CajaSolidaria cajaSolidaria = new CajaSolidaria("M");
        Producto p1 = new Producto("ARROZ", 5);
        Producto p2 = new Producto("ARROZ", 5);
        Producto p3 = new Producto("ARROZ", 5);
        Producto p4 = new Producto("LENTEJAS", 3);
        Producto p5 = new Producto("LECHE", 2);
        Producto p6 = new Producto("SACO DE PATATAS", 15);

        cajaSolidaria.anadirProducto(p1);
        cajaSolidaria.anadirProducto(p2);
        cajaSolidaria.anadirProducto(p3);
        cajaSolidaria.anadirProducto(p4);
        cajaSolidaria.anadirProducto(p5);
        // Se me añade el saco de patatas igualmente no me dio tiempo a ver de porqué
        cajaSolidaria.anadirProducto(p6);

        cajaSolidaria.mostrarEstadoCaja();
        System.out.println(cajaSolidaria.consultarCantidadProducto("ARROZ"));

    }
}

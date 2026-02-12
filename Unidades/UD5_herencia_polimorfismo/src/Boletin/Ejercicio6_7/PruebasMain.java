package Boletin.Ejercicio6_7;

public class PruebasMain {
    public static void main(String[] args) {
        CajaCarton c1 = new CajaCarton(6.76,8.12,10.1,111111);
        System.out.println(c1.getVolumen());
        CajaCarton c2 = new CajaCarton(4.5,314.4,1,2898324);
        System.out.println(c2.toString());
        System.out.println(c2.getVolumen());
    }
}

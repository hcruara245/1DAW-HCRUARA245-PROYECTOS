package UD5_Practica2_Electrodomesticos;

public class MainElectro {
    public static void main(String[] args) {
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(200,Color.azul,ConsumoEnergetico.A,90,20);
        Lavadora lav3 = new Lavadora(2800,80);

        System.out.println(lav1.toString());
        System.out.println(lav2.toString());
        System.out.println(lav3.toString());
    }
}

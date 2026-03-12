package EjerciciosPrueba.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(2000,"Victor");

        c1.ingresarDinero(2000);
        try {
            c1.retirarDinero(5000);
        }
        catch (SaldoInsuficienteException e) {
            System.out.println("SALDO INSUFICIENTE");
        }

    }
}

package EjerciciosPrueba.CuentaBancaria;

public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(double saldo, String titular) {
        if (saldo > 0){
            this.saldo = saldo;
        }
        else {
            saldo = 0;
        }
        if (titular != null){
            this.titular = titular;
        }
        else {
            this.titular = "N/A";
        }
    }

    public void ingresarDinero(double dinero){
        if (dinero > 0){
            this.saldo += dinero;
        }
    }

    public void retirarDinero(double dinero) throws SaldoInsuficienteException {
        if (dinero > 0 && dinero < this.saldo){
            this.saldo -= dinero;
        }
        else if (dinero > this.saldo){
            throw new SaldoInsuficienteException("El dinero a retirar es mayor que el saldo");
        }
    }
}

package examen;

// Clase CuentaCorriente.java
public class CuentaCorriente {
    
    private String [] titulares;
    private int numTitulares;
    private double saldo;
    
    public CuentaCorriente(String titular, double saldoInicial) {
        this.titulares = new String [3];
        this.titulares[0]=titular;
        this.numTitulares++;
        this.saldo = saldoInicial;
    }
    
    public CuentaCorriente() {
        this.titulares = new String [3];
        this.saldo=0;
    }

    public boolean anadirTitular(String titular){
        boolean titularAnadido = false;
        int i=0;
        while(i<titulares.length && !titularAnadido){
            if(titulares[i]==null){
                this.titulares [i] = titular;
                titularAnadido = true;
                this.numTitulares++;
            }
            i++;
        }
        return titularAnadido;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        boolean retirado = false;
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            retirado = true;
        }
        return retirado;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean consultarTitular(String titular){
        boolean encontrado = false;
        for (int i=0;i<titulares.length;i++){
            if(titulares[i]!=null && titulares[i].toUpperCase().equals(titular.toUpperCase()))
                encontrado = true;    
        }
        return encontrado;
    }
    
    public String[] getTitulares() {
        return titulares;
    }
    
    public int getNumTitulares() {
        return numTitulares;
    }

}
package UD5_PracticaComparator;

public abstract class Vehiculo implements Comparable{
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo() {
        this("xxxx","xxxx");
    }


    @Override
    public int compareTo(Object o) {
        Vehiculo other = (Vehiculo) o;
        int res=0;

        if (this.marca.compareTo(other.marca) != 0) {
            res = this.marca.compareTo(other.marca);
        }
        else {
            res = this.modelo.compareTo(other.modelo);
        }

        return res;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

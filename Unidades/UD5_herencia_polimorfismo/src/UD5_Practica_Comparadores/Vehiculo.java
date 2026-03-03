package UD5_Practica_Comparadores;

public class Vehiculo implements Comparable{
    protected String marca;
    protected String modelo;

    @Override
    public int compareTo(Object o) {
        Vehiculo other = (Vehiculo) o;
        int res = 0;
        if (!this.marca.equalsIgnoreCase(other.marca)){
            res = this.marca.compareTo(other.marca);
        }
        else {
            res = this.modelo.compareTo(other.modelo);
        }
        return res;
    }
}

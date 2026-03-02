package UD5_PracticaComparator;

public class Coche extends Vehiculo {
    private String matricula;

    public Coche(String marca, String modelo, String matricula) {
        super(marca, modelo);
        this.matricula = matricula;
    }

    public Coche(String marca, String modelo) {
        super(marca, modelo);
        this.matricula = null;
    }

    public Coche() {
        this.matricula = null;
    }

    @Override
    public int compareTo(Object o) {
        Coche other = (Coche) o;
        int res=0;

        if (this.matricula == null && other.matricula == null) {
            res = super.compareTo(other);
        }
        else if (other.matricula == null){
            res = -1;
        }
        else if (this.matricula == null){
            res = 1;
        }
        else {
            res = this.matricula.compareTo(other.matricula);
        }

        return res;
    }

    @Override
    public String toString() {
        return "Coche (" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ')';
    }
}

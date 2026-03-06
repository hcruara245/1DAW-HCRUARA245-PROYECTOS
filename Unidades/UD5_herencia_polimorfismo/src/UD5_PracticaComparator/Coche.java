package UD5_PracticaComparator;

public class Coche extends Vehiculo {
    private String matricula;
    private Tomador tomador;

    public Coche(String marca, String modelo, String matricula, Tomador tomador) {
        super(marca, modelo);
        this.matricula = matricula;
        this.tomador = tomador;
    }

    public Coche(String marca, String modelo, Tomador tomador) {
        super(marca, modelo);
        this.matricula = null;
        this.tomador = tomador;
    }

    public Coche(Tomador tomador) {
        this.matricula = null;
        this.tomador = tomador;
    }

    @Override
    public int compareTo(Object o) {
        int res=0;

        if (o instanceof Coche){
            Coche other = (Coche) o;
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
        }
        else {
            res = super.compareTo(o);
        }

        return res;
    }

    @Override
    public String toString() {
        return "Coche (" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tomador='" + tomador + '\'' +
                ')';
    }

    public Tomador getTomador() {
        return tomador;
    }
}

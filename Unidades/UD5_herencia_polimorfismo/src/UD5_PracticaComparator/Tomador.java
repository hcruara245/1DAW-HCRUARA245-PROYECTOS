package UD5_PracticaComparator;

public class Tomador implements Comparable{
    private String nombreCompania;
    private String nifAsegurado;

    public Tomador(String nombreCompania, String nifAsegurado) {
        this.nombreCompania = nombreCompania;
        this.nifAsegurado = nifAsegurado;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        Tomador other = (Tomador) o;

        if (this.nombreCompania != other.nombreCompania){
            res = this.nombreCompania.compareTo(other.nombreCompania);
        }
        else {
            res = this.nifAsegurado.compareTo(other.nifAsegurado);
        }

        return res;
    }

    @Override
    public String toString() {
        return "Tomador{" +
                "nombreCompania='" + nombreCompania + '\'' +
                ", nifAsegurado='" + nifAsegurado + '\'' +
                '}';
    }
}

package Examen25_26_ej1;

public class Amateur extends Corredor{
    public Amateur(String nombre, String NIF, int edad, String nacionalidad, int minutos, Categoria categoria) {
        super(nombre, NIF, edad, nacionalidad, minutos, categoria);
    }

    @Override
    public void registrarMarca(int minutos) {
        super.minutos = minutos;
    }

    @Override
    public void mostrarDetalles() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Amateur{" +
                "dorsal=" + dorsal +
                ", minutos=" + minutos +
                ", categoria=" + categoria +
                ", nombre='" + nombre + '\'' +
                ", NIF='" + NIF + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        if (o instanceof Amateur) {
            Amateur p = (Amateur) o;
            res = this.getMinutos() -  p.getMinutos();
        }
        return res;
    }
}

package Examen25_26_ej1;

public class Profesional extends Corredor{
    private String nombreEquipo;
    private String licenciaFED;

    public Profesional(String nombre, String NIF, int edad, String nacionalidad, int minutos, Categoria categoria, String nombreEquipo, String licenciaFED) {
        super(nombre, NIF, edad, nacionalidad, minutos, categoria);
        if (nombreEquipo == null) {
            this.nombreEquipo = "";
        }
        else {
            this.nombreEquipo = nombreEquipo;
        }
        if (licenciaFED == null) {
            this.licenciaFED = "";
        }
        else {
            this.licenciaFED = licenciaFED;
        }
    }

    @Override
    public void registrarMarca(int minutos) {
        /*HE SUPONIDO QUE SE CAMBIAN LOS MINUTOS Y NO QUE SE AÑADEN PORQUE NO ENTIENDO EL FUNCIONAMIENTO EXACTO
        * DE UNA MARATON*/
        this.minutos = minutos;
        this.comunicarMarcaFederacion();
    }

    private void comunicarMarcaFederacion(){
        System.out.println("EL CORREDOR: " + super.nombre + " CON EL DORSAL: " + super.dorsal + " HA COMUNICADO UN TIEMPO DE "
        + super.minutos + " MINUTOS");
    }

    @Override
    public void mostrarDetalles() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", licenciaFED='" + licenciaFED + '\'' +
                ", dorsal=" + dorsal +
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
        if (o instanceof Profesional) {
            Profesional p = (Profesional) o;
            res = this.getMinutos() -  p.getMinutos();
        }
        return res;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
}

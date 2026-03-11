public abstract class Vehiculo implements Mantenible{
    protected String matricula;
    protected double cargaActual;
    protected double cargaMaxima;


    public Vehiculo(String matricula, double cargaMaxima) {
        this.matricula = matricula;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }

    public void cargar(double peso) throws CargaNegativaException,CargaExtendidaException{
        if (peso < 0){
            throw new CargaNegativaException ("La carga no puede ser negativa");
        }
        else if (cargaActual + peso > cargaMaxima){
            throw new CargaExtendidaException("La carga no puede ser superior a la carga máxima");
        }
        else {
            cargaActual += peso;
        }
    }

    abstract double calcularCostoViaje();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", cargaActual=" + cargaActual +
                ", cargaMaxima=" + cargaMaxima +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}

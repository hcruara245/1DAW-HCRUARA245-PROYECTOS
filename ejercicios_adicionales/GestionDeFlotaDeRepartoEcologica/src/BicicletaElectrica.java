public class BicicletaElectrica extends Vehiculo{
    private int nivelBateria;
    private static double costoKilometros = 0.1;
    private double kilometrosRecorridos;

    public BicicletaElectrica(String matricula, double cargaMaxima, int nivelBateria,double kilometrosRecorridos) {
        super(matricula, cargaMaxima);
        if (nivelBateria > 100 || nivelBateria < 0){
            this.nivelBateria = 0;
        }
        else {
            this.nivelBateria = nivelBateria;
        }
        if (kilometrosRecorridos < 0.0) {
            this.kilometrosRecorridos = 0.0;
        }
        else {
            this.kilometrosRecorridos = kilometrosRecorridos;
        }
    }

    @Override
    double calcularCostoViaje() {
        return kilometrosRecorridos * costoKilometros;
    }

    @Override
    public boolean requiereMantenimiento() {
        boolean requiereMantenimiento = false;

        if (this.nivelBateria < 15){
            requiereMantenimiento = true;
        }

        return  requiereMantenimiento;
    }

    @Override
    public void realizarMantenimiento() {
        this.nivelBateria = 100;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                ", matricula='" + matricula + '\'' +
                ", cargaActual=" + cargaActual +
                ", cargaMaxima=" + cargaMaxima +
                ", nivelBateria=" + nivelBateria +
                '}';
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public static double getCostoKilometros() {
        return costoKilometros;
    }

    public static void setCostoKilometros(double costoKilometros) {
        BicicletaElectrica.costoKilometros = costoKilometros;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}

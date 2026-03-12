public class Furgoneta extends Vehiculo{
    private double kilometrosRecorridos;
    private static double costoKilometros = 0.5;

    public Furgoneta(String matricula, double cargaMaxima, double kilometrosRecorridos) {
        super(matricula, cargaMaxima);
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

        if (this.kilometrosRecorridos >= 10000){
            requiereMantenimiento = true;
        }

        return  requiereMantenimiento;
    }

    @Override
    public void realizarMantenimiento() {
        this.kilometrosRecorridos = 0;
        System.out.println("Mantenimiento realizado");
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                ", matricula='" + matricula + '\'' +
                ", cargaActual=" + cargaActual +
                ", cargaMaxima=" + cargaMaxima +
                '}';
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public static double getCostoKilometros() {
        return costoKilometros;
    }

    public static void setCostoKilometros(double costoKilometros) {
        Furgoneta.costoKilometros = costoKilometros;
    }
}

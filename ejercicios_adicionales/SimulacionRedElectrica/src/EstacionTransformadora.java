public class EstacionTransformadora extends ComponenteDeRed implements Transmitir{
    private double voltajeSalida;

    public EstacionTransformadora(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad, double voltajeSalida) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
        this.voltajeSalida = voltajeSalida;
    }

    @Override
    public String toString() {
        return "Bateria " +
                "voltajeSalida: " + voltajeSalida +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }

    /*SIN ACABAR*/
    @Override
    public void transferirEnergiaCon(ComponenteDeRed c) {
        System.out.println();
    }
}
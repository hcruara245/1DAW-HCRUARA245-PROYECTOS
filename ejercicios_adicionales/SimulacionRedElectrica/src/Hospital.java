public class Hospital extends ConsumidorMasivo{
    private int numCamas;

    public Hospital(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad, int numCamas) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
        this.numCamas = numCamas;
    }

    @Override
    public String toString() {
        return "Bateria " +
                "numero de camas: " + numCamas +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }
}
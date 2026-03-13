public abstract class ConsumidorMasivo extends ComponenteDeRed{

    public ConsumidorMasivo(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
    }

    @Override
    public String toString() {
        return "Bateria " +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }
}
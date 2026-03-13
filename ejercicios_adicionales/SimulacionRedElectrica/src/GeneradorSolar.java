public class GeneradorSolar extends ComponenteDeRed{
    private enum TipoGenerador{
        MONOCRISTALINO,POLICRISTALINO
    }

    TipoGenerador generadorType;

    public GeneradorSolar(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad, TipoGenerador generadorType) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
        this.generadorType = generadorType;
    }

    @Override
    public String toString() {
        return "Bateria " +
                "tipo de generador: " + generadorType +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }
}

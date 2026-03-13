public class Bateria extends ComponenteDeRed{
    private boolean refriLiquida;

    public Bateria(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad, boolean refriLiquida) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
        this.refriLiquida = refriLiquida;
    }

    @Override
    public String toString() {
        return "Bateria " +
                "refriLiquida: " + refriLiquida +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }
}

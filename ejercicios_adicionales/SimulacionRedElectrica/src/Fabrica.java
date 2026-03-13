public class Fabrica extends ConsumidorMasivo{
    private String tipoIndustria;

    public Fabrica(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad, String tipoIndustria) {
        super(nombreIdentificativo, energiaAcum, tempTrabajo, desgaste, prioridad);
        if (tipoIndustria != null){
            this.tipoIndustria = tipoIndustria;
        }
        else {
            this.tipoIndustria = "N/A";
        }
    }

    @Override
    public String toString() {
        return "Bateria " +
                "tipo de industria: " + tipoIndustria +
                ", nombreIdentificativo: '" + nombreIdentificativo + '\'' +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }
}

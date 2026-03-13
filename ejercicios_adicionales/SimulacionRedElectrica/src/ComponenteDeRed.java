public abstract class ComponenteDeRed implements Comparable{
    protected String nombreIdentificativo;
    protected int energiaAcum;
    protected int tempTrabajo;
    protected int desgaste;
    protected boolean prioridad;

    public ComponenteDeRed(String nombreIdentificativo, int energiaAcum, int tempTrabajo, int desgaste, boolean prioridad) {
        if (nombreIdentificativo != null){
            this.nombreIdentificativo = nombreIdentificativo;
        }
        else {
            this.nombreIdentificativo = "N/A";
        }
        if (energiaAcum > 10000 ||energiaAcum < 0){
            this.energiaAcum = 0;
        }
        else {
            this.energiaAcum = energiaAcum;
        }
        if (tempTrabajo > 100 ||tempTrabajo < 0){
            this.tempTrabajo = 0;
        }
        else {
            this.tempTrabajo = tempTrabajo;
        }
        if (desgaste > 100 ||desgaste < 0){
            this.desgaste = 0;
        }
        else {
            this.desgaste = desgaste;
        }
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "nombreIdentificativo: " + nombreIdentificativo +
                ", energiaAcum: " + energiaAcum +
                ", tempTrabajo: " + tempTrabajo +
                ", desgaste: " + desgaste +
                ", prioridad: " + prioridad;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        ComponenteDeRed other = (ComponenteDeRed) o;

        res = this.energiaAcum - other.energiaAcum;

        return res;
    }


}
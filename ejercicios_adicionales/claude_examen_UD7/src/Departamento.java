public class Departamento {
    private String codigo;
    private String nombre;
    private String responsable;
    public Departamento(String codigo, String nombre, String responsable) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.responsable = responsable;
    }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getResponsable() { return responsable; }
    @Override
    public String toString() {
        return codigo + " - " + nombre + " (Resp: " + responsable + ")";
    }
}
import java.util.List;
public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private int aniosExperiencia;
    private List<String> proyectos; // se rellena en el Ejercicio 2e
    public Empleado(int id, String nombre, String departamento,
                    double salario, int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
    }
    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public List<String> getProyectos() { return proyectos; }
    // Setter para proyectos (necesario en Ejercicio 2e)
    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }
    @Override
    public String toString() {
        return nombre + " [" + departamento + "] - " + salario + " EUR";
    }
}

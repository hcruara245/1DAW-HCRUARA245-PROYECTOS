import java.io.Serializable;

public class Alumno implements Serializable {
    private String nombre;
    private String curso;
    private double nota;

    public Alumno(String nombre, String curso, double nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}

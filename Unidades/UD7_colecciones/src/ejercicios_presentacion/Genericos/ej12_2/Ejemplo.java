package ejercicios_presentacion.Genericos.ej12_2;

public class Ejemplo {
    private String textoejemplo;

    public Ejemplo(String textoejemplo) {
        this.textoejemplo = textoejemplo;
    }

    @Override
    public String toString() {
        return "Ejemplo{" +
                "textoejemplo='" + textoejemplo + '\'' +
                '}';
    }
}

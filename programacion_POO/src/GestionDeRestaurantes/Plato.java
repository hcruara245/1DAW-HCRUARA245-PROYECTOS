package GestionDeRestaurantes;

public class Plato {
    private String nombrePlato;
    private double precio;
    private Categoría categoria;
    private int unidad;

    public Plato(String nombrePlato, double precio, Categoría categoria, int unidad) {
        if (precio < 0 || precio > 999.99) {
            System.out.println("ERROR: PRECIO INVALIDO");
        }
        else if (unidad < 0 || unidad > 1000) {
            System.out.println("ERROR: UNIDADES INVALIDAS");
        }
        else {
            this.nombrePlato = nombrePlato;
            this.precio = precio;
            this.categoria = categoria;
            this.unidad = unidad;
        }
    }

    public Plato(String nombrePlato, double precio, int unidad) {
        this(nombrePlato,precio, Categoría.tapa,unidad);
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public int getUnidad() {
        return unidad;
    }
}

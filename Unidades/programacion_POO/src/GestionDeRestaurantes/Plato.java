package GestionDeRestaurantes;

public class Plato {
    private String nombrePlato;
    private double precio;
    private Categoría categoria;
    private int unidad;
    private static int contadorPlatos = 1;
    private int idPlato;

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
            this.idPlato = contadorPlatos;
            contadorPlatos++;
        }
    }

    public Plato(String nombrePlato, double precio, int unidad) {
        this(nombrePlato,precio, Categoría.tapa,unidad);
    }

    public void mostrarDatosPlato(){
        System.out.println("NOMBRE: " + nombrePlato);
        System.out.println("PRECIO: " + precio);
        System.out.println("CATEGORÍA: " + categoria.toString());
        System.out.println("UNIDADES: " + unidad);
        System.out.println("ID-Plato: " + idPlato);
    }

    public static int getContadorPlatos() {
        return contadorPlatos;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoría getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoría categoria) {
        this.categoria = categoria;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public static void setContadorPlatos(int contadorPlatos) {
        Plato.contadorPlatos = contadorPlatos;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }
}
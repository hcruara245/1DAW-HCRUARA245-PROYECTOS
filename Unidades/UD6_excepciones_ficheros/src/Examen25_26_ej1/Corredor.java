package Examen25_26_ej1;

public abstract class Corredor extends Participante implements Competible,Comparable {
    protected int dorsal;
    protected int minutos;
    protected Categoria categoria;
    private static int contadorDorsales;

    public Corredor(String nombre, String NIF, int edad, String nacionalidad, int minutos, Categoria categoria) {
        super(nombre, NIF, edad, nacionalidad);
        if (minutos < 0){
            this.minutos = 0;
        }
        else {
            this.minutos = minutos;
        }
        if (categoria != null) {
            this.categoria = categoria;
        }
        else {
            this.categoria = Categoria.DESCONOCIDA;
        }
        contadorDorsales++;
        dorsal = contadorDorsales;
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales = false;
        if (o instanceof Corredor) {
            Corredor corredor = (Corredor) o;
            if (this.getNIF().equals(corredor.getNIF())) {
                iguales = true;
            }
        }
        return iguales;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getMinutos() {
        return minutos;
    }

    public void mostrarGanado(){
        System.out.println("CAMPEÓN " + this.getCategoria().toString() + " : " + super.nombre + " | Tiempo: " + this.minutos + " (DORSAL: " + this.dorsal + ")");
    }

    public int getDorsal() {
        return dorsal;
    }
}

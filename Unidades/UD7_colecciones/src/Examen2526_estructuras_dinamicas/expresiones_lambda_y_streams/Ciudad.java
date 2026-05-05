package Examen2526_estructuras_dinamicas.expresiones_lambda_y_streams;

public class Ciudad {
    private String nombre;
    private String pais;
    private int habitantes;
    private boolean tienePlaya;
    private int monumentosHistoricos;
    private boolean visitado;
    private int vecesVisitado; 

    public Ciudad(String nombre, String pais, int habitantes, boolean tienePlaya, int monumentosHistoricos, boolean visitado, int vecesVisitado) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
        this.tienePlaya = tienePlaya;
        this.monumentosHistoricos = monumentosHistoricos;
        this.visitado = visitado;
        this.vecesVisitado = vecesVisitado;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public int getHabitantes() { return habitantes; }
    public void setHabitantes(int habitantes) { this.habitantes = habitantes; }

    public boolean isTienePlaya() { return tienePlaya; }
    public void setTienePlaya(boolean tienePlaya) { this.tienePlaya = tienePlaya; }

    public int getMonumentosHistoricos() { return monumentosHistoricos; }
    public void setMonumentosHistoricos(int monumentosHistoricos) { this.monumentosHistoricos = monumentosHistoricos; }

    public boolean isVisitado() { return visitado; }
    public void setVisitado(boolean visitado) { this.visitado = visitado; }

    public int getVecesVisitado() { return vecesVisitado; }
    public void setVecesVisitado(int vecesVisitado) { this.vecesVisitado = vecesVisitado; }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", habitantes=" + habitantes +
                ", tienePlaya=" + tienePlaya +
                ", monumentos=" + monumentosHistoricos +
                ", visitado=" + visitado +
                ", vecesVisitado=" + vecesVisitado +
                '}';
    }
}
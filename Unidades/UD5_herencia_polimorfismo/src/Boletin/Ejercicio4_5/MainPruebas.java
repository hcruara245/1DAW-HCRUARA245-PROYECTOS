package Boletin.Ejercicio4_5;

public class MainPruebas {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        p1.add(Notas.Do);
        p1.add(Notas.Re);
        p1.add(Notas.Mi);
        p1.add(Notas.Fa);
        p1.add(Notas.Sol);
        p1.add(Notas.La);
        p1.add(Notas.Si);
        p1.add(Notas.DoAgudo);
        p1.interpretar();
    }
}

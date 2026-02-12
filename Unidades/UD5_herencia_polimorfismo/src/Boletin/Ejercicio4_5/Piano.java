package Boletin.Ejercicio4_5;

public class Piano extends Instrumento{
    @Override
    public void interpretar() {
        for (int i = 0; i < super.notasMusicales.length ; i++){
            System.out.println(super.notasMusicales[i]);
        }
    }
}

package Boletin.Ejercicio1y2;

public class Hora {
    protected int hora;
    protected int min;

    public Hora(int hora, int minuto){
        if (hora >= 24 || hora < 0){
            this.hora = 0;
        }
        else if (minuto >= 60 || minuto < 0){
            this.min = 0;
        }
        else {
            this.hora = hora;
            this.min = minuto;
        }
    }

    void inc(){
        this.min++;
        if (this.min >= 60){
            this.hora++;
        }
        if (this.hora >= 24){
            this.hora = 0;
        }
    }

    boolean setMinutos(int minutos){
        boolean resultado = false;

        if (minutos < 60 && minutos >= 0){
            resultado = true;
            this.min = minutos;
        }
        else {
            System.out.println("Parametro no correcto");
        }

        return resultado;
    }

    boolean setHora(int hora){
        boolean resultado = false;

        if (hora < 24 && hora >= 0){
            resultado = true;
            this.hora = hora;
        }
        else {
            System.out.println("Parametro no correcto");
        }

        return resultado;
    }

    @Override
    public String toString(){
        String resultado = hora + ":" + min;
        return resultado;
    }
}

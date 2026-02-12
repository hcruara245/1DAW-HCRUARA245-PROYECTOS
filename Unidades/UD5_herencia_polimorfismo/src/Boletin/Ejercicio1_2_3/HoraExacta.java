package Boletin.Ejercicio1_2_3;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    void setSegundos(int seg){
        if (seg >= 60 || seg < 0){
            System.out.println("Parametro incorrecto");
        }
        else {
            this.segundos = seg;
        }
    }

    public void inc(){
        this.segundos++;
        if (this.segundos >= 60){
            this.segundos = 0;
            super.min++;
            if (super.min >= 60){
                super.min = 0;
                super.hora++;
                if (super.hora >= 24){
                    super.hora = 0;
                }
            }
        }
    }

    public  void comprobarHoras(int hora,int min, int seg){
        if (super.hora == hora && super.min == min && this.segundos == seg){
            System.out.println("SON IGUALES");
        }
        else {
            System.out.println("NO SON IGUALES");
        }
    }
}

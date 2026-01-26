package CalculadoraTiempoRestanteRecreo;

import java.time.LocalTime;

public class CalcularHoraRestante {
    public static void main(String[] args) {
        LocalTime horaAct = LocalTime.now();
        LocalTime horaRecreo = LocalTime.of(11,30, 33);
        int diffMinutos = 0;
        if(horaRecreo.getMinute() <  horaAct.getMinute()){
            diffMinutos = -1 * (horaRecreo.getMinute() - horaAct.getMinute());
        }
        else {
            diffMinutos = (horaRecreo.getMinute() - horaAct.getMinute());
        }
        int diffHoras = (horaRecreo.getHour() - horaAct.getHour());
        int diffSegs = horaAct.getSecond();
        if (diffSegs < 0 || diffMinutos < 0 || diffHoras < 0){
            System.out.println("QUEDAN " + (diffHoras + 24) + " HORAS, " + diffMinutos + " MINUTOS Y " + diffSegs + " SEGUNDOS");
        }
        else{
            System.out.println("QUEDAN " + diffHoras + " HORAS, " + diffMinutos + " MINUTOS Y " + diffSegs + " SEGUNDOS");
        }
    }
}

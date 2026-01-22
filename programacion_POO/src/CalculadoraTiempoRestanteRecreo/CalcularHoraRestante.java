package CalculadoraTiempoRestanteRecreo;

import java.time.LocalTime;

public class CalcularHoraRestante {
    public static void main(String[] args) {
        LocalTime horaAct = LocalTime.now();
        LocalTime horaRecreo = LocalTime.of(11,30);
        System.out.println("Quedan " + (horaRecreo.getHour() - horaAct.getHour()) + "horas y " + (horaRecreo.getMinute() - horaAct.getMinute()));
    }
}

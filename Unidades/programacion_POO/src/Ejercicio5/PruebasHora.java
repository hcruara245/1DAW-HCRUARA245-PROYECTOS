package Ejercicio5;

import java.util.Scanner;

public class PruebasHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime solo la hora: ");
        int hora = sc.nextInt();
        System.out.println("Dime los minutos: ");
        int minuto = sc.nextInt();
        System.out.println("Dime los segundos: ");
        int segundo = sc.nextInt();
        System.out.println("Dime los segundos a incrementar: ");
        int segundos_a_incrementar = sc.nextInt();
        Hora h1 = new Hora(hora, minuto, segundo);
        h1.incrementar_segundos(segundos_a_incrementar);
    }
}

package aumento_tiempo;

import java.util.Scanner;

public class Aumento_tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduzca horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduzca minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduzca segundos: ");
        int segundos = sc.nextInt();

        System.out.print("Introduzca segundos a incrementar: ");
        int incremento = sc.nextInt();

        System.out.println("Aumentando la hora...");

        
        for (int i = 0; i < incremento; i++) {
           
            segundos++;

            
            if (segundos == 60) {
                segundos = 0;
                minutos++;

                
                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                   
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            
            System.out.println( horas + ":" + minutos +":" + segundos);
        }
    }
}

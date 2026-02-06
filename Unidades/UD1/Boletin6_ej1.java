package adivina_el_numero;

import java.util.Scanner;

public class Boletin6_ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int segundos = 0;
        
        System.out.println("Dime una cantidad de segundos");
        segundos = sc.nextInt();
        
        System.out.println("La cantidad de segundos es: " +(segundos));
        System.out.println("La cantidad de minutos: " +(segundos / 60));
        System.out.println("La cantidad de horas: " +(segundos /3600));
        
    }
    
}

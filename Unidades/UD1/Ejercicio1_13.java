package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_13 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trimestreUno = 0;
        double trimestreDos = 0;
        double trimestreTres = 0;
        double nota_mediaExpediente = 0;
        
        
            System.out.println("Dime la nota del primer trimestre");
            trimestreUno = sc.nextInt();
            System.out.println("Dime la nota del segundo trimestre");
            trimestreDos = sc.nextInt();
            System.out.println("Dime la nota del tercer trimestre");
            trimestreTres = sc.nextInt();
                nota_mediaExpediente = (trimestreUno + trimestreDos + trimestreTres)/3;
                System.out.println("Tu nota en el expediente es:" + nota_mediaExpediente);
                int nota_mediaBoletin = (int) nota_mediaExpediente;
                System.out.println("Tu nota en el boletin es:" + nota_mediaBoletin);
            
    }
    
}
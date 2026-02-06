package adivina_el_numero;

import java.util.Scanner;

public class Bucle_anidados_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        
        System.out.println("Cuantas equis quieres poner");
        n = sc.nextInt();
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

       
    }
    
}

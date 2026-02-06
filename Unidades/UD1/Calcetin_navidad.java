package adivina_el_numero;

import java.util.Scanner;

public class Calcetin_navidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura (minimo 2): ");
        int altura = sc.nextInt();

        if (altura < 2) {
            System.out.println("La altura minima es 2.");
        }
        else{     
            for (int fila = 1; fila <= altura; fila++) {
                if (fila > altura - 2) {
                    for (int col = 1; col <= 6; col++) {
                        System.out.print("*");
                    }
                    System.out.print("  "); 
                    for (int col = 1; col <= 6; col++) {
                        System.out.print("*");
                    }
                } else {

                    for (int col = 1; col <= 3; col++) {
                        System.out.print("*");
                    }
                    System.out.print("     ");
                    for (int col = 1; col <= 3; col++) {
                        System.out.print("*");
                    }
                }
                System.out.println(); 
            }
        }
    }
}

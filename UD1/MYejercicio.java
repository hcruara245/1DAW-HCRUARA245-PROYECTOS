package quienNoPinteMYEsHomosexual;

import java.util.Scanner;

public class QuienNoPinteMYEsHomosexual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura de las letras: ");
        int altura = sc.nextInt();
        
        sc.close();
        
        System.out.println("Letras M Y:");
        for (int i = 0; i < altura; i++) {
            // Imprimir letra M
            for (int j = 0; j < altura; j++) {
                // Columnas externas o diagonales de la M
                if (j == 0 || j == altura - 1 || 
                   (i == j && i < altura / 2) || 
                   (i + j == altura - 1 && i < altura / 2) ||
                   (i == altura / 2 && j == altura / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Espacio entre M y Y
            System.out.print(" ");
            
            // Imprimir letra Y
            for (int j = 0; j < altura; j++) {
                // Parte superior: diagonales que convergen
                if (i < altura / 2) {
                    if (j == i || j == altura - 1 - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Parte inferior: línea vertical central
                else {
                    if (j == altura / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}
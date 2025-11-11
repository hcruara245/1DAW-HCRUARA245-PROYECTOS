package practica_2425_ej3;

import java.util.Scanner;

public class Practica_2425_ej3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Porfavor, introduce la altura: ");
        int altura = sc.nextInt();
        
        while(altura < 3 || altura % 2 == 0){
            System.out.print("Porfavor, introduce la altura(Debe ser 3 como minimo e impar): ");
            altura = sc.nextInt();
        }
        
        int mitad = altura / 2;
        
        for (int fila = 0; fila < altura; fila++) {
            for (int col = 0; col < altura; col++) {
                if ( ((fila <= mitad) && (col >= fila) && (col <= (altura - 1) - fila)) || ((fila > mitad) && (col >= (altura - 1) - fila) && (col <= fila)) ) {
                            System.out.print("*");
                        } 
                        else {
                            System.out.print(" "); 
                        }
            }
            System.out.println();
        }
    }
    
}

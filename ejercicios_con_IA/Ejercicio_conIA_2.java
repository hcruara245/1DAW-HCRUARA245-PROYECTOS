package ejercicio_conia_2;

import java.util.Scanner;

public class Ejercicio_conIA_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura = 0;
        
        do{
            System.out.print("Dime la altua del rombo: ");
            altura = sc.nextInt();
        }
        while(altura <= 2 || altura % 2 == 0);
        
        int mitad = altura / 2;
        
        for(int fila = 0;fila <= mitad;fila++){
            for(int espacios = 0;espacios < mitad - fila;espacios++){
                System.out.print(" ");
            }
            for(int asteriscos = 0; asteriscos < (fila * 2) + 1;asteriscos++){
            System.out.print("*");
            }
            System.out.println();
        }
        for (int fila = mitad - 1; fila >= 0; fila--) {
            for(int espacios = 0;espacios < mitad - fila;espacios++){
                System.out.print(" ");
            }
            for(int asteriscos = 0;asteriscos < (fila * 2) + 1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

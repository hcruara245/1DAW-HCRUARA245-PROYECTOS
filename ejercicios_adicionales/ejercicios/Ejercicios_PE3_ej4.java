package ejercicio1_11;

import java.util.Scanner;

public class Ejercicios_PE3_ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Dime un numero, tiene que ser impar mayor o igual que 3: ");
        int altura = sc.nextInt();
        while(altura < 3 || altura % 2 == 0){
            System.out.print("Dime un numero, tiene que ser impar mayor o igual que 3: ");
            altura = sc.nextInt();
        }  
        int mitad = altura / 2;
        for (int filas = 0; filas <= mitad; filas++) {
            for(int espacios = 0;espacios < mitad - filas;espacios++){
                System.out.print(" "); 
            }
            System.out.print("*     *");
            System.out.println();
        }
        for(int filas = 0; filas < mitad;filas++){
            for(int espacios = 0;espacios < filas + 1 + filas;espacios++){
                System.out.print(" ");
            }
            System.out.print("*     *");
            System.out.println();
        }  
    }
}
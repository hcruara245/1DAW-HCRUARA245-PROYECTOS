package ejercicio_conia_2;

import java.util.Scanner;

public class rombo_hueco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura = 0;
        
        do{
            System.out.print("Dime la altura: ");
            altura = sc.nextInt();
        }
        while(altura % 2 == 0 || altura < 3);
        
        int mitad = altura / 2;
        
        for(int filas = 0;filas <= mitad;filas++){
            for(int espacios = 0;espacios < mitad - filas;espacios++){
                System.out.print(" ");
            }
            for(int asteriscos = 0;asteriscos < filas * 2 + 1;asteriscos++){
                if(asteriscos < 1 || asteriscos == filas * 2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int filas = mitad - 1;filas >= 0;filas--){
            for(int espacios = 0;espacios < mitad - filas;espacios++){
                System.out.print(" ");
            }
            for(int asteriscos = 0;asteriscos < filas * 2 + 1;asteriscos++){      
                if(asteriscos < 1 || asteriscos == filas * 2){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

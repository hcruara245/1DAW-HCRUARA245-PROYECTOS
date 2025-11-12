package ejercicio3_pe2;

import java.util.Scanner;

public class Ejercicio3_PE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        System.out.print("Dime el salto (0, 1 o 2): ");
        int salto = sc.nextInt();
        
        while(salto < 0 || salto > 2){
            System.out.print("Introduce el salto de nuevo: ");
            salto = sc.nextInt();
        }
        
        switch(salto){
            case 0:
                System.out.println("El resultado es: " +num);
            case 1:
                
            case 2:
        }
    }
    
}

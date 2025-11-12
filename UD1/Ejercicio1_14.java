package ejercicio1_14;

import java.util.Scanner;

public class Ejercicio1_14 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float numero = 0;
            
                System.out.println("Dime el numero");
                numero = sc.nextFloat();
                int redondeado = Math.round(numero);
                System.out.println("El numero redondeado es: " + redondeado);
        
            
            
    }
    
}
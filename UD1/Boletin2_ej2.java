package boletin2_ej2;

import java.util.Scanner;

public class Boletin2_ej2 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println("Dime un numero");
        numero = sc.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("No es par");
        }
        
    }
    
}

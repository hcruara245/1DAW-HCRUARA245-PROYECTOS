package adivina_el_numero;

import java.util.Scanner;

public class Boletin2_ej1 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int edad = 0;
        
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        
        if(edad > 18 && edad < 25){
            System.out.println("Eres apto");
        }
        else{
            System.out.println("No eres apto");
        }
        
    }
    
}

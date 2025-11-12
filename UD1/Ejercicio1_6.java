package ejercicio1_6;

import java.util.Scanner;

    public class Ejercicio1_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        float nota1 = 0;
        float nota2 = 0;
        
        
        System.out.println("Dime la primera nota");
        nota1 = sc.nextFloat();
        System.out.println("Dime la segunda nota");
        nota2 = sc.nextFloat(); 
        System.out.println("La media es:");
        System.out.println((nota1+nota2)/2);
        
        
    }
    
}
package adivina_el_numero;

import java.util.Scanner;

public class Ejercicioo1_12 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numeroNegativo = 0;
            double numeroPositivo = 0;

            System.out.println("Dime un numero negativo"); 
            numeroNegativo = sc.nextInt();
            System.out.println("Dime un numero cualquiera"); 
            numeroPositivo = sc.nextDouble();
            
                int valorAbsolutoInt = Math.abs(numeroNegativo);
                System.out.println("El valor absoluto de " + numeroNegativo + " es: " + valorAbsolutoInt); 

     
                double valorAbsolutoDouble = Math.abs(numeroPositivo);
                System.out.println("El valor absoluto de " + numeroPositivo + " es: " + valorAbsolutoDouble); 
  
    }
    
}
package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_18 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero = 0;
            
                  do {
                    System.out.println("Ingresa un numero par: ");
                    numero = sc.nextInt();

           
                     if (numero % 2 != 0) {
                        System.out.println("No es par, prueba otra vez.");
                       }

                  } 
                    while (numero % 2 != 0); 
                    System.out.println("Tu numero par escogido es: " + numero);
        
                
            
    }
    
}
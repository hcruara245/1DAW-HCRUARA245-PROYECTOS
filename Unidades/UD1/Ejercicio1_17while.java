package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_17while {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero = 0;
            
                  while(true){
                      System.out.println("Introduce un numero par");
                      numero = sc.nextInt();
                      
                      if(numero % 2 == 0){
                          System.out.println("El numero par introducido es:" + numero);
                          break;
                      }
                      else{
                          System.out.println("El numero no es par, vuelve a probar ");
                      }
                  }
        
                
            
    }
    
}
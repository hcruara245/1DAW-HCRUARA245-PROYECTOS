package boletin5_ej8;

import java.util.Scanner;

public class Boletin5_ej8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int contador = 0;
        int numero = 0;
        
        System.out.println("Dime un numero positivo");
        numero = sc.nextInt();
        
        while(numero>=0){
        System.out.println("Dime un numero positivo");
        numero = sc.nextInt();
        contador++;
        }
       
        System.out.println("La cantidad de numeros es: " +contador);
    }
    
}

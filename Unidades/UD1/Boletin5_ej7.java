package adivina_el_numero;

import java.util.Scanner;
public class Boletin5_ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int suma = 0;
        int contador = 0;
        int numero = 0;
        
        
        
        while(numero>=0){
        System.out.println("Dime un numero positivo");
        numero = sc.nextInt();
        suma = numero + suma;
        contador++;
        }
       
        System.out.println("La suma es: " +suma);
        
    }
    
}

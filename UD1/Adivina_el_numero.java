package adivina_el_numero;

import java.util.Scanner;

    public class Adivina_el_numero {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = (int)(Math.random() * 50) + 1;
        int intento = Integer.MIN_VALUE;
        int cantidadIntentos = 0;
       
        System.out.println(numero);
        
        System.out.println("Intenta adivinar el numero");
        intento = sc.nextInt();
        cantidadIntentos++;
        
        
        while(numero != intento){
        
        if(cantidadIntentos >= 6){
            System.out.println("Has perdido pringado");
            break;
        }    
            
            
        if(intento < numero){
                System.out.println("El numero es mas alto");
                cantidadIntentos++;
                intento = sc.nextInt();
            }
        else if(intento > numero){
                System.out.println("El numero es mas bajo");
                cantidadIntentos++;
                intento = sc.nextInt();
            }
        }
        
        if(intento == numero){
                System.out.println("Has ganado felicidades");
        }
    }
    
}
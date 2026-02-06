package aumento_tiempo;

import java.util.Scanner;

public class Eliminar_nueve_cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long numero = 0;
        
        do{
            System.out.print("Introduce un numero: ");
            numero = sc.nextLong();
        } 
        while(numero < 0);
        
        int nuevoNum = 0;
        int contador = 0;
        int posicion = 1;
        
        while(numero > 0){
            long digito = numero % 10;
            numero = numero / 10;
            
            if (digito == 9 || digito == 4){
                contador++;
            }
            else{
                nuevoNum += digito * posicion;
                posicion *= 10;
            }
        }
        
        System.out.println("Tu numero final es: " +nuevoNum);
        System.out.println("Has quitado " +contador +" numeros");
        
    }
    
}

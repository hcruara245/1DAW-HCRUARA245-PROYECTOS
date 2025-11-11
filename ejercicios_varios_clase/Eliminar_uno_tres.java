package eliminar_uno_tres;

import java.util.Scanner;

public class Eliminar_uno_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long numero = 0;
        
        do{
            System.out.print("Dime un numero: ");
            numero = sc.nextLong();
        }
        while(numero <= 0);
        
        long nuevoNum = 0;
        int contador = 0;
        int posicion = 1;
        
        while(numero > 0){
            long digito = numero % 10;
            numero /= 10;
            
            if(digito == 1 || digito == 3){
                contador++;
            }
            
            else{
                nuevoNum += posicion * digito;
                posicion *= 10;
            }
        }
            System.out.println("Has eliminado " + contador +" numeros");
            System.out.println("Tu numero final es: " + nuevoNum);
    }
    
}

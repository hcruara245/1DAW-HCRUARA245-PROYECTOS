package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_21{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
            int cantidad = 0;
            int sumaImp = 0;
            int cantidadImp = 0;
            int mayorPar = Integer.MIN_VALUE;
        
        
                while(true){
                    System.out.print("introduce un negativo para acabar: ");
                    int numero = sc.nextInt();
                    
                    if(numero < 0){
                        cantidad++;
                        break;
                    }
                    
                    cantidad++;
                    
                    if(numero % 2 == 0){
                        if(numero > mayorPar){
                            mayorPar = numero;
                        }
                    }
                    else{
                        sumaImp += numero;
                        cantidadImp++;
                    }
                }
                
                System.out.println("Se han introducido " + cantidad + " numeros.");

                if (cantidadImp > 0) {
                    double mediaImpares = (double) sumaImp / cantidadImp;
                    System.out.println("La media de los impares es: " + mediaImpares);
                } 
                
                else {
                    System.out.println("No has puesto ningun impar");
                }

                
                if (mayorPar != Integer.MIN_VALUE) {
                    System.out.println("El mayor de los pares es: " + mayorPar);
                } 
                else {
                    System.out.println("No has puesto ningun par");
                }

            
    }
    
}
package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_19{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero1 = 0;
            int numero2 = 0;
            int numero3 = 0;
            int numero4 = 0;
            int numero5 = 0;
            int total_suma = 0;
            int numPar = 0;
            int numNeg = 0;
            
            
            
                System.out.print("Dime el numero 1:");
                numero1 = sc.nextInt();
                System.out.print("Dime el numero 2:");
                numero2 = sc.nextInt();
                System.out.print("Dime el numero 3:");
                numero3 = sc.nextInt();
                System.out.print("Dime el numero 4:");
                numero4 = sc.nextInt();
                System.out.print("Dime el numero 5:");
                numero5 = sc.nextInt();
                
                total_suma = numero1 + numero2 + numero3 + numero4 + numero5;
                System.out.println("El total es: " + total_suma);
                
                if(numero1 % 2 == 0){
                    numPar++;
                }
                if (numero2 % 2 == 0){
                    numPar++;
                } 
                if (numero3 % 2 == 0){
                    numPar++;
                } 
                if (numero4 % 2 == 0){
                    numPar++;
                } 
                if (numero5 % 2 == 0){
                    numPar++;
                }
                
                System.out.println("La cantidad de numeros pares es: " + numPar);
                
                if(numero1 < 0){
                    numNeg++;
                }
                if(numero2 < 0){
                    numNeg++;
                }
                if(numero3 < 0){
                    numNeg++;
                }
                if(numero4 < 0){
                    numNeg++;
                }
                if(numero5 < 0){
                    numNeg++;
                }
                
                System.out.println("La cantidad de numeros negativos es: " +numNeg);
                
                int mayor = numero1;
                int menor = numero1;
                
                if(numero2 > mayor){
                    mayor = numero2;
                }
                if(numero3 > mayor){
                    mayor = numero3;
                }
                if(numero4 > mayor){
                    mayor = numero4;
                }
                if(numero5 > mayor){
                    mayor = numero5;
                }
                
                
                if(numero2 < menor){
                    menor = numero2;
                }
                if(numero3 < menor){
                    menor = numero3;
                }
                if(numero4 < menor){
                    menor = numero4;
                }
                if(numero5 < menor){
                    menor = numero5;
                }
                
                System.out.println("El numero mayor es: " + mayor);
                System.out.println("El numero menor es: " + menor);
    }
    
}
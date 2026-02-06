package adivina_el_numero;

import java.util.Scanner;

public class Loteria_navidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cual es tu primer numero favorito?: ");
        int num1 = sc.nextInt();
        System.out.print("Cual es tu segundo numero favorito?: ");
        int num2 = sc.nextInt();
        System.out.print("Cual es tu tercer numero favorito?: ");
        int num3 = sc.nextInt();
        
        System.out.println("Tus numeros escogidos son: " + num1 +"," + num2 +"," + num3);
        
        System.out.print("Dime el numero del cupon de la loteria: ");
        int numLoteria = sc.nextInt();
        
        int contadorSuerte = 0;
        int contadorMalaSuerte = 0;
        
         while (numLoteria > 0) {
            int digito = numLoteria % 10;  
            numLoteria /= 10;              
            
            if ( digito == num1 || digito == num2 || digito == num3){
                contadorSuerte++;
            }
            else{
                contadorMalaSuerte++;
            }
        }
        if(contadorSuerte > contadorMalaSuerte){
            System.out.println("Te va a dar buena suerte");
        }
        else{
            System.out.println("Te va a dar mala suerte");
        }
    }
    
}

package adivina_el_numero;

import java.util.Scanner;


    public class Ejercicio1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int edad = 0;
        
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        if(edad>=18){
            System.out.println("eres mayor de edad");
        }
        else{
            System.out.println("eres menor de edad");
        }
    }
    
}
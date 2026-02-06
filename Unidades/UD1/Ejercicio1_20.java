package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_20{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero");
            int numero = sc.nextInt();
            
            boolean primo = true;
            
            if(numero <= 1){
                primo = false;
            }
            else{
                for(int i = 2; i <= numero / 2; i++){
                    if(numero % i == 0){
                        primo = false;
                        break;
                    }
                }
            }
            
            if (primo) {
            System.out.println(numero + " es un numero primo");
            } 
            else {
            System.out.println(numero + " no es un numero primo");
        }
    }
    
}
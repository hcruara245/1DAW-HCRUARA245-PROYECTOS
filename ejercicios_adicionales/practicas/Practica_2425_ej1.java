package practica_2425_ej1;

import java.util.Scanner;

public class Practica_2425_ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Porfavor dime un numero");
        long num1 = sc.nextInt();
        System.out.println("Porfavor dime otro numero");
        long num2 = sc.nextInt();
        
        long digitos_pares = 0;
        long digitos_impares = 0;
        
        long potencia = 1;
        long temporal = num1;
        
        while (potencia <= temporal / 10) {            
            potencia *= 10;
        }
        
        while (potencia > 0) {            
            long dig1 = num1 / potencia;
            long dig2 = num2 / potencia;
            
            if (dig1 % 2 == 0) {
                digitos_pares = digitos_pares * 10 + dig1;
            }
            else{
                digitos_impares = digitos_impares * 10 + dig1;
            }
            
            if (dig2 % 2 == 0) {
                digitos_pares = digitos_pares * 10 + dig2;
            }
            else{
                digitos_impares = digitos_impares * 10 + dig2;
            }
            
            num1 %= potencia;
            num2 %= potencia;
            
            potencia /= 10;
        }
        System.out.println("el numero que forman los pares es: " + digitos_pares);
        System.out.println("el numero que forman los imparres es: " + digitos_impares);
    }
}
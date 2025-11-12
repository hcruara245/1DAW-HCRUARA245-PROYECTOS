package ejercicio_3_pe2;

import java.util.Scanner;

public class Ejercicio_3_PE2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero positivo");
        int num = sc.nextInt();
        int digito = 0;
        int numfin = 0;
        int pos = 1;
        System.out.println("Introduce el salto");
        int salto = sc.nextInt();
        salto = salto+1;
        if (salto >= 0 && salto <= 3) {
            double salt = Math.pow(10, salto);
            while ( num > 0) {
                digito = num % 10;  
                num /= salt;
                numfin += digito * pos;
                pos *= 10; 
            }
        }
        System.out.println(numfin);
    }   
}

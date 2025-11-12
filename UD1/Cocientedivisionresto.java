package cocientedivisionresto;

import java.util.Scanner;

    public class Cocientedivisionresto {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1 = 0;
        int num2 = 0;
        float cociente = 0;
        int resto = 0;
        
        System.out.println("Dime el primer numero");
        num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        num2 = sc.nextInt();
        
       cociente = num1/num2;
       resto = num1 % num2;
       
       System.out.println("El cociente es:");
       System.out.println(cociente);
       System.out.println("El resto es:");
       System.out.println(resto); 
    }
    
}
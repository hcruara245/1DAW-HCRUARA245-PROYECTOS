package boletin5_ej10;

import java.util.Scanner;

public class Boletin5_ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Dime un numero");
        num = sc.nextInt();
        
        while(num != 0){
            if(num % 2 == 0){
                System.out.println("Es par");
            }
            else{
                System.out.println("Es impar");
            }
            System.out.println("Dime un numero");
            num = sc.nextInt();
        }
        
        
    }
    
}

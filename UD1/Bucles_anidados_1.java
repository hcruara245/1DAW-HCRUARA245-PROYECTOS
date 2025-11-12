package bucles_anidados_1;

import java.util.Scanner;

public class Bucles_anidados_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println("Dime un numero que no sea negativo");
        numero = sc.nextInt();
        
        if( numero > 0 ){
            for(int i = numero; i >=1; i--){
                for(int j = 1;j <= i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
        
        
        else{
            System.out.println("Tu numero es negativo");
        }
    }
    
}

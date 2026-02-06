package ud2_boletin1;

import java.util.Scanner;

public class UD2_boletin1_7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        boolean numPrimo = esPrimo(num);
        if(numPrimo){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
    
    public static boolean esPrimo(int a){
            if(a <= 1){
                return false;
            }
            else if(a == 2){
                return false;
            }
            for(int i = 2; i < a; i++) {
                if (a % i == 0) {
                return false;
            }
                else{
                    return true;
            }
        }
            return false;
    }
}

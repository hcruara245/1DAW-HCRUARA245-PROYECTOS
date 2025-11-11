package ejercicio_conia_1;

import java.util.Scanner;

public class Ejercicio_conIA_1_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int altura = sc.nextInt();
        
        for(int i = 0; i <= altura; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

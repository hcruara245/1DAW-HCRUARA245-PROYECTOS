package bucle_anidados_3;

import java.util.Scanner;

public class Bucle_anidados_3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        System.out.println("Cuantos asteriscos quieres poner");
        num = sc.nextInt();
        
        for(int i = 0;i <= num;i++){
            for(int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}

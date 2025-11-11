package ejercicio_conia_2;

import java.util.Scanner;

public class ajedrez_ejercicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        
        for (int filas = 0; filas < num; filas++) {
            for(int col = 0; col < num; col++){
                if((col + filas) % 2 == 0){
                    System.out.print("[]");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

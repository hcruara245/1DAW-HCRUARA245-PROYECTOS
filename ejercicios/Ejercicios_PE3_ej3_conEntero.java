package ejercicios_pe3;

import java.util.Scanner;


public class Ejercicios_PE3_ej3_conEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        int numBinario = 0;
        
        while(num != 0){
            numBinario += num % 2;
            numBinario *= 10;
            num /= 2;
        }
        
        System.out.println("El numero en binario es: " + numBinario);
    }
}
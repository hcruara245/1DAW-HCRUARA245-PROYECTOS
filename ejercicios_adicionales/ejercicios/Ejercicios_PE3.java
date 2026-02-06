package ejercicio1_11;

import java.util.Scanner;

public class Ejercicios_PE3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        String numBinario = "";
        
        while(num != 0){
            numBinario = num % 2 + numBinario;
            num /= 2;
        }
        
        System.out.println("El numero en binario es: " + numBinario);
    }
    
}
package elevarnumeros;

import java.util.Scanner;

    public class Elevarnumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
        System.out.println("Dime un numero");
        numero = sc.nextInt();
        System.out.println(numero);
        System.out.println(numero*numero);
        System.out.println(numero*numero*numero);
        
    }
    
}
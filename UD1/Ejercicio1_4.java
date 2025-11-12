package ejercicio1_4;

import java.util.Scanner;

    public class Ejercicio1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int anyoactual = 0;
        int anyonacimiento = 0;
        
        System.out.println("introduce el anyo actual");
        anyoactual = sc.nextInt();
        System.out.println("introduce el anyo de nacimiento");
        anyonacimiento = sc.nextInt();
        
        System.out.println("Tu edad es:");
        System.out.println(anyoactual - anyonacimiento);
    }
    
}

package adivina_el_numero;

import java.util.Scanner;


    public class Dobleytriple {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
            System.out.println("Dime el numero que quieras");
            numero = sc.nextInt();
            System.out.println("El doble es: ");
            numero = 2*numero;
            System.out.println(numero);
            System.out.println("El triple del anterior es");
            numero = 3*numero;
            System.out.println(numero);
    }
    
}

package mostrarvalorelevado;

import java.util.Scanner;

    public class MostrarValorElevado {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println("dime un numero");
        numero = sc.nextInt();
        System.out.println("el numero es:");
        System.out.println(numero);
        System.out.println("el numero mas 1 es:");
        System.out.println(numero + 1);
        System.out.println("el numero mas 2 es:");
        System.out.println(numero + 2); 
    }
    
}
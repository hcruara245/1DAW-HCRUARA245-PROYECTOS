package ejercicio_conia_1;

import java.util.Scanner;

public class Ejercicio_conIA_1_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int suma = 0;
        int num = 0;
        
        do{
            System.out.print("Dime un numero: ");
            num = sc.nextInt();
            contador++;
            suma = num + suma;
        }
        while(num != 0);
        
        contador--;
        double media = suma / contador;
        System.out.println("La media es: " + media);
    }
}

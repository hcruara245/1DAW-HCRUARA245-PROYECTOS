package ejercicio_conia_1;

import java.util.Scanner;

public class Ejercicio_conIA_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("Es positivo");
        }
        else if (num < 0){
            System.out.println("Es negativo");
        }
        else{
            System.out.println("Es cero");
        }
    }
    
}

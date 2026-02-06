package ejercicio_conia_2;

import java.util.Scanner;

public class ejercicio_conIA_1_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero de varios digitos: ");
        int num = sc.nextInt();
        int suma = 0;
        
        while(num > 0){
            int digito = num % 10;
            suma = suma + digito;
            num /= 10;
        }
        System.out.println("El total de los digitos es: " + suma);
    }
}

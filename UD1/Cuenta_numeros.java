package cuenta_numeros;

import java.util.Scanner;

public class Cuenta_numeros{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int total = 0;
            int suma = 0;
            
            for (int i = 1;i <= 30;i++){
                if(i % 2 != 0){
                }
                else if(i<10 || i>20){
                System.out.print(i + ",");
                total++;
                suma = i + suma;
                }
            }
            
            System.out.println("hay un total de: " + total + " numeros");
            System.out.println("La suma de todos ellos es: " + suma);
            
            
            
    }
    
}
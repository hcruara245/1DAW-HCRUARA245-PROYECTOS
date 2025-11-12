package boletin5_ej1;
import java.util.Scanner;


public class Boletin5_ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            
            int num = 0;
            
            System.out.println("Dime un numero positivo que quieras");
            num = sc.nextInt();
            
            
            
            for(int i = 0; i <= num; i++){
            
                System.out.print(i +",");
            
            }
            
            
            
    }
    
}

package ud2_boletin1;

import java.util.Scanner;

public class UD2_boletin1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int a = sc.nextInt();
        eco(a);
    }
    
    public static void eco(int a){
        for(int i = 1;i<=a;i++){
            System.out.println("eco");
        }
    }
}

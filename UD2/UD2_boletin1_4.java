package ud2_boletin1_4;

import java.util.Scanner;

public class UD2_boletin1_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int a = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int b = sc.nextInt();
        mayor(a, b);
    }
    public static void mayor(int a, int b){
        if(a > b){
            System.out.println(a +" es mayor que " +b);
        }
        else{
            System.out.println(b +" es mayor que " +a);
        }
    }
}

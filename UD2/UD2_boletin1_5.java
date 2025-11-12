package ud2_boletin1_5;

import java.util.Scanner;

public class UD2_boletin1_5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int a = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int b = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int c = sc.nextInt();
        mayor(a, b, c);
    }
    
    public static void mayor(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a + " es mayor que " + b + " y " + c);
        }
        else if(b > a && b > c){
            System.out.println(b + " es mayor que " + a + " y " + c);
        }
        else if(c > a && c > b){
            System.out.println(c + " es mayor que " + a + " y " + b);
        }
    
    }
}

package ud2_boletin1;

import java.util.Scanner;

public class UD2_boletin12 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int a = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int b = sc.nextInt();
        enteros(a, b);
    }
    
    public static void enteros(int a, int b){
        for(int i = a; i <= b ; i++){
            System.out.println(i);
        }
    }
}

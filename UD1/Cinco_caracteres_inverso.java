package cinco_caracteres_inverso;

import java.util.Scanner;

    public class Cinco_caracteres_inverso {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Dime el primer caracter");
        char char1 = sc.next().charAt(0);
        System.out.println("Dime el segundo caracter");
        char char2 = sc.next().charAt(0);
        System.out.println("Dime el tercer caracter");
        char char3 = sc.next().charAt(0);
        System.out.println("Dime el cuarto caracter");
        char char4 = sc.next().charAt(0);
        System.out.println("Dime el quinto caracter");
        char char5 = sc.next().charAt(0);
        
        System.out.println("Tus caracteres en orden inverso son:");
        
        System.out.println(char5);
        System.out.println(char4);
        System.out.println(char3);
        System.out.println(char2);
        System.out.println(char1);
    }
    
}
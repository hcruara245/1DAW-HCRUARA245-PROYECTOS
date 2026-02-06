package ejercicios_presentacion;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase 1");
        String frase1 = sc.nextLine();
        System.out.println("Dime la frase 2");
        String frase2 = sc.nextLine();
        
        int longitudFrase1 = frase1.length();
        int longitudFrase2 = frase2.length();
        
        if(longitudFrase1 > longitudFrase2){
            System.out.println("La frase 1 es mayor que la 2");
        }
        else if(longitudFrase1 < longitudFrase2){
            System.out.println("La frase 2 es mayor que la 1");
        }
    }
}

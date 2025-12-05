package ejercicios_presentacion;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1 = new String(""); 
        String palabra2 = new String(""); 
       
        System.out.println("Dime la palabra 1");
        palabra1 = sc.nextLine();
        System.out.println("Dime la palabra 2");
        palabra2 = sc.nextLine();
        boolean iguales = comprobarPalabras(palabra1, palabra2);
        System.out.println(iguales);
    }
    
    public static boolean comprobarPalabras(String palabra1, String palabra2){
        String palabra1_minusc = palabra1.toLowerCase();
        String palabra2_minusc = palabra2.toLowerCase();
       
        if(palabra1_minusc.equals(palabra2_minusc)){
           return true;
        }
        else{
           return false;
        }
    }
}

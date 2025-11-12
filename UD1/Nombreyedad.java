package nombreyedad;

import java.util.Scanner;

    public class Nombreyedad {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nombre = "";
        int edad = 0;
        
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        System.out.println("Hola,");
        System.out.println(nombre);
        System.out.println("Tienes");
        System.out.println(edad);
        System.out.println("anyos,¡Que mayor eres!");
    }
    
}
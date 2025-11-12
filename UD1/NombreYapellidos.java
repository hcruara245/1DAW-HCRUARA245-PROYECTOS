package nombreyapellidos;

import java.util.Scanner;

    public class NombreYapellidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nombre = "";
        String apellido = "";
        
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Dime tu apellido");
        apellido = sc.nextLine();
        System.out.println("Tu nombre y apellidos son:");
        System.out.println(nombre);
        System.out.println(apellido);
    }
    
}

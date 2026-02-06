package adivina_el_numero;

import java.util.Scanner;


    public class Ejercicio1_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        boolean lloviendo = false;
        boolean biblio = false;
        boolean tareas = false;
        
        System.out.println("Esta lloviendo?(true/false)");
        lloviendo = sc.nextBoolean();
        System.out.println("Has acabado tareas?(true/false)");
        tareas = sc.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca?(true/false)");
        biblio = sc.nextBoolean();
        
        if(biblio){
            System.out.println("Puedes salir");
        } 
        else if(!lloviendo && !tareas){
            System.out.println("Puedes salir");
        }
        else {
            System.out.println("No puedes salir");
        }
        
        
        
    }
    
}
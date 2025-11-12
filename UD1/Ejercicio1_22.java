package ejercicio1_22;

import java.util.Scanner;

public class Ejercicio1_22{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int invitados = 0;
            int dinero = 0;
            int precioRefresco = 0;
            boolean invitar = false;
            
            System.out.print("Cuanto dinero tienes?");
            dinero = sc.nextInt();
            System.out.print("Cuanto cuestan los refrescos?");
            precioRefresco = sc.nextInt();
            
            while(dinero > precioRefresco){
                System.out.print("Quieres invitar a un amigo? (true/false)");
                invitar = sc.nextBoolean();
                if(invitar){
                    dinero = dinero - precioRefresco;
                    ++invitados;
                }
                else{
                    break;
                }
            }
            
            System.out.println("Has invitado a: " + invitados + " personas");
            System.out.println("Has gastado: " + (precioRefresco * invitados) + " euros");
            System.out.println("Te quedan: " + dinero + " euros");
            
            
            
    }
    
}
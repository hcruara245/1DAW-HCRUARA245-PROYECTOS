package ejercicio1_16;

import java.util.Scanner;

public class Ejercicio1_16 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero = 0;
            
            
                System.out.println("Dime un numero del 1 al 7");
                numero = sc.nextInt();
                
                switch(numero){
                    case 1:
                        System.out.println("Es lunes");
                        break;
                    case 2:
                        System.out.println("Es martes");
                        break;
                    case 3:
                        System.out.println("Es miercoles");
                        break;
                    case 4:
                        System.out.println("Es jueves");
                        break;
                    case 5:
                        System.out.println("Es viernes");
                        break;
                    case 6:
                        System.out.println("Es sabado");
                        break;
                    case 7:
                        System.out.println("Es domingo");
                        break;
                }
            
    }
    
}
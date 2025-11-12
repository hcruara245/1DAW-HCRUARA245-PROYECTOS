package ejercicio_nombre_edad_alumnos;

import java.util.Scanner;

public class Ejercicio_nombre_edad_alumnos {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int edad = 0;
            int total = 0;
            String nombre = "";
                
                for (int i = 1; i <= 3; i++){
                    System.out.println("Dime el nombre del alumno");
                    nombre = sc.next();
                    System.out.println("Dime la edad");
                    edad = sc.nextInt();
                    total = total + edad;
                }
                
                System.out.println("La edad media es: " + (total/3));
            
    }
    
}
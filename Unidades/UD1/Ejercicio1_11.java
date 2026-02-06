package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio1_11 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilos_manzanas = 0;
        double kilos_peras = 0;
        final double precio_manzanas = 2.35;
        final double precio_peras = 1.95;
        double beneficio_manzanas = 0;
        double beneficio_peras = 0;
        double beneficio_total = 0;
        
        
            System.out.println("Dime la cantidad de kilos de manzanas que has obtenido");
            kilos_manzanas = sc.nextDouble();
            System.out.println("Dime la cantidad de kilos de peras que has obtenido");
            kilos_peras = sc.nextDouble();
            
                    beneficio_manzanas = kilos_manzanas * precio_manzanas;
                    beneficio_peras = kilos_peras * precio_peras;
                    beneficio_total = beneficio_peras + beneficio_manzanas;
                        
                        System.out.println("El beneficio total es de:" + beneficio_total + " euros");
        
    }
    
}

package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio_calcetines {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int talla = 0;
        
        System.out.println("Dime el tamanyo de los calcetines");
        talla = sc.nextInt();
        
            for(int i = 0; i<talla;i++){
                for(int j = 0;j<i;j++){
                }
                System.out.println("*");
            }
            
    }
    
}

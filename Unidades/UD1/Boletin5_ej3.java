package adivina_el_numero;

import java.util.Scanner;

public class Boletin5_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cantidadPar = 0;
        int par = 0;
        
        for(par = 0;cantidadPar <= 20;par++){
            if(par % 2 == 0){
            cantidadPar++;
            System.out.print(par +",");
            }
        }
        
    }
    
}

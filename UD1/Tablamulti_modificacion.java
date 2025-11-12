package tablamulti_modificacion;

import java.util.Scanner;

public class Tablamulti_modificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numini = 0;
        int numfin = 0;
        
        System.out.println("Porque numero empiezo las tablas");
        numini = sc.nextInt();
        System.out.println("En que numero acabo las tablas");
        numfin = sc.nextInt();
        
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla + ":");
            for (int multiplicador = numini; multiplicador <= numfin; multiplicador++) {   
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
            System.out.println(); 
        }
    }
    
}

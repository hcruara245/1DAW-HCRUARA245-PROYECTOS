package examen.eedd.puntos;

import java.util.Scanner;

public class Punto {
    public static void main(String[] params) {
        int equis, y = 6, z = 0;
        //Pide el valor de la variable equis
        System.out.println("Introduce un valor");
        Scanner sc=new Scanner(System.in);
        equis = sc.nextInt();
        imprimirPunto(equis,y,z);
    }
    
    public static void imprimirPunto(int equis, int y, int z) {
        System.out.println("Punto de " + "hugo" );
        System.out.println("(" + equis + "," + y + "," + z + ")");
    }

}
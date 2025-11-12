package ejercicio1_7;

import java.util.Scanner;


    public class Ejercicio1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double longitud = 0;
        double area = 0;
        double radio = 0;
        
        System.out.println("Dime el radio (puede contener decimales)");
        radio = sc.nextFloat();
        longitud = 2*Math.PI * radio;
        System.out.println("La longitud es:" + longitud);
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es:"+ area);
        
        
    }
    
}
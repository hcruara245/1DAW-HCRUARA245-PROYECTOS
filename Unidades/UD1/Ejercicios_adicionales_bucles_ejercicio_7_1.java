package adivina_el_numero;

import java.util.Scanner;

public class Ejercicios_adicionales_bucles_ejercicio_7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el valor maximo del rango: ");
        int valorMax = sc.nextInt();
        System.out.print("Dime el valor minimo del rango: ");
        int valorMin = sc.nextInt();
        System.out.print("Dime un valor del rango: ");
        int valorRango = sc.nextInt();
        
        while(valorRango > valorMax || valorRango < valorMin){
            System.out.println("Tu numero esta fuera del rango");
            System.out.print("Dime otro valor del rango: ");
            valorRango = sc.nextInt();
        }
        
    }
    
}

package ejercicios_presentacion;

import java.util.Scanner;
import java.util.Arrays;

public class coercion5_6 {
    public static void main(String[] args) {
        System.out.println("Dime tus numeros");
        int apuesta[] = apuestaPrimitiva();
        System.out.println("Dime los numeros del premio");
        int ganadora[] = ganadoraPrimitiva();
        int acertadas = aciertoPrimitiva(apuesta, ganadora);
        System.out.println("Tus aciertos son: " + acertadas);
    } 
    public static int aciertoPrimitiva(int apuesta[], int ganadora[]){
        int aciertos = 0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        
        for(int i = 0;i < apuesta.length;i++){
            if(Arrays.binarySearch(ganadora, apuesta[i]) >= 0){
                aciertos++;
                ganadora[i] = 0;
            }
        }
        return aciertos;
    }
    public static int[] apuestaPrimitiva(){
        Scanner sc = new Scanner(System.in);
        int apuesta[] = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Dime el numero " + (i+1) +" : ");
            apuesta[i] = sc.nextInt();
        } 
        return apuesta;
    }
    public static int[] ganadoraPrimitiva(){
        Scanner sc = new Scanner(System.in);
        int ganadora[] = new int[6];
        for (int i = 0; i < ganadora.length; i++) {
            System.out.print("Dime el numero " + (i+1) +" : ");
            ganadora[i] = sc.nextInt();
        }
        return ganadora;
    }
}
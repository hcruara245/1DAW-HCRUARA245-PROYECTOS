package ejercicios_presentacion;

import java.util.Scanner;

public class ejercicio5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud y el rango");
        int longitud = sc.nextInt();
        int rango = sc.nextInt();
        int arrayParesRandom[] = rellenaPares(longitud, rango);
        for(int i = 0;i < arrayParesRandom.length;i++){
            System.out.println(arrayParesRandom[i]);
        }
    }
    
    public static int[] rellenaPares(int longitud, int fin){
        int pares[] = new int[longitud];
        
        for(int i = 0;i < longitud;i++){
            pares[i] = (int)(Math.random() * fin + 2);
            while(pares[i] % 2 != 0){
                pares[i] = (int)(Math.random()* fin + 2);
            }
        }
        return pares;
        
    }
}

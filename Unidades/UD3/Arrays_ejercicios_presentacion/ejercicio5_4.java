package ejercicios_presentacion;

import java.util.Scanner;

public class ejercicio5_4 {
    public static void main(String[] args) {
        int t[] = new int[8];
        int mayor = maximo(t);
        System.out.println(mayor);
    }
    
    public static int maximo(int t[]){
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        for(int i = 0; i < t.length;i++){
            System.out.print("Dime un numero: ");
            t[i] = sc.nextInt();
        }
        
        for (int i = 0; i < t.length; i++) {
            if(t[i] > mayor){
                mayor = t[i];
            }
        }
        
        return mayor;
    }
}

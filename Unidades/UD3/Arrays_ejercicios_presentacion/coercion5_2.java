package ejercicios_presentacion;

import java.util.Scanner;

public class coercion5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double decimales[] = new double[5];
        for(int i = 0; i < decimales.length;i++){
            System.out.print("Dime un numero: ");
            decimales[i] = sc.nextDouble();
        }
        System.out.println(decimales[0]);
        System.out.println(decimales[1]);
        System.out.println(decimales[2]);
        System.out.println(decimales[3]);
        System.out.println(decimales[4]);
    }
}

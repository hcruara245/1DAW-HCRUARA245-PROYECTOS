package ejercicios_presentacion;

import java.util.Scanner;

public class coercion5_3 {
    public static void main(String[] args) {
        int num = numerosIntroducir();        
        int[] arrayEnteros = new int [num];
        introducirNumerosPorTeclado(num, arrayEnteros);
        mostrarArrayReversa(arrayEnteros);
    }
    
    public static int numerosIntroducir(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres introducir: ");
        int num = sc.nextInt();
        return num;
    }
    
    public static int[] introducirNumerosPorTeclado(int num, int arrayEnteros[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < num;i++){
            System.out.print("Dime un numero: ");
            arrayEnteros[i] = sc.nextInt();
        }
        
        return arrayEnteros;
    }
    
    public static void mostrarArrayReversa(int arrayEnteros[]){
        for(int i = arrayEnteros.length - 1;i >= 0;i--){
            System.out.println(arrayEnteros[i]);
        }
    }
}

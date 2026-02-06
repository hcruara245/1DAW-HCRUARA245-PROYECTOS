package ejercicios_presentacion;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio5_8 {
    public static void main(String[] args) {
        int tabla[] = leerTabla();
        leerNumeros(tabla);
        tablaPares(tabla);
        tablaImpares(tabla);
    }
    
    public static int[] leerTabla(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("De cuánto quieres la tabla?: ");
        int tamanyo = sc.nextInt();
        
        int tabla[] = new int[tamanyo];
        return tabla;
    }
    
    public static int[]leerNumeros(int tabla[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < tabla.length;i++){
            System.out.print("Dime el numero: ");
            tabla[i] = sc.nextInt();
        }
        
        return tabla;
    }
    
    public static void tablaPares(int tabla[]){
        ordenarArray(tabla);
        System.out.println("========Tabla Pares=========");
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 2 == 0){
                System.out.println("Numero: " + tabla[i]);
            }
        }
    }
    
    public static void tablaImpares(int tabla[]){
        ordenarArray(tabla);
        System.out.println("========Tabla Impares=========");
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 2 != 0){
                System.out.println("Numero: " + tabla[i]);
            }
        }
    }
    
    public static int[] ordenarArray(int tabla[]){
        Arrays.sort(tabla);
        return tabla;
    }
}

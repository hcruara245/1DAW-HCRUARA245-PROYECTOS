package ejercicios_presentacion;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tabla[] = crearTabla();
        darValoresATabla(tabla);
        System.out.print("Dime el valor para eliminar mayores: ");
        int valor = sc.nextInt();
        int resultado[] = eliminarMayores(tabla, valor);
        for(int i = 0; i < resultado.length; i++){
            System.out.println(resultado[i]);
        }
    }
    
    public static int[] eliminarMayores(int t[], int valor){
        int contador = 0;
        for(int i = 0; i < t.length; i++){
            if(t[i] > valor){
                t[i] = 0;
                contador++;
            }
        }
        Arrays.sort(t);
        
        int[] arrayInvertido = new int[t.length];
        
        for (int i = 0; i < t.length; i++) {
            arrayInvertido[i] = t[t.length - 1 - i];
        }
        
        int resultado[] = new int [arrayInvertido.length - contador];
        
        for(int i = 0;i < resultado.length;i++){
            resultado[i] = arrayInvertido[i];
        }
        
        return resultado;
    }
    
    public static int[] crearTabla(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿De cuánto quieres la tabla?: ");
        int tamanyo = sc.nextInt();
        
        int tabla[] = new int [tamanyo];
        return tabla;
    }
    
    public static int[] darValoresATabla(int t[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < t.length; i++){
            System.out.print("Dime el valor " +(i + 1) +" : ");
            t[i] = sc.nextInt();
        }
        
        return t;
    }
}